package com.example.pirat.lrry.Activity;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.pirat.lrry.R;

/**
 * Created by pirat on 2/2/2017.
 */

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main_activity);

        fg = new FragmentActivity();
        fg2 = new FragmentSecondActivity();
        fgmgr = getFragmentManager();
        trans = fgmgr.beginTransaction();
        trans.add(R.id.fragment_container,fg,"yash");
        trans.commit();
        //this.onClick(R.id.fragment_container);

       // FrameLayout v = (FrameLayout) findViewById(R.id.fragment_container);
      //  v.setOnClickListener(this);
    }

    private static FragmentTransaction trans;
    private static FragmentManager fgmgr;
    private static FragmentActivity fg;
    private static FragmentSecondActivity fg2;

    public void onClick(View v) {

    }
    public static void change_fragment()
    {

        Log.d("Co","ewfcefewfcewf");
     //trans.remove(fg);
        //trans.replace(R.id.fragment_container,fg2,"yashyt");
        //trans.commit();

        FragmentTransaction t = fgmgr.beginTransaction();
        fg2 = new FragmentSecondActivity();
        t.replace(R.id.fragment_container, fg2);
        t.commit();

    }
}
