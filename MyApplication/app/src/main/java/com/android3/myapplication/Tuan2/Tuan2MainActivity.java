package com.android3.myapplication.Tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.android3.myapplication.R;

public class Tuan2MainActivity extends AppCompatActivity {

    EditText txt1 , txt2;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan2_main);
        txt1 = findViewById(R.id.numbertxt1);
        txt2 = findViewById(R.id.numbertxt2);
        btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(v -> {
            Intent i = new Intent(Tuan2MainActivity.this, showResultByIntent.class);

            i.putExtra("so1", txt1.getText().toString());
            i.putExtra("so2", txt2.getText().toString());

            startActivity(i);
        });
    }
}