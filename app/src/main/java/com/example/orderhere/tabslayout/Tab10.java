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

public class Tab10 extends Fragment {
    RecyclerView recyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_tab10, container, false);
        ArrayList<MyPhone> phones = new ArrayList<>();
        phones.add(new MyPhone(R.drawable.oppo1, "OPPO Find X5 Pro"));
        phones.add(new MyPhone(R.drawable.oppo2, "OPPO Find X3 Pro"));
        phones.add(new MyPhone(R.drawable.oppo3, "OPPO Find X3 Neo"));
        phones.add(new MyPhone(R.drawable.oppo4, "OPPO Find X3 Lite"));
        phones.add(new MyPhone(R.drawable.oppo5, "OPPO Reno7 Pro 5G"));
        phones.add(new MyPhone(R.drawable.oppo6, "OPPO Reno7 5G"));
        phones.add(new MyPhone(R.drawable.oppo7, "OPPO Reno6 Pro+ 5G"));
        phones.add(new MyPhone(R.drawable.oppo8, "OPPO Reno6 Pro 5G"));
        phones.add(new MyPhone(R.drawable.oppo9, "OPPO Reno6 5G"));
        phones.add(new MyPhone(R.drawable.oppo10, "OPPO F21 Pro"));
        phones.add(new MyPhone(R.drawable.oppo11, "OPPO A76"));
        phones.add(new MyPhone(R.drawable.oppo12, "OPPO A56"));
        phones.add(new MyPhone(R.drawable.oppo13, "OPPO A16s"));
        phones.add(new MyPhone(R.drawable.oppo14, "OPPO K10 Pro"));
        phones.add(new MyPhone(R.drawable.oppo15, "OPPO K10"));
        phones.add(new MyPhone(R.drawable.oppo16, "OPPO Ace3"));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(phones, new OnImageClickListener() {
            @Override
            public void onImageClick(int imageResourceId) {
                Intent intent = new Intent(getContext(), DetailsPhone.class);
                intent.putExtra("TAB10", imageResourceId);
                startActivity(intent);
            }
        });        recyclerView = v.findViewById(R.id.tab10RecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return v;
    }
}