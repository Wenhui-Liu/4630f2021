package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class WeatherActivity extends AppCompatActivity {
    RelativeLayout weather_relativeLayout;
    private Button display_views;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weather_relativeLayout = findViewById(R.id.relativelayout_weather_page);

        display_views = (Button) findViewById(R.id.weather_page_btn);
        display_views.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openDisViewActivity();
            }
        } );
    }
    public void openDisViewActivity() {
        Intent intent = new Intent(this,DisViewActivity.class);
        startActivity(intent);
    }
}