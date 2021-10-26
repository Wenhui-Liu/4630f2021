package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class InitialActivity extends AppCompatActivity {
    RelativeLayout initial_relativeLayout;
    private Button initialpage_facts;
    private Button initailpage_more;
    private Button initialpage_resume;
    private Button initialpage_weather;
    private Button initialpage_investment;
    private Button initailpage_settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

        initial_relativeLayout = findViewById(R.id.relativelayout_initial_page);

        initialpage_facts = (Button) findViewById(R.id.initial_page_btn_facts);
        initialpage_facts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openFactsActivity();
            }
        } );
        initailpage_more = (Button) findViewById(R.id.initial_page_btn_more);
        initailpage_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openMoreActivity();
            }
        } );
        initialpage_resume = (Button) findViewById(R.id.initial_page_btn_resume);
        initialpage_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openResumeActivity();
            }
        } );
        initialpage_weather = (Button) findViewById(R.id.initial_page_btn_weather);
        initialpage_weather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openWeatherActivity();
            }
        } );
        initialpage_investment = (Button) findViewById(R.id.initial_page_btn_investment);
        initialpage_investment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openInvestmentActivity();
            }
        } );
        initailpage_settings = (Button) findViewById(R.id.initial_page_btn_settings);
        initailpage_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openSettingsActivity();
            }
        } );
    }
    public void openFactsActivity() {
        Intent intent = new Intent(this,FactsActivity.class);
        startActivity(intent);
    }
    public void openMoreActivity() {
        Intent intent = new Intent(this,MoreActivity.class);
        startActivity(intent);
    }
    public void openResumeActivity() {
        Intent intent = new Intent(this,ResumeActivity.class);
        startActivity(intent);
    }
    public void openWeatherActivity() {
        Intent intent = new Intent(this,WeatherActivity.class);
        startActivity(intent);
    }
    public void openInvestmentActivity() {
        Intent intent = new Intent(this,InvestmentActivity.class);
        startActivity(intent);
    }
    public void openSettingsActivity() {
        Intent intent = new Intent(this,SettingsActivity.class);
        startActivity(intent);
    }
}