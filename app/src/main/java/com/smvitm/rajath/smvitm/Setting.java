package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v7.app.AlertDialog;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import static java.util.Calendar.*;

public class Setting extends AppCompatPreferenceActivity{

    static String myapp = null;
    static String myNo = "171027";
    static String body = "";
    static String time;
    static RequestQueue requestQueue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new MainPreferenceFragment()).commit();

        setTitle("About Application");
        requestQueue = Volley.newRequestQueue(getApplicationContext());
        getDaetail(Setting.this);


    }
    public static class MainPreferenceFragment extends PreferenceFragment {
        @Override
        public void onCreate(final Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.pref_main);



            // feedback preference click listener
            Preference feed = findPreference(getString(R.string.key_send_feedback));
           feed.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    getDaetail(getActivity());
                    sendFeedback();
                    return true;
                }
            });

            Preference myPref = findPreference(getString(R.string.my_feedback));
            myPref.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    if (!MainActivity.checkInternetConnection(getActivity())) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
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
                        Intent vtuweb = new Intent(getActivity(), ViewWebsite.class);
                        vtuweb.putExtra("key", "FEED");
                        startActivity(vtuweb);
                    }
                    return true;
                }
            });
            version(getActivity());
           Preference Version = findPreference(getString(R.string.app_ver));
            Version.setSummary(myapp);
            Version.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                    b.setMessage("What's New !\n*Bug fix\n*Added new UI\n*Added Animation\n*New UI to About Application\n*Fixed issues in fonts");
                    b.create();
                    b.show();
                    return true;
                }
            });

            Preference BDN = findPreference(getString(R.string.buildNo));
            BDN.setSummary(myNo);
            BDN.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                    b.setMessage("Build Number : "+myNo);
                    b.create();
                    b.show();
                    return true;
                }
            });

            Preference rf = findPreference(getString(R.string.req));
            rf.setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
                public boolean onPreferenceClick(Preference preference) {
                    if (!MainActivity.checkInternetConnection(getActivity())) {
                        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
                        alertDialog.setIcon(R.mipmap.ic_launcher);
                        alertDialog.setTitle("Connection Error!");
                        alertDialog.setMessage("Internet Connection is not available");
                        alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        });
                        alertDialog.setCancelable(false).create().show();
                    } else
                    {
                        AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                        b.setTitle("Requesting New Feature");
                        b.setMessage("");
                        b.setIcon(R.mipmap.ic_launcher);
                        final EditText input = new EditText(getActivity());
                        input.setHint("Write about your request here");
                        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                                LinearLayout.LayoutParams.WRAP_CONTENT,
                                LinearLayout.LayoutParams.WRAP_CONTENT);
                        input.setLayoutParams(lp);
                        b.setView(input);
                        b.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                                final String message = input.getText().toString();
                                if (message.isEmpty()) {
                                    Toast.makeText(getActivity(), "Please enter your message to send", Toast.LENGTH_SHORT).show();
                                } else {
                                    try {
                                        Calendar c = getInstance();
                                        int date = c.get(Calendar.DATE);
                                        int month = c.get(Calendar.MONTH);
                                        int year = c.get(Calendar.YEAR);
                                        int hour = c.get(Calendar.HOUR_OF_DAY);
                                        int min = c.get(Calendar.MINUTE);
                                        int sec = c.get(Calendar.SECOND);
                                        time = "" + date + " / " + month + " / " + year + " at " + hour + ":" + min + ":" + sec;


                                        String insertUrl = "http://vtu-help.tk/ForNewFeatureRequestEnterData.php";

                                        StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                                            @Override
                                            public void onResponse(String response) {

                                                System.out.println(response.toString());
                                            }
                                        }, new Response.ErrorListener() {
                                            @Override
                                            public void onErrorResponse(VolleyError error) {

                                            }
                                        }) {

                                            @Override
                                            protected Map<String, String> getParams() throws AuthFailureError {
                                                Map<String, String> parameters = new HashMap<String, String>();
                                                parameters.put("req", message.toString());
                                                parameters.put("info", body.toString());
                                                parameters.put("time", time.toString());

                                                return parameters;
                                            }
                                        };
                                        requestQueue.add(request);
                                        Toast.makeText(getActivity(), "Thank you for Reporting", Toast.LENGTH_SHORT).show();
                                    } catch (Exception e) {
                                        Toast.makeText(getActivity(), "Connection failed,Make sure that you have active internet connection.", Toast.LENGTH_SHORT).show();
                                    }
                                }
                            }
                        });

                        b.create();
                        b.show();
                    }
                        return true;

                    }


            });


        }

        public void sendFeedback() {
            if (!MainActivity.checkInternetConnection(getActivity())) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());
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
                AlertDialog.Builder b = new AlertDialog.Builder(getActivity());
                b.setTitle("Report a Problem");
                b.setMessage("");
                b.setIcon(R.mipmap.ic_launcher);
                final EditText input = new EditText(getActivity());
                input.setHint("Write about problem your facing here");
                LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);
                input.setLayoutParams(lp);
                b.setView(input);
                b.setPositiveButton("Send", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        final String message = input.getText().toString();
                        if (message.isEmpty()) {
                            Toast.makeText(getActivity(), "Please enter your message to send", Toast.LENGTH_SHORT).show();
                        } else {
                            try {
                                Calendar c = getInstance();
                                int date = c.get(Calendar.DATE);
                                int month = c.get(Calendar.MONTH);
                                int year = c.get(Calendar.YEAR);
                                int hour = c.get(Calendar.HOUR_OF_DAY);
                                int min = c.get(Calendar.MINUTE);
                                int sec = c.get(Calendar.SECOND);
                                time = "" + date + " / " + month + " / " + year + " at " + hour + ":" + min + ":" + sec;


                                String insertUrl = "http://vtu-help.tk/ReportProblemInsertData.php";

                                StringRequest request = new StringRequest(Request.Method.POST, insertUrl, new Response.Listener<String>() {
                                    @Override
                                    public void onResponse(String response) {

                                        System.out.println(response.toString());
                                    }
                                }, new Response.ErrorListener() {
                                    @Override
                                    public void onErrorResponse(VolleyError error) {

                                    }
                                }) {

                                    @Override
                                    protected Map<String, String> getParams() throws AuthFailureError {
                                        Map<String, String> parameters = new HashMap<String, String>();
                                        parameters.put("problems", message.toString());
                                        parameters.put("info", body.toString());
                                        parameters.put("time", time.toString());

                                        return parameters;
                                    }
                                };
                                requestQueue.add(request);
                                Toast.makeText(getActivity(), "Thank you for Reporting", Toast.LENGTH_SHORT).show();
                            } catch (Exception e) {
                                Toast.makeText(getActivity(), "Connection failed,Make sure that you have active internet connection.", Toast.LENGTH_SHORT).show();
                            }
                        }

                    }
                });

                b.create();
                b.show();
            }
        }
    }









    public static void version(Context context) {
        try {
            myapp = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;

        } catch (PackageManager.NameNotFoundException e) {

        }

    }

    public static void getDaetail(Context context) {
        try {
            body = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            body = "Device OS: Android \n Device OS version: " +
                    Build.VERSION.RELEASE + "\n App Version: " + body + "\n Device Brand: " + Build.BRAND +
                    "\n Device Model: " + Build.MODEL + "\n Device Manufacturer: " + Build.MANUFACTURER;
        } catch (PackageManager.NameNotFoundException e) {
        }
        /*Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("message/rfc822");
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ykrajath4@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Query from android app");
        intent.putExtra(Intent.EXTRA_TEXT, body);
        context.startActivity(Intent.createChooser(intent, context.getString(R.string.choose_email_client)));*/
    }
  /*  private static Preference.OnPreferenceChangeListener sBindPreferenceSummaryToValueListener = new Preference.OnPreferenceChangeListener() {
        @Override
        public boolean onPreferenceChange(Preference preference, Object newValue) {
            String stringValue = newValue.toString();

            if (preference instanceof ListPreference) {
                // For list preferences, look up the correct display value in
                // the preference's 'entries' list.
                ListPreference listPreference = (ListPreference) preference;
                int index = listPreference.findIndexOfValue(stringValue);

                // Set the summary to reflect the new value.
                preference.setSummary(
                        index >= 0
                                ? listPreference.getEntries()[index]
                                : null);

            } *//*else if (preference instanceof RingtonePreference) {
                // For ringtone preferences, look up the correct display value
                // using RingtoneManager.
                if (TextUtils.isEmpty(stringValue)) {
                    // Empty values correspond to 'silent' (no ringtone).
                    preference.setSummary(R.string.pref_ringtone_silent);

                } else {
                    Ringtone ringtone = RingtoneManager.getRingtone(
                            preference.getContext(), Uri.parse(stringValue));

                    if (ringtone == null) {
                        // Clear the summary if there was a lookup error.
                        preference.setSummary(R.string.summary_choose_ringtone);
                    } else {
                        // Set the summary to reflect the new ringtone display
                        // name.
                        String name = ringtone.getTitle(preference.getContext());
                        preference.setSummary(name);
                    }
                }

            }*//*return true;
        }
    };*/
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

}