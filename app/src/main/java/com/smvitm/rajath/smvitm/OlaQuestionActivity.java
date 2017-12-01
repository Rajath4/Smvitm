package com.smvitm.rajath.smvitm;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class OlaQuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ola_question);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if(getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }




        Button b1 = (Button)findViewById(R.id.b12);
        Button b2 = (Button)findViewById(R.id.b3);
        Button b3 = (Button)findViewById(R.id.b4);
        Button b4 = (Button)findViewById(R.id.b5);
        Button b5 = (Button)findViewById(R.id.b6);
        Button b6 = (Button)findViewById(R.id.b7);
        Button b7 = (Button)findViewById(R.id.b8);

        setTitle("Old Question Paper");
        Toast.makeText(this, "To Get Customized Old Question Paper Click on Subject name in Time Table", Toast.LENGTH_SHORT).show();

        b1.setText("1 & 2nd Sem");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, GotoWeb.class);
                i.putExtra("key", "QPAPER");
                i.putExtra("url","https://drive.google.com/open?id=0B-3NN67q8bD7OVo4MEZLUjY5Zjg");
                startActivity(i);
            }
        });

        b2.setText("3rd Sem");
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","3rd Sem");
                startActivity(i);
            }
        });

        b3.setText("4th Sem");
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","4th Sem");
                startActivity(i);
            }
        });

        b4.setText("5th Sem");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","5th Sem");
                startActivity(i);
            }
        });

        b5.setText("6th Sem");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","6th Sem");
                startActivity(i);
            }
        });

        b6.setText("7th Sem");
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","7th Sem");
                startActivity(i);
            }
        });

        b7.setText("8th Sem");
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OlaQuestionActivity.this, VtuQList.class);
                i.putExtra("key","8th Sem");
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
