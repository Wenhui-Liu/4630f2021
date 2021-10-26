package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class FactsMyActivity extends AppCompatActivity {
    RelativeLayout factsmyinfo_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts_my);

        factsmyinfo_relativeLayout = findViewById(R.id.relativelayout_factsmyinfo_page);
    }
}