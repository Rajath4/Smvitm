package com.smvitm.rajath.smvitm;

import android.app.ActionBar;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.DisplayMetrics;
import android.view.MenuItem;

import static android.support.constraint.ConstraintSet.WRAP_CONTENT;

public class AboutApplication extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_application);

        this.getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        setTitle("About");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = WRAP_CONTENT;




        getWindow().setLayout((int) (width*0.8), (int) (height));



        NavigationView abt = (NavigationView)findViewById(R.id.aboutapplication);
        abt.setNavigationItemSelectedListener(AboutApplication.this);








    }







    @Override
    public boolean onSupportNavigateUp() {
        super.onBackPressed();

        return false;
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.PersonalizeTimeTable){
            AlertDialog.Builder b=new AlertDialog.Builder(AboutApplication.this);
            b.setIcon(R.mipmap.ic_launcher);
            b.setTitle("Reset Timetable");
            b.setCancelable(false);
            b.setMessage("Are you sure want to reset timetable ?");
            b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
                    final SharedPreferences.Editor editor = loginData.edit();
                    editor.clear();
                    editor.commit();
                    finish();
                    startActivity(new Intent(AboutApplication.this,Login.class));
                }
            });
            b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            b.create();
            b.show();
        }else if(id == R.id.Settings){
            finish();
            startActivity(new Intent(AboutApplication.this,Setting.class));
        }else if(id == R.id.AboutDevelopers){
            finish();
            startActivity(new Intent(AboutApplication.this,AboutDevelopresActivity.class));

        }



        return false;
    }
}
