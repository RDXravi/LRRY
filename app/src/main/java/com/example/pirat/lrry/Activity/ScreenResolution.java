
package com.example.pirat.lrry.Activity;

import android.util.DisplayMetrics;

/**
 * Created by pirat on 3/2/2017.
 */

public class ScreenResolution {

    public static DisplayMetrics dm;

    public ScreenResolution(DisplayMetrics dm){

        this.dm=dm;

    }

    public static int getHeight(){
        return dm.heightPixels;
    }

    public static int getWidth(){
        return dm.widthPixels;
    }

    public static int getDensity(){
        return dm.densityDpi;
    }

    public static int percent_of_width(int param){
        return ((param*(dm.widthPixels))/100);
    }

    public static int percent_of_height(int param){
        return ((param*(dm.heightPixels))/100);
    }
}
