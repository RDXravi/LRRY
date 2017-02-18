package com.example.pirat.lrry.Activity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.example.pirat.lrry.Activity.MainActivity;
import com.example.pirat.lrry.R;

/**
 * Created by pirat on 2/1/2017.
 */

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Drawable d = this.getResources().getDrawable(R.drawable.IMG_20170128_WA0002);

        setContentView(R.layout.splash_layout);

    }

    @Override
    protected void onStart() {
        super.onStart();

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try{Thread.sleep(1500);
            }catch(Exception e){
                    e.printStackTrace();


                }

                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
                SplashActivity.this.finish();
            }


        });

        thread.start();

    }
}
