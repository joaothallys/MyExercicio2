package com.example.myexercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText1, editText2;
    Button button;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        resultTextView = findViewById(R.id.resultTextView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = editText1.getText().toString();
                String text2 = editText2.getText().toString();
                String result = text1 + " " + text2;
                //resultTextView.setText(result);

                // Enviar texto para a nova atividade
                Intent intent = new Intent(MainActivity.this, ReportActivity.class);
                intent.putExtra("resultText", result);
                startActivity(intent);
            }
        });
    }
}
