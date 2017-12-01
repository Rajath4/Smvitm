package com.smvitm.rajath.smvitm;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

import static android.support.constraint.ConstraintSet.WRAP_CONTENT;

public class BasicScienceFaculty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_basic_science_faculty);






        this.getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);




        setTitle("Department of Basic Science");
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = WRAP_CONTENT;

        getWindow().setLayout((int) (width*0.8), (int) (height));


        Button Physics = (Button)findViewById(R.id.phy);
        Button Chemistry = (Button)findViewById(R.id.che);
        Button Mathematics = (Button)findViewById(R.id.math);

        final Intent pass = new Intent(BasicScienceFaculty.this,Faculty_list.class);


        Physics.setText("Department of Physics");
        Chemistry.setText("Department of Chemistry");
        Mathematics.setText("Department of Mathematics");

        Physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","PHYSICS");
                startActivity(pass);
            }
        });

        Chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","CHEMISTRY");
                startActivity(pass);
            }
        });

        Mathematics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pass.putExtra("branch","MATHEMATICS");
                startActivity(pass);
            }
        });

    }



    @Override
    public boolean onSupportNavigateUp() {
        finish(); // close this activity as oppose to navigating up

        return false;
    }



}
