package com.android3.myapplication.Tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import com.android3.myapplication.R;

import java.util.ArrayList;

public class Tuan3MainActivity extends AppCompatActivity {

    ListView lv;
    T3Adapter adapter;

    ArrayList<T3Contact> ls = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan3_main);
        lv = findViewById(R.id.tuan3Lv);

        ls.add(new T3Contact("Nguyen Van A","18", R.drawable.ada1));
        ls.add(new T3Contact("Tran Van B","15", R.drawable.b));
        ls.add(new T3Contact("Nguyen Van C","12", R.drawable.c));
        ls.add(new T3Contact("Nguyen Van D","32", R.drawable.d));
        ls.add(new T3Contact("Nguyen Van A","18", R.drawable.e));
        ls.add(new T3Contact("Nguyen Van A","18", R.drawable.f));

        // tao adapter
        adapter=new T3Adapter(ls,this);
        lv.setAdapter(adapter);
    }
}