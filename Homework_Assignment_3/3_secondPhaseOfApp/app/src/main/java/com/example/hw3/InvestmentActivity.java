package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class InvestmentActivity extends AppCompatActivity {
    RelativeLayout investment_relativeLayout;
    private Button investmentpage_btn_my;
    private Button investmentpage_btn_myfamily;
    private Button investmentpage_btn_myfriend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_investment);

        investment_relativeLayout = findViewById(R.id.relativelayout_investment_page);

        investmentpage_btn_my = (Button) findViewById(R.id.investment_page_btn1);
        investmentpage_btn_my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openMyInvestmentActivity();
            }
        } );
        investmentpage_btn_myfamily = (Button) findViewById(R.id.investment_page_btn2);
        investmentpage_btn_myfamily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openMyFamilyInvestmentActivity();
            }
        } );
        investmentpage_btn_myfriend = (Button) findViewById(R.id.investment_page_btn3);
        investmentpage_btn_myfriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openMyFriendInvestmentActivity();
            }
        } );
    }
    public void openMyInvestmentActivity() {
        Intent intent = new Intent(this,WenhuiInvActivity.class);
        startActivity(intent);
    }
    public void openMyFamilyInvestmentActivity() {
        Intent intent = new Intent(this,MyFamilyInvActivity.class);
        startActivity(intent);
    }
    public void openMyFriendInvestmentActivity() {
        Intent intent = new Intent(this,FriendInvActivity.class);
        startActivity(intent);
    }
}