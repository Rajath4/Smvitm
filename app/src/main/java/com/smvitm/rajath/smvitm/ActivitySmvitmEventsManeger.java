package com.smvitm.rajath.smvitm;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ActivitySmvitmEventsManeger extends AppCompatActivity {

    private RecyclerView recyclerView;
    private GridLayoutManager gridLayoutManager;
    private SmvitmEventsManegerCustomAdapter adapter;
    private List<SmvitmEventsManegerMyData> data_list;

    private ProgressDialog pDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smvitm_events_activity_main);

        setTitle("News");
        if(getSupportActionBar() !=null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        data_list  = new ArrayList<>();
        load_data_from_server(0);

        gridLayoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapter = new SmvitmEventsManegerCustomAdapter(this,data_list);
        recyclerView.setAdapter(adapter);
        


        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

                if(gridLayoutManager.findLastCompletelyVisibleItemPosition() == data_list.size()-1){
                    load_data_from_server(data_list.get(data_list.size()-1).getId());
                }

            }
        });
        


    }

    private void load_data_from_server(final int id){
        AsyncTask<Integer,Void,Void> task = new AsyncTask<Integer, Void, Void>() {
                @Override
                protected void onPreExecute() {
                    super.onPreExecute();
                    // Showing progress dialog
                    pDialog = new ProgressDialog(ActivitySmvitmEventsManeger.this);
                    pDialog.setMessage("Please wait...");
                    pDialog.setCancelable(true);
                    pDialog.show();

                }
                @Override
                protected Void doInBackground(Integer... integers) {

                    OkHttpClient client = new OkHttpClient();
                    Request request = new Request.Builder()
                            .url("http://vtu-help.tk/GetSmvitmEvent.php?id="+id)
                            .build();

                    try {
                        Response response = client.newCall(request).execute();

                        JSONArray array = new JSONArray(response.body().string());


                        for (int i=0; i<array.length(); i++){

                            JSONObject object = array.getJSONObject(i);

                            SmvitmEventsManegerMyData data = new SmvitmEventsManegerMyData(object.getInt("id"),object.getString("title"),object.getString("description"),
                                    object.getString("image"));

                            data_list.add(data);
                        }



                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (JSONException e) {
                        System.out.println("End of content");
                    }
                    return null;
                }

                @Override
                protected void onPostExecute(Void aVoid) {
                    if (pDialog.isShowing())
                        pDialog.dismiss();
                    adapter.notifyDataSetChanged();
                }
            };

        task.execute(id);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home)

            super.onBackPressed();



        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
