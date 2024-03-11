package com.example.myexercicio2;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
public class ReportActivity extends AppCompatActivity {

    TextView reportTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report);

        reportTextView = findViewById(R.id.reportTextView);


        String resultText = getIntent().getStringExtra("resultText");
        reportTextView.setText(resultText);
    }
}
