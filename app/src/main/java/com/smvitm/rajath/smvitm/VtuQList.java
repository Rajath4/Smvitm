package com.smvitm.rajath.smvitm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class VtuQList extends AppCompatActivity {

    String KEY;
    WebView webview;
    String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        setContentView(R.layout.activity_vtu_qlist);
        final Intent intent = getIntent();
        KEY = intent.getStringExtra("key");
        Button b1 = (Button)findViewById(R.id.b1);
        Button b2 = (Button)findViewById(R.id.b2);
        Button b3 = (Button)findViewById(R.id.b3);
        Button b4 = (Button)findViewById(R.id.b4);

        setTitle(KEY+" Old Question Paper");

        b1.setText("Civil Engineering");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (KEY.equalsIgnoreCase("3rd Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7eHJaVW9LTEVVVWs";
                }else if (KEY.equalsIgnoreCase("4th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7cVMzZjNVVmVxRGs";

                }else if (KEY.equalsIgnoreCase(("5th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7VDNlbUtnbDZrUk0";
                }
                else if (KEY.equalsIgnoreCase("6th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7czRDc3ppMDgyTWc";
                }else if (KEY.equalsIgnoreCase(("7th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7UmhqYWdqeVRVYlE";
                }else if (KEY.equalsIgnoreCase(("8th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7UlB0LVZOS0JjZ2c";
                }

                Intent i = new Intent(VtuQList.this, GotoWeb.class);
                i.putExtra("key", "QPAPER");
                i.putExtra("url",url);
                startActivity(i);


            }
        });


        b2.setText("Computer Science Engineering");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (KEY.equalsIgnoreCase("3rd Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7QTZha2Npb3BjMzg";
                }else if (KEY.equalsIgnoreCase("4th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7U3dCSWd3ejBiVlk";
                }else if (KEY.equalsIgnoreCase(("5th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7UVBybVV2MWM4TTA";
                }
                else if (KEY.equalsIgnoreCase("6th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7WG45YVJGU1EtMWc";
                }else if (KEY.equalsIgnoreCase(("7th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7VWFsS2lSb1drN1k";
                }else if (KEY.equalsIgnoreCase(("8th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7ZlZEWHVRUHVXUUU";
                }
                Intent i = new Intent(VtuQList.this, GotoWeb.class);
                i.putExtra("key", "QPAPER");
                i.putExtra("url",url);
                startActivity(i);
            }
        });

        b3.setText("Electronics & Communication Engineering");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (KEY.equalsIgnoreCase("3rd Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7a2RUOU5Na05WZ1U";
                }else if (KEY.equalsIgnoreCase("4th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7M2xLc2dYOW5lWWM";
                }else if (KEY.equalsIgnoreCase(("5th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7cmNvYkU1ZTVBYUE";
                }
                else if (KEY.equalsIgnoreCase("6th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7LTJHR3JNaXF6Rzg";
                }else if (KEY.equalsIgnoreCase(("7th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7TmhDSXc2RWxENmc";
                }else if (KEY.equalsIgnoreCase(("8th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7WUZxN3QxN0dwUm8";
                }
                Intent i = new Intent(VtuQList.this, GotoWeb.class);
                i.putExtra("key", "QPAPER");
                i.putExtra("url",url);
                startActivity(i);
            }
        });


        b4.setText("Mechanical Engineering");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (KEY.equalsIgnoreCase("3rd Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7NUVhajc3d0t3aXc";
                }else if (KEY.equalsIgnoreCase("4th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7YjFqNVNndXhPM0k";
                }else if (KEY.equalsIgnoreCase(("5th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7bjJpWjFqZnpqQ3c";
                }
                else if (KEY.equalsIgnoreCase("6th Sem")){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7YlFtdVEyenFHdjA";
                }else if (KEY.equalsIgnoreCase(("7th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7eEVqcE01aVBVRUU";
                }else if (KEY.equalsIgnoreCase(("8th Sem"))){
                    url = "https://drive.google.com/open?id=0B-3NN67q8bD7b3BTbnZyNk1sc1U";
                }
                Intent i = new Intent(VtuQList.this, GotoWeb.class);
                i.putExtra("key", "QPAPER");
                i.putExtra("url",url);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();



        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
      finish();
    }
}
