package com.example.formoms.Care;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<Baby> babyList;

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public ViewHolder(View v){
            super(v);

        }
    }

    public RecycleViewAdapter(ArrayList<Baby> babyList){
        this.babyList = babyList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return babyList.size();
    }
}
