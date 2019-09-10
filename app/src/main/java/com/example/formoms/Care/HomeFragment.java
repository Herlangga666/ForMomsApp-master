package com.example.formoms.Care;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.formoms.Profile.ProfileFragment;
import com.example.formoms.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private ImageView seting;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView mRecyclerView;
    private List<Baby> babyList;
    RecycleViewAdapter babyAdapter;

    String[] judul = {
            "Sampo",
            "Bedak"
    };

    String[] desc = {
            "Ini sampo terbaik",
            "Ini bedak terbaik"
    };

    int[] pic = {
            R.drawable.bebi1,
            R.drawable.bebi2
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_home_fragment,container,false);
//        mRecyclerView = v.findViewById(R.id.rvCares);
//
//        if (mRecyclerView != null) {
//            mRecyclerView.setHasFixedSize(true);
//        }
//
////        mLayoutManager = new LinearLayoutManager();
//
//        mRecyclerView.setLayoutManager(mLayoutManager);
//
//        babyList = new ArrayList<>();
//
//        for (int i = 0; i < judul.length; i++) {
//            Baby baby = new Baby(judul[i], desc[i], pic[i]);
//            babyList.add(baby);
//        }
//
//        babyAdapter = new RecycleViewAdapter(babyList);
//
//        mRecyclerView.setAdapter(babyAdapter);
//        babyAdapter.notifyDataSetChanged();
//
//        mRecyclerView.setAdapter(babyAdapter);
//        babyAdapter.notifyDataSetChanged();

        seting = (ImageView)v.findViewById(R.id.settingcare);
        seting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ProfileFragment.class));
            }
        });

        return v;
    }

}
