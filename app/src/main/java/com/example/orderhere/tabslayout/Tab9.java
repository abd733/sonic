package com.example.orderhere.tabslayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.orderhere.DetailsPhone;
import com.example.orderhere.MyPhone;
import com.example.orderhere.R;
import com.example.orderhere.RecyclerViewAdapter;

import java.util.ArrayList;

public class Tab9 extends Fragment {
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_tab9, container, false);
        ArrayList<MyPhone> phones = new ArrayList<>();
        phones.add(new MyPhone(R.drawable.realme1, "Realme GT 2 Pro"));
        phones.add(new MyPhone(R.drawable.realme2, "Realme GT 2"));
        phones.add(new MyPhone(R.drawable.realme3, "Realme GT Neo 3"));
        phones.add(new MyPhone(R.drawable.realme4, "Realme GT Master Edition"));
        phones.add(new MyPhone(R.drawable.realme5, "Realme GT Neo 2T"));
        phones.add(new MyPhone(R.drawable.realme6, "Realme GT Neo 2"));
        phones.add(new MyPhone(R.drawable.realme7, "Realme 9 Pro+"));
        phones.add(new MyPhone(R.drawable.realme8, "Realme 9 Pro"));
        phones.add(new MyPhone(R.drawable.realme9, "Realme 9"));
        phones.add(new MyPhone(R.drawable.realme10, "Realme 8 Pro"));
        phones.add(new MyPhone(R.drawable.realme11, "Realme 8 5G"));
        phones.add(new MyPhone(R.drawable.realme12, "Realme 8"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(phones, new OnImageClickListener() {
            @Override
            public void onImageClick(int imageResourceId) {
                Intent intent = new Intent(getContext(), DetailsPhone.class);
                intent.putExtra("TAB9", imageResourceId);
                startActivity(intent);
            }
        });        recyclerView = v.findViewById(R.id.tab9RecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return v;
    }
}