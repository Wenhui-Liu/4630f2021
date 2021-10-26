package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

public class FriendInvActivity extends AppCompatActivity {
    RelativeLayout investment_myfriend_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_inv);

        investment_myfriend_relativeLayout = findViewById(R.id.relativelayout_investment_page_myfriend);
    }
}