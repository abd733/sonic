package com.example.orderhere;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.orderhere.databinding.ActivityAndroidInterfaceBinding;
import com.example.orderhere.databinding.ActivityDetailsPhoneBinding;

public class DetailsPhone extends AppCompatActivity {
    ActivityDetailsPhoneBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_details_phone);
        binding = ActivityDetailsPhoneBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setContentView(R.layout.activity_details_phone);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
        int tab0 = getIntent().getIntExtra("TAB0",0);
        int tab1 = getIntent().getIntExtra("IMAGE_ID", 0);
        int tab2 = getIntent().getIntExtra("TAB2",0);
        int tab3 = getIntent().getIntExtra("TAB3",0);
        int tab4 = getIntent().getIntExtra("TAB4",0);
        int tab5 = getIntent().getIntExtra("TAB5",0);
        int tab6 = getIntent().getIntExtra("TAB6",0);
        int tab7 = getIntent().getIntExtra("TAB7",0);
        int tab8 = getIntent().getIntExtra("TAB8",0);
        int tab9 = getIntent().getIntExtra("TAB9",0);
        int tab10 = getIntent().getIntExtra("TAB10",0);
        ImageView imageView = findViewById(R.id.details_img);
      if (tab0 != 0) {
            imageView.setImageResource(tab0);
            // Set other details based on the tab ID, if needed
        }else if (tab1 != 0) {
            imageView.setImageResource(tab1);
            // Set other details based on the tab ID, if needed
        }else if (tab2 != 0) {
            imageView.setImageResource(tab2);
            // Set other details based on the tab ID, if needed
        }else if (tab3 != 0) {
            imageView.setImageResource(tab3);
            // Set other details based on the tab ID, if needed
        }else if (tab4 != 0) {
            imageView.setImageResource(tab4);
            // Set other details based on the tab ID, if needed
        }else if (tab5 != 0) {
            imageView.setImageResource(tab5);
            // Set other details based on the tab ID, if needed
        }else if (tab6 != 0) {
            imageView.setImageResource(tab6);
            // Set other details based on the tab ID, if needed
        }else if (tab7 != 0) {
            imageView.setImageResource(tab7);
            // Set other details based on the tab ID, if needed
        }else if (tab8 != 0) {
            imageView.setImageResource(tab8);
            // Set other details based on the tab ID, if needed
        }else if (tab9 != 0) {
            imageView.setImageResource(tab9);
            // Set other details based on the tab ID, if needed
        }else if (tab10 != 0) {
          imageView.setImageResource(tab10);
          // Set other details based on the tab ID, if needed
      }

    }
}