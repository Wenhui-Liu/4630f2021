package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class FactsFriendActivity extends AppCompatActivity {
    RelativeLayout factsmyfriendinfo_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts_friend);

        factsmyfriendinfo_relativeLayout = findViewById(R.id.relativelayout_factsmyfriendinfo_page);
    }
}