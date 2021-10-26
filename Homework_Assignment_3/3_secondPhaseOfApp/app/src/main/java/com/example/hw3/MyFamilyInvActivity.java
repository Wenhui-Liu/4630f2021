package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class MyFamilyInvActivity extends AppCompatActivity {
    RelativeLayout investment_myfamily_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_family_inv);

        investment_myfamily_relativeLayout = findViewById(R.id.relativelayout_investment_page_myfamily);
    }
}