package com.example.pirat.lrry.Activity;

import android.util.DisplayMetrics;

/**
 * Created by raja on 2/21/2017.
 */

public class resolution {
    public static DisplayMetrics metrics;
    public resolution(DisplayMetrics metrics)
    {
        this.metrics =  metrics;

    }
    public resolution()
    {

    }
    public int getwidth()
    {
        return metrics.widthPixels;
    }
    public int getheight()
    {
        return metrics.heightPixels;
    }

}
