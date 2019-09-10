package com.example.formoms.Care;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.formoms.R;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.ViewHolder> {
    private ArrayList<Baby> babyList;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView tvJudul, tvDesc;
        ImageView imgPost;

        public ViewHolder(View v){
            super(v);
            tvJudul = v.findViewById(R.id.labelJudul);
            tvDesc = v.findViewById(R.id.labelDesc);
            imgPost = v.findViewById(R.id.imagePost);
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
        Baby baby = babyList.get(position);
        holder.tvJudul.setText(baby.getJudul());
        holder.tvDesc.setText(baby.getIsi());
        holder.imgPost.setImageResource(baby.getPic());
    }

    @Override
    public int getItemCount() {
        return babyList.size();
    }
}
