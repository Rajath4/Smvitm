package com.smvitm.rajath.smvitm;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class WebsiteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
        setTitle("Websites");
        Button b1 =(Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!MainActivity.checkInternetConnection(WebsiteActivity.this)) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(WebsiteActivity.this);
                    alertDialog.setIcon(R.mipmap.ic_launcher);
                    alertDialog.setTitle("Connection Error!");
                    alertDialog.setMessage("Internet Connection is not available");
                    alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    alertDialog.setCancelable(false).create().show();
                } else {
                    Intent res = new Intent(WebsiteActivity.this, ViewWebsite.class);
                    res.putExtra("key", "VTURES");
                    startActivity(res);
                }
            }
        });

        Button b2 =(Button) findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!MainActivity.checkInternetConnection(WebsiteActivity.this)) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(WebsiteActivity.this);
                    alertDialog.setIcon(R.mipmap.ic_launcher);
                    alertDialog.setTitle("Connection Error!");
                    alertDialog.setMessage("Internet Connection is not available");
                    alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    alertDialog.setCancelable(false).create().show();
                } else {
                    Intent vtuweb = new Intent(WebsiteActivity.this, ViewWebsite.class);
                    vtuweb.putExtra("key", "VTUWEB");
                    startActivity(vtuweb);
                }
            }
        });

        Button b3 =(Button) findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!MainActivity.checkInternetConnection(WebsiteActivity.this)) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(WebsiteActivity.this);
                    alertDialog.setIcon(R.mipmap.ic_launcher);
                    alertDialog.setTitle("Connection Error!");
                    alertDialog.setMessage("Internet Connection is not available");
                    alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    alertDialog.setCancelable(false).create().show();
                } else {
                    Intent smvweb = new Intent(WebsiteActivity.this, ViewWebsite.class);
                    smvweb.putExtra("key", "CLGWEB");
                    startActivity(smvweb);

                }
            }
        });

        Button b4 =(Button) findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!MainActivity.checkInternetConnection(WebsiteActivity.this)) {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(WebsiteActivity.this);
                    alertDialog.setIcon(R.mipmap.ic_launcher);
                    alertDialog.setTitle("Connection Error!");
                    alertDialog.setMessage("Internet Connection is not available");
                    alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    alertDialog.setCancelable(false).create().show();
                } else {
                    Intent vtucir = new Intent(WebsiteActivity.this, ViewWebsite.class);
                    vtucir.putExtra("key", "VTUCIR");
                    startActivity(vtucir);
                }
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
