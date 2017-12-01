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

public class DepartmentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_department_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button b1,b2,b3,b4,b5;


            if(getSupportActionBar() !=null){
                getSupportActionBar().setDisplayHomeAsUpEnabled(true);
                getSupportActionBar().setDisplayShowHomeEnabled(true);
            }
            setTitle("Teaching Staff");





            final Intent pass = new Intent(DepartmentListActivity.this,Faculty_list.class);
            final Intent pass1 = new Intent(DepartmentListActivity.this,BasicScienceFaculty.class);

            b1 = (Button)findViewById(R.id.button);
            b1.setText("Department of Civil Engineering");
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass.putExtra("branch","CV");
                    startActivity(pass);
                }
            });
            b2 = (Button)findViewById(R.id.button2);
            b2.setText("Department of Computer Science Engineering");
            b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass.putExtra("branch","CSE");
                    startActivity(pass);
                }
            });
            b3 = (Button)findViewById(R.id.button3);
            b3.setText("Department of Electronics & Communication Engineering");
            b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass.putExtra("branch","EC");
                    startActivity(pass);
                }
            });
            b4 = (Button)findViewById(R.id.button4);
            b4.setText("Department of Mechanical Engineering");
            b4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    pass.putExtra("branch","ME");
                    startActivity(pass);
                }
            });
            b5 = (Button)findViewById(R.id.button5);
            b5.setText("Department of Basic Science");
            b5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(pass1);
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
            super.onBackPressed();
        }
}
