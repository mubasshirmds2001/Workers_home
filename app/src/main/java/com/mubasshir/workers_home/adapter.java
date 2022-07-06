package com.mubasshir.workers_home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.myviewholder>{
    ArrayList<datamodel> dataholder;

    public adapter(ArrayList<datamodel> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.user_profile_single_row,parent,false);
        return  new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
//        holder.img.setImageResource(dataholder.get(position).getImage());
//        holder.header.setText(dataholder.get(position).getHeader());
//        holder.nm.setText(dataholder.get(position).getNm());
//        holder.edit.setImageResource(dataholder.get(position).getEdit());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img,edit;
        TextView header,nm;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
//            img=itemView.findViewById(R.id.user_icon);
//            header=itemView.findViewById(R.id.user_txtNameHeading);
//            nm=itemView.findViewById(R.id.user_txtName);
//            edit=itemView.findViewById(R.id.editt);
        }
    }
}