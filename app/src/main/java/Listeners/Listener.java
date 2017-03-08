package Listeners;

import android.content.Context;
import android.util.Log;
import android.view.View;

/**
 * Created by pirat on 3/9/2017.
 */

public class Listener implements View.OnClickListener {

    private Context cc;
    public Listener(Context context){
        this.cc=context;
    }

    @Override
    public void onClick(View v) {
        Log.d("rr","sdvnsdkvjnsdkuvhdslv");
    }
}
