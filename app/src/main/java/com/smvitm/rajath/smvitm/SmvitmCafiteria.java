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
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.util.ArrayList;

public class SmvitmCafiteria extends AppCompatActivity {

 //   String a[] = new String[5];       //Initiaal declaration
    String a[];
    static String KEY;
    static int no =1;
    int screen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        Intent intent = getIntent();
        KEY = intent.getStringExtra("key");
        if (KEY.equalsIgnoreCase("CAFE")) {
            setContentView(R.layout.smvitm_cafiteria);
            setTitle("SMVITM Cafeteria");
            screen = R.mipmap.smvitm_cafeteria;
        }else if (KEY.equalsIgnoreCase("CLGBUS")) {
            setContentView(R.layout.smvitm_cafiteria);
            setTitle("College Bus");
            screen = R.drawable.clgbus;
        }else {
            setContentView(R.layout.smvitm_cafiteria);
            setTitle("SMVITM Cafeteria");
            screen = R.mipmap.smvitm_cafeteria;

        }


        ListView lv = (ListView)findViewById(R.id.listview);


       final ArrayList<MyBean> list = readJason();


        MyAdapter adapter = new MyAdapter(this, R.layout.smvitm_cafeteria_list_item,list);           //Desined by our own;
        lv.setAdapter(adapter);



    }

    public ArrayList<MyBean> readJason() {
        ArrayList<MyBean> list = new ArrayList<MyBean>();
        try {
           InputStream is;
           String obj;
            if (KEY.equalsIgnoreCase("CAFE")) {
                is = SmvitmCafiteria.this.getAssets().open("smvitm_cafeteria_menu.json");
                obj = "SMVITMCafeteria";
            }else if (KEY.equalsIgnoreCase("CLGBUS")) {
                is = SmvitmCafiteria.this.getAssets().open("smvitm_college_bus.json");
                obj = "collegebustimings";
            }else {
                is = SmvitmCafiteria.this.getAssets().open("smvitm_cafeteria_menu.json");
                obj = "SMVITMCafeteria";
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
                String valueName = object.optString("name");
                String valueId = object.optString("id");
                String valueCost = object.optString("rate");

                MyBean bean =new MyBean();
                bean.setName(valueName);
                bean.setId(valueId);
                bean.setPhno(valueCost);

                list.add(bean);

            }
        }
        catch (Exception e){

        }
        return list;
    }
    public class MyAdapter extends ArrayAdapter<MyBean>
    {
        ArrayList<MyBean> list;
        MyAdapter(Context context,int layout,ArrayList<MyBean> list)
        {
            super(context,layout,list);
            this.list = list;                       //connecting local to global list
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

            if (convertView == null)
            convertView = getLayoutInflater().inflate(R.layout.smvitm_cafeteria_list_item,parent,false);
            TextView tv = (TextView)convertView.findViewById(R.id.textView);
            TextView tv1 = (TextView)convertView.findViewById(R.id.textView1);
            TextView tv2 = (TextView)convertView.findViewById(R.id.textView2);
            ImageView a = (ImageView)convertView.findViewById(R.id.aa);

            MyBean bean = list.get(position);

            String ItemName = bean.getName();
            String SerialNo = bean.getId();
            String  Cosst = bean.getPhno();
            int res;
            if (ItemName.equalsIgnoreCase("abc")){

                res = screen;
                a.setImageResource(res);


                tv.setText("");
                tv1.setText("");
                tv2.setText("");
            }
            else {
                res = 0;
                a.setImageResource(res);


                tv.setText(SerialNo);
                tv1.setText(ItemName);
                tv2.setText(Cosst);
            }

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
