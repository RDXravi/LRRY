package com.example.pirat.lrry.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import com.example.pirat.lrry.R;

import ViewElements.DrawBorder;

/**
 * Created by pirat on 2/2/2017.
 */

public class Disclaimer extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.disclaimer_layout);
        LinearLayout ll = (LinearLayout)findViewById(R.id.ll);
        DrawBorder db = new DrawBorder(this);
        ll.addView(db);


    }




}
