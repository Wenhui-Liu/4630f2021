package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class DisViewActivity extends AppCompatActivity {
    RelativeLayout display_view_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dis_view);

        display_view_relativeLayout = findViewById(R.id.relativelayout_disview_page);
    }
}