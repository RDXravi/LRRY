package com.example.pirat.lrry.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.pirat.lrry.R;

import Listeners.Listener;
import ViewElements.ActionBArText;
import ViewElements.BookPresButton;
import ViewElements.DrawBorder;

/**
 * Created by pirat on 2/2/2017.
 */

public class Disclaimer extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout l = new RelativeLayout(this);
        l.setBackgroundColor(Color.parseColor("#FFD4D2D2"));
        DrawBorder db = new DrawBorder(this);
        ActionBArText action_text = new ActionBArText(this);
        BookPresButton Book_button = new BookPresButton(this);
        //Book_button.setLayoutParams(new FrameLayout.LayoutParams());
        Book_button.setFocusableInTouchMode(true);
        Book_button.setOnClickListener(new Listener(this));

        l.addView(db);
        l.addView(action_text);
        l.addView(Book_button);


        setContentView(l);
        //LinearLayout ll = (LinearLayout)findViewById(R.id.ll);



    }




}
