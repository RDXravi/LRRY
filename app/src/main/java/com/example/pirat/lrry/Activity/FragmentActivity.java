package com.example.pirat.lrry.Activity;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.pirat.lrry.R;

/**
 * Created by pirat on 2/11/2017.
 */

public class FragmentActivity extends Fragment implements View.OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment,container,false);
        Button b1 =(Button)view.findViewById(R.id.button1);
        b1.setOnClickListener(this);
        return view;

    }


    @Override
    public void onClick(View v) {
        MainActivity.change_fragment();
    }
}
