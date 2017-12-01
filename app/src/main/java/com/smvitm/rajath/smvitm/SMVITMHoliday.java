package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class SMVITMHoliday extends AppCompatActivity {

    //   String a[] = new String[5];       //Initiaal declaration
    String a[];
     static String KEY;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent = getIntent();

        KEY = intent.getStringExtra("key");
        setContentView(R.layout.smvitm_holiday);
        ListView lv = (ListView)findViewById(R.id.listview);



        final ArrayList<MyBean1> list = readJason();


        MyAdapter adapter = new MyAdapter(this, R.layout.smvitm_holiday_list_item,list);           //Desined by our own;
        lv.setAdapter(adapter);



    }

    public ArrayList<MyBean1> readJason() {
        ArrayList<MyBean1> list = new ArrayList<MyBean1>();
        try {

            InputStream is;
            String obj;
            if (KEY.equalsIgnoreCase("HOL")) {
                setTitle("Upcoming Holidays");
                is = SMVITMHoliday.this.getAssets().open("smvitm_holiday.json");
                obj = "holiday";
            }else if (KEY.equalsIgnoreCase("CAL")){
                setTitle("Academic Calender");
                is = SMVITMHoliday.this.getAssets().open("smvitm_calender.json");
                obj = "smvitmcalender";
            }else {
                is = SMVITMHoliday.this.getAssets().open("smvitm_calender.json");
                obj = "smvitmcalender";

            }
            int size = is.available();
            byte[] byteArra = new byte[size];
            is.read(byteArra);
            is.close();
            String buffer = new String(byteArra,"UTF-8");

            JSONObject jsnfil  = new JSONObject(buffer);

            JSONArray array = jsnfil.getJSONArray(obj);
            for (int i =0;i<array.length();i++){
                JSONObject object = array.getJSONObject(i);
                String id = object.optString("id");
                String month = object.optString("month");
                String date = object.optString("date");
                String day = object.optString("day");
                String info = object.optString("info");


                MyBean1 bean1 =new MyBean1();

                bean1.setId(id);
                bean1.setMonth(month);
                bean1.setDate(date);
                bean1.setDay(day);
                bean1.setInfo(info);

                list.add(bean1);

            }
        }
        catch (Exception e){

        }
        return list;
    }
    public class MyAdapter extends ArrayAdapter<MyBean1>
    {
        ArrayList<MyBean1> list;
        MyAdapter(Context context,int layout,ArrayList<MyBean1> list)
        {
            super(context,layout,list);
            this.list = list;                       //connecting local to global list
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if (convertView == null)
                convertView = getLayoutInflater().inflate(R.layout.smvitm_holiday_list_item,parent,false);




            TextView tv = (TextView)convertView.findViewById(R.id.textView);
            TextView tv1 = (TextView)convertView.findViewById(R.id.textView1);
            TextView tv2 = (TextView)convertView.findViewById(R.id.textView2);
            TextView tv3 = (TextView)convertView.findViewById(R.id.textView3);
            TextView tv4 = (TextView)convertView.findViewById(R.id.textView4);

            TextView bg = (TextView)convertView.findViewById(R.id.background);


            MyBean1 bean1 = list.get(position);

/*
            String concat ="Name:"+bean.getName()+"\n"+"Id:"+bean.getId()+"\n"+"Phone Number"+bean.getPhno()+"\n";
*/
            String id = bean1.getId();
            String month = bean1.getMonth();
            String  date = bean1.getDate();
            String day = bean1.getDay();
            String info=bean1.getInfo();

            if (KEY.equalsIgnoreCase("HOL")) {
                if(info.equalsIgnoreCase("Info")) {
                    tv4.setTextColor(Color.parseColor("#212121"));
                    bg.setBackgroundColor(Color.parseColor("#BDBDBD"));
                }else {
                    tv4.setTextColor(Color.parseColor("#212121"));
                }
            }else if (KEY.equalsIgnoreCase("CAL")){
                if(info.equalsIgnoreCase("Info")){
                    tv4.setTextColor(Color.parseColor("#212121"));
                    bg.setBackgroundColor(Color.parseColor("#BDBDBD"));


                }else {
                    if(!info.equalsIgnoreCase("")) {
                        if(info.equalsIgnoreCase("3 - IA")){
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else if(info.equalsIgnoreCase("2 - IA")) {
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else if(info.equalsIgnoreCase("1 - IA")){
                            bg.setBackgroundColor(Color.parseColor("#FFCCBC"));
                        }else {
                            bg.setBackgroundColor(Color.parseColor("#EEEEEE"));
                        }
                    }else {
                        bg.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    }
                }

            }



            tv.setText(id);
            tv1.setText(month);
            tv2.setText(date);
            tv3.setText(day);
            tv4.setText(info);

            return convertView;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();



        return super.onOptionsItemSelected(item);
    }
}
