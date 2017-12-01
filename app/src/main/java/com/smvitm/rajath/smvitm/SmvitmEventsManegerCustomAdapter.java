package com.smvitm.rajath.smvitm;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class SmvitmEventsManegerCustomAdapter extends RecyclerView.Adapter<SmvitmEventsManegerCustomAdapter.ViewHolder> {

    private Context context;
    private List<SmvitmEventsManegerMyData> my_data;

    public SmvitmEventsManegerCustomAdapter(Context context, List<SmvitmEventsManegerMyData> my_data) {
        this.context = context;
        this.my_data = my_data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.smvitm_event_card,parent,false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.title.setText(my_data.get(position).getTitle());
        holder.description.setText(my_data.get(position).getDescription());
        Glide.with(context).load(my_data.get(position).getImage_link()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return my_data.size();
    }

    public  class ViewHolder extends  RecyclerView.ViewHolder{

        public TextView title;
        public TextView description;
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.title);
            description = (TextView) itemView.findViewById(R.id.description);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
