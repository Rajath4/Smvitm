package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Paint;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;


import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private Button AnsBr,AnsYr,AnsSec,Submit,qbr;
    static String br,yr="a",se ;
    Boolean aa=false,bb=false,cc=false;
    private FirebaseAnalytics mFirebaseAnalytics;
    Button Day,sub1,sub2,sub3,sub4,sub5,sub6,sub7,sub8;
    Button pb1,pb2,pb3,pb4,pb5,pb6,pb7,pb8,prevDay,nextDay;
    String year;
    String branch;
    String section;
    Intent isub1,isub2,isub3,isub4,isub5,isub6,isub7,isub8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        Menu menu = navigationView.getMenu();


        for(int i = 0; i < menu.size(); i++) {
            MenuItem item = menu.getItem(i);
            SpannableString spanString = new SpannableString(menu.getItem(i).getTitle().toString());
            spanString.setSpan(new ForegroundColorSpan(Color.parseColor("#FF4081")), 0, spanString.length(), 0); //fix the color to white
            item.setTitle(spanString);
        }



        navigationView.setNavigationItemSelectedListener(this);
        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = loginData.edit();


        year = loginData.getString("yeAr", "");
        branch = loginData.getString("branCh", "");
        section = loginData.getString("sectiOn", "");
        final Boolean z = loginData.getBoolean("Data", false);
        if (!z) {

            startActivity(new Intent(MainActivity.this,Login.class));



        }else {
            pb1 = (Button)findViewById(R.id.p1);
            pb2 = (Button)findViewById(R.id.p2);
            pb3 = (Button)findViewById(R.id.p3);
            pb4 = (Button)findViewById(R.id.p4);
            pb5 = (Button)findViewById(R.id.p5);
            pb6 = (Button)findViewById(R.id.p6);
            pb7 = (Button)findViewById(R.id.p7);
            pb8 = (Button)findViewById(R.id.p8);
            prevDay = (Button)findViewById(R.id.previousday);
            nextDay = (Button)findViewById(R.id.nextday);


            Day = (Button)findViewById(R.id.day);
            sub1 = (Button)findViewById(R.id.sub1);
            sub2 = (Button)findViewById(R.id.sub2);
            sub3 = (Button)findViewById(R.id.sub3);
            sub4 = (Button)findViewById(R.id.sub4);
            sub5 = (Button)findViewById(R.id.sub5);
            sub6 = (Button)findViewById(R.id.sub6);
            sub7 = (Button)findViewById(R.id.sub7);
            sub8 = (Button)findViewById(R.id.sub8);



            isub1 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub2 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub3 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub4 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub5 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub6 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub7 = new Intent(MainActivity.this,SubInformationActivity.class);
            isub8 = new Intent(MainActivity.this,SubInformationActivity.class);



            String weekDay = "";

            Calendar c = Calendar.getInstance();
            int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
            int time = c.get(Calendar.HOUR_OF_DAY);


            if (Calendar.MONDAY == dayOfWeek) {
                weekDay = "Monday";
            } else if (Calendar.TUESDAY == dayOfWeek) {
                weekDay = "Tuesday";
            } else if (Calendar.WEDNESDAY == dayOfWeek) {
                weekDay = "Wednesday";
            } else if (Calendar.THURSDAY == dayOfWeek) {
                weekDay = "Thursday";
            } else if (Calendar.FRIDAY == dayOfWeek) {
                weekDay = "Friday";
            } else if (Calendar.SATURDAY == dayOfWeek) {
                weekDay = "Saturday";
            } else if (Calendar.SUNDAY == dayOfWeek) {
                weekDay = "Sunday";
            }


            switch (weekDay) {
                case "Monday":
                    if (time<16) {
                        showtimetable("Monday");

                    }else {
                        showtimetable("Tuesday");
                    }
                    break;
                case "Tuesday":if (time<16) {
                    showtimetable("Tuesday");

                }else {
                    showtimetable("Wednesday");
                }
                    break;
                case "Wednesday":if (time<16) {

                    showtimetable("Wednesday");
                }else {
                    showtimetable("Thursday");
                }
                    break;
                case "Thursday":
                    if (time<16) {
                        showtimetable("Thursday");
                    }else {
                        showtimetable("Friday");
                    }
                    break;
                case "Friday":
                    if (time<16) {
                        showtimetable("Friday");
                    }else {
                        SuperSaturday("Saturday");
                    }
                    break;
                case "Saturday":
                    if (time<14) {
                        SuperSaturday("Saturday");
                    }else {
                        showtimetable("Monday");
                    }
                    break;
                case "Sunday":
                    showtimetable("Monday");
                    break;
            }

        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
            b.setIcon(R.mipmap.ic_launcher);
            b.setTitle("Confirm Exit");
            b.setCancelable(false);
            b.setMessage("Are you sure want to exit ?");
            b.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    /*finishAffinity();
                    finish();
                    System.exit(0);*/

                    Intent intent = new Intent(Intent.ACTION_MAIN);
                    intent.addCategory(Intent.CATEGORY_HOME);
                    startActivity(intent);

                }
            });
            b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                }
            });


            b.create();
            b.show();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.about_application) {
            startActivity(new Intent(MainActivity.this,Setting.class));
            return true;
        }else if (id == R.id.about_developer) {
            startActivity(new Intent(MainActivity.this,AboutDevelopresActivity.class));
            return true;
        }else if (id == R.id.about_smvitm) {
            startActivity(new Intent(MainActivity.this,AboutSMVITMActivity.class));
            return true;
        }else if (id == R.id.action_account){
            AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
            setTitleColor(R.color.colorAccent);
            b.setTitle("About User");
            b.setMessage("Year : "+year+"\nSection : "+section+"\nBranch : "+branch);
            b.setIcon(R.drawable.ic_person_black_24dp);
            b.setNegativeButton("Reset", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
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
                            startActivity(new Intent(MainActivity.this,Login.class));
                        }
                    });
                    b.setNegativeButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
                    b.create();
                    b.show();
                }
            });
            b.setPositiveButton("Close", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                }
            });
            b.create();
            b.show();
            return true;
        }else if (id == R.id.action_event){
            if (!MainActivity.checkInternetConnection(this)) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
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
                startActivity(new Intent(MainActivity.this, ActivitySmvitmEventsManeger.class));
            }
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();



       /* if (id == R.id.monmenu) {showtimetable("Monday");}
        else if (id == R.id.tuemeu) {showtimetable("Tuesday");}
        else if (id == R.id.wedmenu) {showtimetable("Wednesday");}
        else if (id == R.id.thusmenu) {showtimetable("Thursday");}
        else if (id == R.id.frimenu) {showtimetable("Friday");}
        else if (id == R.id.satmenu) {SuperSaturday("Saturday");}
        else */if (id == R.id.smvitmcafeteria){
            Intent smvitmcafe = new Intent(MainActivity.this,SmvitmCafiteria.class);
            smvitmcafe.putExtra("key","CAFE");
            startActivity(smvitmcafe);
        }else if (id == R.id.smvitmbus){
            Intent clgbus = new Intent(MainActivity.this,SmvitmCafiteria.class);
            clgbus.putExtra("key","CLGBUS");
            startActivity(clgbus);
        }else if (id == R.id.oldp){

            Intent smvweb = new Intent(MainActivity.this,OlaQuestionActivity.class);
            startActivity(smvweb);

        }else if (id == R.id.smvitmbook){startActivity(new Intent(MainActivity.this,Clg_BookActivity.class));}
        else if (id == R.id.upholy){
            Intent calen = new Intent(MainActivity.this,SMVITMHoliday.class);
            calen.putExtra("key","HOL");
            startActivity(calen);
        }
        else if (id == R.id.smvitmcalender){
            Intent calen = new Intent(MainActivity.this,SMVITMHoliday.class);
            calen.putExtra("key","CAL");
            startActivity(calen);
        }
        else if (id== R.id.smvitmfaculty){
            startActivity(new Intent(MainActivity.this,DepartmentListActivity.class));
        } else if (id == R.id.websites) {
            startActivity(new Intent(MainActivity.this,WebsiteActivity.class));
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    void showtimetable(final String day){
/*
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.scale);
*/
        final Animation animScale2 = AnimationUtils.loadAnimation(this, R.anim.scale_day);
        final Animation right = AnimationUtils.loadAnimation(this, R.anim.translate);

        Day.setText(day);
        Day.setPaintFlags(Day.getPaintFlags() |   Paint.UNDERLINE_TEXT_FLAG);
        setTitle("Time Table");
        Day.startAnimation(animScale2);
        pb1.setText("09:00 - 09:55");
        pb2.setText("09:55 - 10:50");
        pb3.setText("11:10 - 12:05");
        pb4.setText("12:05 - 01:00");
        pb5.setText("01:00 - 01:55");
        pb6.setText("01:55 - 02:50");
        pb7.setText("03:00 - 03:55");
        pb8.setText("03:55 - 04:50");
        sub1.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p1"));
        sub2.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p2"));
        sub3.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p3"));
        sub4.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p4"));
        sub5.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p5"));
        sub6.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p6"));
        sub7.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p7"));
        sub8.setText(TimeTableDisplay.DiplayTimeTable(branch,year,section,day,"p8"));

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub1.putExtra("key",sub1.getText());
                v.startAnimation(right);
                startActivity(isub1);

            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub2.putExtra("key",sub2.getText());
                v.startAnimation(right);
                startActivity(isub2);
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub3.putExtra("key",sub3.getText());
                v.startAnimation(right);
                startActivity(isub3);
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = (String) sub4.getText();
                if(a.equalsIgnoreCase("Lunch Break")){
                    Intent smvitmcafe = new Intent(MainActivity.this,SmvitmCafiteria.class);
                    smvitmcafe.putExtra("key","CAFE");
                    v.startAnimation(right);
                    startActivity(smvitmcafe);
                }else {
                    isub4.putExtra("key", sub4.getText());
                    v.startAnimation(right);
                    startActivity(isub4);
                }
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = (String) sub5.getText();
                if(a.equalsIgnoreCase("Lunch Break")){
                    Intent smvitmcafe = new Intent(MainActivity.this,SmvitmCafiteria.class);
                    smvitmcafe.putExtra("key","CAFE");
                    v.startAnimation(right);
                    startActivity(smvitmcafe);
                }else {
                    isub5.putExtra("key", sub5.getText());
                    v.startAnimation(right);
                    startActivity(isub5);
                }
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub6.putExtra("key",sub6.getText());
                v.startAnimation(right);
                startActivity(isub6);
            }
        });
        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub7.putExtra("key",sub7.getText());
                v.startAnimation(right);
                startActivity(isub7);
            }
        });
        sub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isub8.putExtra("key",sub8.getText());
                v.startAnimation(right);
                startActivity(isub8);
            }
        });

        nextDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showNextDay(day);
            }
        });
        prevDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showPrevDay(day);
            }
        });
    }



    void SuperSaturday(final String day){
        final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.translate);
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.alpha);
/*
        final Animation animScale = AnimationUtils.loadAnimation(this, R.anim.scale);
*/
        final Animation animScale2 = AnimationUtils.loadAnimation(this, R.anim.scale_day);
        setTitle("Time Table");
        Day.setText("Saturday");
        Day.startAnimation(animScale2);
        pb1.setText("Aug - 19");
        pb2.setText("Sep - 09");
        pb3.setText("Sep - 16");
        pb4.setText("Sep - 23");
        pb5.setText("Oct - 07");
        pb6.setText("Oct - 28");
        pb7.setText("Nov - 11");
        pb8.setText("Nov - 25");
        sub1.setText("TUE TT");
        sub2.setText("TUE TT");
        sub3.setText("FRI TT");
        sub4.setText("WED TT");
        sub5.setText("THU TT");
        sub6.setText("WED TT");
        sub7.setText("FRI TT");
        sub8.setText("FRI TT");
        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Tuesday");
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Tuesday");
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Friday");
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Wednesday");
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Thursday");
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Wednesday");
            }
        });
        sub7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Friday");
            }
        });
        sub8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showtimetable("Friday");
            }
        });
        nextDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showNextDay(day);
            }
        });
        prevDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
