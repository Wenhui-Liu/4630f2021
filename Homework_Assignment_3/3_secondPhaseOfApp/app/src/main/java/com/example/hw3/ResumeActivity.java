package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;

import com.github.barteksc.pdfviewer.PDFView;

public class ResumeActivity extends AppCompatActivity {
    PDFView pdfview;
    RelativeLayout resume_relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        resume_relativeLayout = findViewById(R.id.relativelayout_more_page);
        pdfview = findViewById(R.id.resume_page_pdfview);
        pdfview.fromAsset("my_resume.pdf").load();
    }
}