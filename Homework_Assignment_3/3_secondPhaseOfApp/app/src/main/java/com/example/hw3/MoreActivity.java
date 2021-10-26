package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MoreActivity extends AppCompatActivity {
    RelativeLayout more_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        more_relativeLayout = findViewById(R.id.relativelayout_more_page);
    }
}