/*
                v.startAnimation(animScale);
*/
                showPrevDay(day);
            }
        });
    }

    public static boolean checkInternetConnection(Context context) {

        ConnectivityManager con_manager = (ConnectivityManager)
                context.getSystemService(Context.CONNECTIVITY_SERVICE);

        if (con_manager.getActiveNetworkInfo() != null
                && con_manager.getActiveNetworkInfo().isAvailable()
                && con_manager.getActiveNetworkInfo().isConnected()) {
            return true;
        } else {
            return false;
        }
    }

    void showNextDay(String day){

        if(day.equalsIgnoreCase("Monday")){
                showtimetable("Tuesday");
        }else if(day.equalsIgnoreCase("Tuesday")){
            showtimetable("Wednesday");
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            showtimetable("Thursday");
        }
        else if(day.equalsIgnoreCase("Thursday")){
            showtimetable("Friday");
        }
        else if(day.equalsIgnoreCase("Friday")){
            SuperSaturday("Saturday");
        }
        else if(day.equalsIgnoreCase("Saturday")){
            showtimetable("Monday");
        }
    }
    void showPrevDay(String day){
        if(day.equalsIgnoreCase("Monday")){
            SuperSaturday("Saturday");
        }else if(day.equalsIgnoreCase("Tuesday")){
            showtimetable("Monday");
        }
        else if(day.equalsIgnoreCase("Wednesday")){
            showtimetable("Tuesday");
        }
        else if(day.equalsIgnoreCase("Thursday")){
            showtimetable("Wednesday");
        }
        else if(day.equalsIgnoreCase("Friday")){
            showtimetable("Thursday");
        }
        else if(day.equalsIgnoreCase("Saturday")){
            showtimetable("Friday");
        }
    }

}


