package com.example.babarkhan.assignment_2;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Babar KHan on 10/16/2017.
 */

public class Myadpater extends RecyclerView.Adapter<Myadpater.ViewHolder> {
    @Override
    public Myadpater.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false)

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(Myadpater.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return 0;
    }
    public class ViewHolder extends RecyclerView.ViewHolder
    {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

}
