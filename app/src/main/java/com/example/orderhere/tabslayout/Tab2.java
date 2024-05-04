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


public class Tab2 extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tab1, container, false);
        //return rootView;

        ArrayList<MyPhone> phones = new ArrayList<>();
        phones.add(new MyPhone(R.drawable.redmi1, "Redmi Note 11"));
        phones.add(new MyPhone(R.drawable.redmi2, "Redmi Note 10"));
        phones.add(new MyPhone(R.drawable.redmi3, "Redmi Note 9"));
        phones.add(new MyPhone(R.drawable.redmi4, "Redmi Note 8"));
        phones.add(new MyPhone(R.drawable.redmi5, "Redmi Note 7"));
        phones.add(new MyPhone(R.drawable.redmi6, "Redmi K40"));
        phones.add(new MyPhone(R.drawable.redmi7, "Redmi K30"));
        phones.add(new MyPhone(R.drawable.redmi8, "Redmi K20"));
        phones.add(new MyPhone(R.drawable.redmi9, "Redmi K10"));
        phones.add(new MyPhone(R.drawable.redmi10, "Redmi 10"));
        phones.add(new MyPhone(R.drawable.redmi11, "Redmi 9"));
        phones.add(new MyPhone(R.drawable.redmi12, "Redmi 8"));
        phones.add(new MyPhone(R.drawable.redmi13, "Redmi 7"));
        phones.add(new MyPhone(R.drawable.redmi14, "Redmi 6"));

        RecyclerViewAdapter adapter = new RecyclerViewAdapter(phones, new OnImageClickListener() {
            @Override
            public void onImageClick(int imageResourceId) {
                Intent intent = new Intent(getContext(), DetailsPhone.class);
                intent.putExtra("TAB2", imageResourceId);
                startActivity(intent);
            }
        });
        recyclerView = rootView.findViewById(R.id.tab1RecyclerView);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);

        return rootView;
    }
}