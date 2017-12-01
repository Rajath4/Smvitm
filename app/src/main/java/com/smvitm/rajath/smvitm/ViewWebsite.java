package com.smvitm.rajath.smvitm;

import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URL;

public class ViewWebsite extends AppCompatActivity {
    WebView webview;
    static String topic;
    URL url;
    static String link="null";
    static String newVersion="0";
    static Thread thread;
    Button a;
    TextView e1,e2,e3,e4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


        Intent intent = getIntent();
        topic = intent.getStringExtra("key");
        if (topic.equalsIgnoreCase("VTURES")) {
            setTitle("VTU RESULTS");
            Web("http://results.vtu.ac.in/");
        } else if (topic.equalsIgnoreCase("VTUCIR")) {
            setTitle("VTU Circulars and Notifications");
            Web("http://vtu.ac.in/exams-circulars-notifications/");
        } else if (topic.equalsIgnoreCase("VTUWEB")) {
            setTitle("VTU Website");
            Web("http://vtu.ac.in/");
        } else if (topic.equalsIgnoreCase("CLGWEB")) {
            setTitle("College Website");
            Web("http://sode-edu.in/");
        } else if (topic.equalsIgnoreCase("CLGEVT")) {
            setTitle("College Events");
            Web("http://sode-edu.in/upcoming-events/");
        } else if (topic.equalsIgnoreCase("CLGNEWS")) {
            setTitle("College News");
            Web("http://sode-edu.in/category/news/");
        } else if (topic.equalsIgnoreCase("SLY")) {
            setTitle("Syllabus");
            Web("https://drive.google.com/open?id=0B-3NN67q8bD7eVJ3a3JraW9VYTQ");
        } else if (topic.equalsIgnoreCase("STUMAT")) {
            getSupportActionBar().hide();
            Web("http://vtu-help.tk/");
        }else if (topic.equalsIgnoreCase("FEED")) {
            setTitle("Feedback");
            Web("https://docs.google.com/forms/d/e/1FAIpQLSeoqmMvSIX_FYqQcSpzHMKmCHe2XHOZslCOPRpv9XFSEos5Mg/viewform?usp=sf_link");
        }else if(topic.equalsIgnoreCase("QPAPER")){
            setTitle("Old Question Paper");
            Web("https://drive.google.com/open?id=0B-3NN67q8bD7UGZ0X1FBaFlIMVE");
        }


    }
    public void Web(String url){

        if (!MainActivity.checkInternetConnection(ViewWebsite.this)) {
            AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
            alertDialog.setIcon(R.mipmap.ic_launcher);
            alertDialog.setTitle("Connection Error!");
            alertDialog.setMessage("Internet Connection is not available");
            alertDialog.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alertDialog.setCancelable(false).create().show();
        } else {

            webview = new WebView(this);
            setContentView(webview);
            webview.getSettings().setJavaScriptEnabled(true);
            webview.getSettings().setLoadWithOverviewMode(true);
            webview.getSettings().setUseWideViewPort(true);
            webview.getSettings().setSupportZoom(true);
            webview.getSettings().setBuiltInZoomControls(true);
            webview.getSettings().setDisplayZoomControls(false);
            webview.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);

            webview.getSettings().setAppCacheMaxSize( 200 * 1024 * 1024 ); // 200MB
            webview.getSettings().setAppCachePath( getApplicationContext().getCacheDir().getAbsolutePath() );
            webview.getSettings().setAllowFileAccess( true );
            webview.getSettings().setAppCacheEnabled( true );
            webview.getSettings().setJavaScriptEnabled( true );
            webview.getSettings().setCacheMode( WebSettings.LOAD_DEFAULT );

/*
            webview.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
*/



            webview.clearView();
            webview.loadUrl(url);
            webview.setWebViewClient(new MyWebViewClient());
        }

        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (topic.equalsIgnoreCase("ABTAPP")) {
            finish();
        }else {
            if ((keyCode == KeyEvent.KEYCODE_BACK) && webview.canGoBack()) {
                //if Back key pressed and webview can navigate to previous page
                webview.goBack();
                // go back to previous page
                return true;
            } else {
                // finish the activity
                finish();
            }

        }return super.onKeyDown(keyCode, event);
    }

    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            if(url.endsWith(".pdf")){
                try
                {
                    Intent intentUrl = new Intent(Intent.ACTION_VIEW);
                    intentUrl.setDataAndType(Uri.parse(url), "application/pdf");
                    intentUrl.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intentUrl);
                }
                catch (ActivityNotFoundException e)
                {
                    Toast.makeText(ViewWebsite.this, "Please install any PDF viewer from Google Play Store", Toast.LENGTH_SHORT).show();
                }
            }
            return false;
        }
        ProgressDialog pd = null;

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            pd = new ProgressDialog(ViewWebsite.this);
            pd.setTitle("Please wait");
            pd.setMessage("Page is loading...");
            pd.setCancelable(true);
            pd.show();
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pd.dismiss();
        }
    }

}