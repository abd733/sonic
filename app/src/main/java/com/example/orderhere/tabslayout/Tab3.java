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

public class Tab3 extends Fragment {
    RecyclerView recyclerView;
    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_tab3, container, false);

        ArrayList<MyPhone> phones = new ArrayList<>();
        phones.add(new MyPhone(R.drawable.infinix1, "Infinix Hot 11"));
        phones.add(new MyPhone(R.drawable.infinix2, "Infinix Hot 10"));
        phones.add(new MyPhone(R.drawable.infinix3, "Infinix Hot 9"));
        phones.add(new MyPhone(R.drawable.infinix4, "Infinix Hot 8"));
        phones.add(new MyPhone(R.drawable.infinix5, "Redmi Note 7"));
        phones.add(new MyPhone(R.drawable.infinix6, "Infinix Hot 7"));
        phones.add(new MyPhone(R.drawable.infinix7, "Infinix Note 11"));
        phones.add(new MyPhone(R.drawable.infinix8, "Infinix Note 10"));
        phones.add(new MyPhone(R.drawable.infinix9, "Infinix Note 9"));
        phones.add(new MyPhone(R.drawable.infinix10, "Infinix Note 8"));
        phones.add(new MyPhone(R.drawable.infinix11, "Infinix Note 7"));
        phones.add(new MyPhone(R.drawable.infinix12, "Infinix Zero 8"));
        phones.add(new MyPhone(R.drawable.infinix13, "Infinix Zero 7"));
        phones.add(new MyPhone(R.drawable.infinix14, "Infinix Zero 6"));
        phones.add(new MyPhone(R.drawable.infinix14, "Infinix Zero 5"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(phones, new OnImageClickListener() {
            @Override
            public void onImageClick(int imageResourceId) {
                Intent intent = new Intent(getContext(), DetailsPhone.class);
                intent.putExtra("TAB3", imageResourceId);
                startActivity(intent);
            }
        });        recyclerView = view.findViewById(R.id.tab3RecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        return view;

    }
}