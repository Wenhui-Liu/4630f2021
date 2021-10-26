package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private Button mainpage_aboutMe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainpage_aboutMe = (Button) findViewById(R.id.hw2_button1);
        mainpage_aboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openInitialActivity();
            }
        } );
    }
    public void openInitialActivity() {
        Intent intent = new Intent(this,InitialActivity.class);
        startActivity(intent);
    }
}