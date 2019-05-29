package com.s.d.a.a.fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragmento01 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmento01, null);
        TextView text = (TextView) view.findViewById(R.id.text1);
        text.setText("Fragmento01! Texto 1.");
        return view;
    }

}
