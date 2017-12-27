package com.wce.pallapu.collapsingtoolbar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by A7718 on 12/27/2017.
 */

public class RecyclerView extends android.support.v7.widget.RecyclerView.Adapter<RecyclerView.MyViewHolder>{

    private ArrayList<Album> arrayList=new ArrayList<>();

    public RecyclerView(ArrayList<Album> arrayList) {
        this.arrayList = arrayList;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {



        holder.imageView.setImageResource(arrayList.get(position).getImg_id());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }


    public static class MyViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
    {

ImageView imageView;
        public MyViewHolder(View itemView) {
            super(itemView);

            imageView=(ImageView)itemView.findViewById(R.id.cardview);
        }
    }
}
