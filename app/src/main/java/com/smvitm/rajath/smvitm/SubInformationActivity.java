package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SubInformationActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;
    static String year;
    static String branch;
    static String section;
    static String key;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_information);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);


        tabLayout.setupWithViewPager(mViewPager);

        SharedPreferences loginData = getSharedPreferences("userInfo", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = loginData.edit();
        year = loginData.getString("yeAr", "");
        branch = loginData.getString("branCh", "");
        section = loginData.getString("sectiOn", "");
        Intent intent = getIntent();
        key = intent.getStringExtra("key");
        setTitle(SubjectInformationDisplay.SubjectInfo(branch,year,section,key,0));


    }





    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                View rootView = inflater.inflate(R.layout.fr_sub_information_tb1, container, false);
                TextView textView = (TextView) rootView.findViewById(R.id.frdetailedtimetable);
               /* ImageView background = (ImageView)rootView.findViewById(R.id.ttdaybackground);
                try {
                    background.setBackgroundResource(R.drawable.bg_lines_tiles_for_tt);
                }catch (Exception e){

                }*/
                textView.setText("\n"+SubjectInformationDisplay.SubjectInfo(branch,year,section,key,getArguments().getInt(ARG_SECTION_NUMBER))+"\n");

                return rootView;

            }else  if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {


                View rootView = inflater.inflate(R.layout.fr_sub_information_tb2, container, false);
                TextView textView = (TextView) rootView.findViewById(R.id.frdetailedtimetable);
                /*ImageView background = (ImageView)rootView.findViewById(R.id.ttdaybackground);
                try {
                    background.setBackgroundResource(R.drawable.bg_lines_tiles_for_tt);
                }catch (Exception e){

                }*/
                textView.setText("\n"+SubjectInformationDisplay.SubjectInfo(branch,year,section,key,getArguments().getInt(ARG_SECTION_NUMBER))+"\n");

                return rootView;

            }else  if (getArguments().getInt(ARG_SECTION_NUMBER) == 3 ) {
                View rootView = inflater.inflate(R.layout.fr_sub_information_tb3, container, false);
                final Button b1 = (Button) rootView.findViewById(R.id.oldquestionpaper);


               /* ImageView background = (ImageView)rootView.findViewById(R.id.ttdaybackground);
                try {
                    background.setBackgroundResource(R.drawable.bg_lines_tiles_for_tt);
                }catch (Exception e){

                }*/


                b1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        String url = SubjectInformationDisplay.SubjectInfo(branch,year,section,key,3);
                        if ((url =="") || (url.equalsIgnoreCase("Data not available"))){
                            AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                            b.setTitle("Data not available!");
                            b.setMessage("We will try to upload soon...");
                            b.create();
                            b.show();
                        }else  {
                            if (!MainActivity.checkInternetConnection(getActivity())) {
                                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                                alertDialog.setTitle("Connection Error!");
                                alertDialog.setMessage("Internet Connection is not available");
                                alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                                alertDialog.setCancelable(false).create().show();
                            } else {
                                Intent vtuweb = new Intent(getActivity(), GotoWeb.class);
                                vtuweb.putExtra("key", key);
                                startActivity(vtuweb);
                            }
                        }
                    }
                });
                return rootView;
            }
            return null;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Classes";
                case 1:
                    return "About Subject";
                case 2:
                    return "Study Material";
            }
            return null;
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)
            finish();



        return super.onOptionsItemSelected(item);
    }
}
