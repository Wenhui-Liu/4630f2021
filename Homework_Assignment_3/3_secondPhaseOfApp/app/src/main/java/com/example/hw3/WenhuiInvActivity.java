package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class WenhuiInvActivity extends AppCompatActivity {
    RelativeLayout investment_my_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wenhui_inv);

        investment_my_relativeLayout = findViewById(R.id.relativelayout_investment_page_my);
    }
}