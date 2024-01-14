package com.android3.myapplication.Tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.android3.myapplication.R;

public class Tuan42MainActivity extends AppCompatActivity {
    Button btnGetData;
    TextView tvKQ;

    Context context = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan42_main);
        Tuan4VolleyFn volleyFn = new Tuan4VolleyFn();
        tvKQ = findViewById(R.id.tvQk);
        btnGetData = findViewById(R.id.btnQK);
        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                volleyFn.getJsonArrayOfObject(context, tvKQ);
            }
        });
    }
}