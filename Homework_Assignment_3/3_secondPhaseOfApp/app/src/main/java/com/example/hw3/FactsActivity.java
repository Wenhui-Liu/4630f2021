package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class FactsActivity extends AppCompatActivity {

    private ImageButton factspage_me;
    private ImageButton factspage_friend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facts);

        factspage_me = (ImageButton) findViewById(R.id.facts_page_ibtn_me);
        factspage_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openFactsMyActivity();
            }
        } );
        factspage_friend = (ImageButton) findViewById(R.id.facts_page_ibtn_friend);
        factspage_friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openFactsFriendActivity();
            }
        } );
    }
    public void openFactsMyActivity() {
        Intent intent = new Intent(this,FactsMyActivity.class);
        startActivity(intent);
    }
    public void openFactsFriendActivity() {
        Intent intent = new Intent(this,FactsFriendActivity.class);
        startActivity(intent);
    }
}