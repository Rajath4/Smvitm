package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class Faculty_list extends AppCompatActivity {
    static String Branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        Branch = intent.getStringExtra("branch");

        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }




        setContentView(R.layout.activity_faculty_list);
        ListView lv = (ListView)findViewById(R.id.listview);
        final ArrayList<MyImageBean> list = readJason();
        MyAdapter adapter = new MyAdapter(this,R.layout.faculty_listview_outline,list);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MyImageBean bean = list.get(position);
                Intent gotoNext = new Intent(Faculty_list.this,FacultyInfoDisplay.class);
                gotoNext.putExtra("facultyname",bean.getItemName());
                gotoNext.putExtra("facultydesignation",bean.getDesignation());
                gotoNext.putExtra("education",bean.getEducationalQualification());
                gotoNext.putExtra("areaofspecification",bean.getAreaofSpecialization());
                gotoNext.putExtra("experience",bean.getExperience());
                gotoNext.putExtra("memberships",bean.getMemberships());
                gotoNext.putExtra("awards",bean.getAwards());
                gotoNext.putExtra("areaofinterest",bean.getAreaOfInterest());
                gotoNext.putExtra("publication",bean.getPublications());
                gotoNext.putExtra("nopg",bean.getNoofPGPhDThesesguided());
                gotoNext.putExtra("contactinfo",bean.getContactDetails());
                startActivity(gotoNext);

            }
        });




    }

    public ArrayList<MyImageBean> readJason() {
        ArrayList<MyImageBean> list = new ArrayList<MyImageBean>();
        try {
            InputStream is;
            String filename;
            if (Branch.equalsIgnoreCase("CSE")) {
                 is = Faculty_list.this.getAssets().open("smvitm_faculty.json");
                filename = "deptofcse";
                setTitle("Department of Computer Science Engineering");

            }else if(Branch.equalsIgnoreCase("EC"))
            {
                 is = Faculty_list.this.getAssets().open("ec_faculty.json");
                filename = "deptofec";
                setTitle("Department of Electronics & Communication Engineering");
            }
            else if(Branch.equalsIgnoreCase("CV"))
            {
                is = Faculty_list.this.getAssets().open("cv_faculty.json");
                filename = "deptofcv";
                setTitle("Department of Civil Engineering");
            }
            else if(Branch.equalsIgnoreCase("ME"))
            {
                is = Faculty_list.this.getAssets().open("me_faculty.json");
                filename = "deptofme";
                setTitle("Department of Mechanical Engineering");
            }
            else if(Branch.equalsIgnoreCase("CHEMISTRY"))
            {
                is = Faculty_list.this.getAssets().open("chemistry_faculty.json");
                filename = "deptofchemistry";
                setTitle("Department of Chemistry");
            }
            else if(Branch.equalsIgnoreCase("MATHEMATICS"))
            {
                is = Faculty_list.this.getAssets().open("ma_faculty.json");
                filename = "deptofma";
                setTitle("Department of Mathematics");
            }
            else if(Branch.equalsIgnoreCase("PHYSICS"))
            {
                is = Faculty_list.this.getAssets().open("phy_faculty.json");
                filename = "deptofphy";
                setTitle("Department of Physics");
            }
            else
            {
                is = Faculty_list.this.getAssets().open("ec_faculty.json");
                filename = "deptofcse";
            }

            int size = is.available();
            byte[] byteArra = new byte[size];
            is.read(byteArra);
            is.close();
            String buffer = new String(byteArra,"UTF-8");

            JSONObject jsnfil  = new JSONObject(buffer);

            JSONArray array = jsnfil.getJSONArray(filename);
            for (int i =0;i<array.length();i++){
                JSONObject object = array.getJSONObject(i);

                String SvalueName = object.optString("name");
                String SDesignation = object.optString("Designation");
                String SEducationalQualification = object.optString("EducationalQualification");
                String SAreaOfSpecialization = object.optString("AreaofSpecialization");
                String SExperience = object.optString("Experience");
                String SMemberships = object.optString("Memberships");
                String SAward = object.optString("Awards");
                String SAreaOfInterest = object.optString("AreaOfInterest");
                String SPublications = object.optString("Publications");
                String SNoOfPhd = object.optString("NoofPGPhDThesesguided");
                String SContactDetail = object.optString("ContactDetails");


                MyImageBean bean1 =new MyImageBean();
                bean1.setItemName(SvalueName);
                bean1.setDesignation(SDesignation);
                bean1.setAreaOfInterest(SAreaOfInterest);
                bean1.setAreaofSpecialization(SAreaOfSpecialization);
                bean1.setExperience(SExperience);
                bean1.setMemberships(SMemberships);
                bean1.setAwards(SAward);
                bean1.setEducationalQualification(SEducationalQualification);
                bean1.setPublications(SPublications);
                bean1.setNoofPGPhDThesesguided(SNoOfPhd);
                bean1.setContactDetails(SContactDetail);

                list.add(bean1);

            }
        }
        catch (Exception e){

        }
        return list;
    }
    public class MyAdapter extends ArrayAdapter<MyImageBean>
    {

        ArrayList<MyImageBean> list;
        MyAdapter(Context context,int layout,ArrayList<MyImageBean> list)
        {
            super(context,layout,list);
            this.list = list;                       //connecting local to global list
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if (convertView == null)
                convertView = getLayoutInflater().inflate(R.layout.faculty_listview_outline,parent,false);
            TextView tv = (TextView)convertView.findViewById(R.id.facultydesignation);
            TextView tv1 = (TextView)convertView.findViewById(R.id.facultyname);

            ImageView icon = (ImageView)convertView.findViewById(R.id.facultyicon);

            MyImageBean bean = list.get(position);

/*
            String concat ="Name:"+bean.getName()+"\n"+"Id:"+bean.getId()+"\n"+"Phone Number"+bean.getPhno()+"\n";
*/
            String ItemName = bean.getItemName();
            String Designation = bean.getDesignation();
            String EducationalQualification = bean.getEducationalQualification();
            String AreaofSpecialization = bean.getAreaofSpecialization();
            String Experience = bean.getExperience();
            String Memberships = bean.getMemberships();
            String Awards = bean.getAwards();
            String AreaOfInterest = bean.getAreaOfInterest();
            String Publications = bean.getPublications();
            String NoofPGPhDThesesguided = bean.getNoofPGPhDThesesguided();
            String ContactDetails = bean.getContactDetails();







            //int Imageres = bean.getImgres();
            int Imageres;
            if(ItemName.equalsIgnoreCase("Dr. VASUDEVA")){Imageres = R.drawable.cs_vasudeva;}
            else if (ItemName.equalsIgnoreCase("Mr. VENUGOPALA RAO A. S")){Imageres = R.drawable.cs_venugopala;}
            else if (ItemName.equalsIgnoreCase("Mr. SHRINIVASA")){Imageres = R.drawable.cs_srinivasarao;}
            else if (ItemName.equalsIgnoreCase("Mr. SIJU V SOMAN")){Imageres =R.drawable.cs_siju;}
            else if (ItemName.equalsIgnoreCase("Mr. JAYARAM C V")){Imageres =R.drawable.cs_jayaram;}
            else if (ItemName.equalsIgnoreCase("Ms. YASHASWINI JOGI")){Imageres =R.drawable.cs_yashasvini;}
            else if (ItemName.equalsIgnoreCase("Ms. SAHANA KARANTH")){Imageres = R.drawable.cs_sahanakaranth;}
            else if (ItemName.equalsIgnoreCase("Mr. DEEPAK RAO M")){Imageres = R.drawable.cs_deepak_rao;}
            else if (ItemName.equalsIgnoreCase("Ms. PRIYANKA")){Imageres = R.drawable.cs_priyanka;}
            else if (ItemName.equalsIgnoreCase("Mr. PRAVEEN M NAIK")){Imageres = R.drawable.cs_praveennaik;}
            else if (ItemName.equalsIgnoreCase("Mr. RAMA MOORTHY H")){Imageres = R.drawable.cs_ramurty;}
            else if (ItemName.equalsIgnoreCase("Ms.TEJASWINI H")){Imageres = R.drawable.cs_tejaswini;}
            else if (ItemName.equalsIgnoreCase("Mr. NAGARAJ BHAT")){Imageres = R.drawable.cs_nagrajbhat;}
            else if (ItemName.equalsIgnoreCase("Mr. SHARATH KUMAR")){Imageres = R.drawable.cs_sharath;}
            else if (ItemName.equalsIgnoreCase("Ms. RAMYA D SHETTY")){Imageres = R.drawable.cs_ramyad;}
            else if (ItemName.equalsIgnoreCase("Mr. B N RAMACHANDRA")){Imageres = R.drawable.cs_ramachandra;}
            else if (ItemName.equalsIgnoreCase("Mr. MANOJ T")){Imageres = R.drawable.cs_manoj;}
            else if (ItemName.equalsIgnoreCase("Ms.SHINNY MELITA DSOUZA")){Imageres = R.drawable.cs_shiny;}
            else if (ItemName.equalsIgnoreCase("Ms. SWATHI PRABHU")){Imageres = R.drawable.cs_swathi;}
            else if (ItemName.equalsIgnoreCase("Ms. KAVYASHREE")){Imageres = R.drawable.cs_kavyashree;}
            else if (ItemName.equalsIgnoreCase("Ms. RAMYASHREE")){Imageres = R.drawable.cs_ramyashree;}
            else if (ItemName.equalsIgnoreCase("Ms. SNEHA N S")){Imageres = R.drawable.cs_shneha;}
            else if (ItemName.equalsIgnoreCase("Ms. SINDHURA D N")){Imageres = R.drawable.cs_sindura;}
            else if (ItemName.equalsIgnoreCase("Ms. SOWMYA S")){Imageres = R.drawable.cs_sowmya;}
            else if (ItemName.equalsIgnoreCase("Ms. ANUJNA RAO")){Imageres = R.drawable.cs_anujna;}
            else if (ItemName.equalsIgnoreCase("Ms. RUKMINI BALLAL")){Imageres = R.drawable.cs_rukmini;}






            else if (ItemName.equalsIgnoreCase("Dr. BALACHANDRA ACHAR H V")){Imageres = R.drawable.ec_balachandra;}
            else if (ItemName.equalsIgnoreCase("Mr. NAGARAJA RAO")){Imageres = R.drawable.ec_nagraj;}
            else if (ItemName.equalsIgnoreCase("Mr. RAJESH NAYAK")){Imageres = R.drawable.ec_rajeshnayak;}
            else if (ItemName.equalsIgnoreCase("Ms. SHASHIKALA R")){Imageres = R.drawable.ec_shashikala;}
            else if (ItemName.equalsIgnoreCase("Mr. CHETAN R")){Imageres = R.drawable.ec_chetan;}
            else if (ItemName.equalsIgnoreCase("Mr. KRISHNA KUMAR P")){Imageres = R.drawable.ec_krishnakumar;}
            else if (ItemName.equalsIgnoreCase("Ms. RASHMI K R")){Imageres = R.drawable.ec_laxmikr;}
            else if (ItemName.equalsIgnoreCase("Mr. SANDESH KUMAR")){Imageres = R.drawable.ec_sandesh;}
            else if (ItemName.equalsIgnoreCase("Ms. SHAREEN NORONHA")){Imageres = R.drawable.ec_sharin;}
            else if (ItemName.equalsIgnoreCase("Mr.ARUN UPADHYAYA")){Imageres = R.drawable.ec_arunupadhya;}
            else if (ItemName.equalsIgnoreCase("Mr. SACHIN BHAT")){Imageres = R.drawable.ec_sachinbhat;}
            else if (ItemName.equalsIgnoreCase("Mr.SACHIN PRABHU K")){Imageres = R.drawable.ec_sachinbhrabhu;}
            else if (ItemName.equalsIgnoreCase("Mr.VINAYA KUMAR S R")){Imageres = R.drawable.ec_vinay;}
            else if (ItemName.equalsIgnoreCase("Ms. VRUNDA ADKAR D")){Imageres = R.drawable.ec_vrundaadkard;}
            else if (ItemName.equalsIgnoreCase("Ms. RAJASHREE NAMBIAR P")){Imageres = R.drawable.ec_rajashree;}
            else if (ItemName.equalsIgnoreCase("Ms. SOWMYA BHAT")){Imageres = R.drawable.ec_sowyabhat;}
            else if (ItemName.equalsIgnoreCase("Mr. GANESH S SHETTY")){Imageres = R.drawable.ec_ganesh;}
            else if (ItemName.equalsIgnoreCase("Ms. KUSUMA PRABHU")){Imageres = R.drawable.ec_kusumaprabhu;}
            else if (ItemName.equalsIgnoreCase("Mr. RANJITH BHAT")){Imageres = R.drawable.ec_rajeshbhat;}
            else if (ItemName.equalsIgnoreCase("Ms. LAXMI SHETTY")){Imageres = R.drawable.ec_laxmi;}
            else if (ItemName.equalsIgnoreCase("Mr. RAGHAVENDRA RAO P")){Imageres = R.drawable.ec_raghavendra;}
            else if (ItemName.equalsIgnoreCase("Mr. AVINASH N J")){Imageres = R.drawable.ec_avinash;}
            else if (ItemName.equalsIgnoreCase("Ms. RENITA PINTO")){Imageres = R.drawable.ec_renita_pinto;}






            else if (ItemName.equalsIgnoreCase("Dr. B RADHESHYAM")){Imageres = R.drawable.cv_radheshyam;}
            else if (ItemName.equalsIgnoreCase("Mr. ANAND V R")){Imageres = R.drawable.cv_anand;}
            else if (ItemName.equalsIgnoreCase("Mr. MADHUSOODHANA RAO N")){Imageres = R.drawable.cv_madhusudhan;}
            else if (ItemName.equalsIgnoreCase("Ms. DEEPIKA B.V")){Imageres = R.drawable.cv_dipika;}
            else if (ItemName.equalsIgnoreCase("Mr. SUNIL S HALDANKAR")){Imageres = R.drawable.cv_sunil;}
            else if (ItemName.equalsIgnoreCase("Mr. RAVI KUMAR")){Imageres = R.drawable.cv_ravikumar;}
            else if (ItemName.equalsIgnoreCase("Mr. VIGNESH SHENOY B")){Imageres = R.drawable.cv_vignesh;}
            else if (ItemName.equalsIgnoreCase("Ms. AKSHITHA")){Imageres = R.drawable.cv_akshita;}
            else if (ItemName.equalsIgnoreCase("Ms. NISHITHA J D’SOUZA")){Imageres = R.drawable.cv_nishita;}
            else if (ItemName.equalsIgnoreCase("Ms. ANUSHA B RAO")){Imageres = R.drawable.cv_anusha;}
            else if (ItemName.equalsIgnoreCase("Mr.Deviprakash Upadhyaya")){Imageres = R.drawable.cv_deviprasad;}
            else if (ItemName.equalsIgnoreCase("Mr.ULLAS S L")){Imageres = R.drawable.cv_ullas;}


            else if (ItemName.equalsIgnoreCase("Dr. K K SRINIVASAN")){Imageres = R.drawable.che_srinivasan;}
            else if (ItemName.equalsIgnoreCase("Dr. Reena Kumari P. D.")){Imageres = R.drawable.che_reena;}
            else if (ItemName.equalsIgnoreCase("Ms. SUBBULAKSHMI N KARANTH")){Imageres = R.drawable.che_subbulaxmi;}
            else if (ItemName.equalsIgnoreCase("Ms. RAVIPRABHA K")){Imageres = R.drawable.che_raviprabha;}


            else if (ItemName.equalsIgnoreCase("Dr. LOLITA PRIYA CASTELINO")){Imageres = R.drawable.ma_lolita;}
            else if (ItemName.equalsIgnoreCase("Ms. RENITA SHARON MONIS")){Imageres = R.drawable.ma_renita;}
            else if (ItemName.equalsIgnoreCase("Ms. BHAGYALAKSHMI NAVADA")){Imageres = R.drawable.ma_bhagyalaxmi;}
            else if (ItemName.equalsIgnoreCase("Ms. DHANYASHREE VINAY")){Imageres = R.drawable.ma_divyashree;}
            else if (ItemName.equalsIgnoreCase("Ms. P AISHWARYA")){Imageres = R.drawable.ma_ashwarya;}
            else if (ItemName.equalsIgnoreCase("Ms. NISHA REENA NAZARETH")){Imageres = R.drawable.ma_nisha;}



            else if (ItemName.equalsIgnoreCase("Dr. RAVINDRA H. J.")){Imageres = R.drawable.phy_ravindra;}
            else if (ItemName.equalsIgnoreCase("Ms. Sandhya")){Imageres = R.drawable.phy_sandhya;}
            else if (ItemName.equalsIgnoreCase("Ms. USHA PARVATHI A")){Imageres = R.drawable.phy_ushapar;}
            else if (ItemName.equalsIgnoreCase("Ms. USHA H")){Imageres = R.drawable.phy_ushah;}



            else if (ItemName.equalsIgnoreCase("Dr. THIRUMALESHWARA BHAT")){Imageres = R.drawable.mech_tirumaleshwara;}
            else if (ItemName.equalsIgnoreCase("Dr. SUDARSHAN RAO K.")){Imageres = R.drawable.mech_sudharshan;}
            else if (ItemName.equalsIgnoreCase("Mr. PAVAN KUMAR")){Imageres = R.drawable.mech_pavan;}
            else if (ItemName.equalsIgnoreCase("Mr. PRAVEEN J KALAMDANI")){Imageres = R.drawable.mech_praveen;}
            else if (ItemName.equalsIgnoreCase("Mr. RAVINARAYAN R RAO")){Imageres = R.drawable.mech_ravinarayan;}
            else if (ItemName.equalsIgnoreCase("Mr. SUDHIR")){Imageres = R.drawable.mech_sudheer;}
            else if (ItemName.equalsIgnoreCase("Mr. ADITYA KUDVA S")){Imageres = R.drawable.mech_adytya;}
            else if (ItemName.equalsIgnoreCase("Mr. LINGARAJ RITTI")){Imageres = R.drawable.mech_lingaraju;}
            else if (ItemName.equalsIgnoreCase("Mr. KISHOR KUMAR AROOR")){Imageres = R.drawable.mech_kishor;}
            else if (ItemName.equalsIgnoreCase("Mr. RAJA YATEESH YADAV")){Imageres = R.drawable.mech_raja;}
            else if (ItemName.equalsIgnoreCase("Mr. V. VIJENDRA BHAT")){Imageres = R.drawable.mech_vijendra;}
            else if (ItemName.equalsIgnoreCase("Mr. GANESH KALAGI")){Imageres = R.drawable.mech_ganesh;}
            else if (ItemName.equalsIgnoreCase("Mr. MANJUNATH S")){Imageres = R.drawable.mech_manjunath;}
            else if (ItemName.equalsIgnoreCase("Mr. MADHUKAR NAYAK")){Imageres = R.drawable.mech_madhukar;}
            else if (ItemName.equalsIgnoreCase("Mr. NARAYAN NAYAK")){Imageres = R.drawable.mech_narayan;}
            else if (ItemName.equalsIgnoreCase("Mr. SHARATH D SHETTY")){Imageres = R.drawable.mech_sharath;}
            else if (ItemName.equalsIgnoreCase("Mr. MALLYA ANANTH MOHAN")){Imageres = R.drawable.mech_anathh;}
            else if (ItemName.equalsIgnoreCase("Mr. KARTHIK V")){Imageres = R.drawable.mech_karthik;}
            else if (ItemName.equalsIgnoreCase("Mr.KIRAN N BHAT")){Imageres = R.drawable.mech_kiran;}

            else{Imageres = R.drawable.ic_person_black_24dp;}





            tv.setText(Designation);
            tv1.setText(ItemName);
            icon.setImageResource(Imageres);




            return convertView;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if (item.getItemId()==android.R.id.home)
            super.onBackPressed();

        return super.onOptionsItemSelected(item);
    }




    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)

            super.onBackPressed();



        return super.onOptionsItemSelected(item);
    }*/
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
