package com.example.orderhere.tabslayout;

import android.annotation.SuppressLint;
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

public class Tab6 extends Fragment {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_tab6, container, false);
        ArrayList<MyPhone> phones = new ArrayList<>();
        phones.add(new MyPhone(R.drawable.google1, "Google Pixel 6 Pro"));
        phones.add(new MyPhone(R.drawable.google2, "Google Pixel 6"));
        phones.add(new MyPhone(R.drawable.google3, "Google Pixel 5a"));
        phones.add(new MyPhone(R.drawable.google4, "Google Pixel 5"));
        phones.add(new MyPhone(R.drawable.google5, "Google Pixel 4a 5G"));
        phones.add(new MyPhone(R.drawable.google6, "Google Pixel 4a"));
        phones.add(new MyPhone(R.drawable.google7, "Google Pixel 4 XL"));
        phones.add(new MyPhone(R.drawable.google8, "Google Pixel 4"));
        phones.add(new MyPhone(R.drawable.google9, "Google Pixel 3a XL"));
        phones.add(new MyPhone(R.drawable.google10, "Google Pixel 3a"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(phones, new OnImageClickListener() {
            @Override
            public void onImageClick(int imageResourceId) {
                Intent intent = new Intent(getContext(), DetailsPhone.class);
                intent.putExtra("TAB6", imageResourceId);
                startActivity(intent);
            }
        });        recyclerView = v.findViewById(R.id.tab6RecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return v;
    }
}