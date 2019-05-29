package com.s.d.a.a.fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmento04 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmento04, null);
        TextView text = (TextView) view.findViewById(R.id.text4);
        text.setText("Fragmento04! Texto 4.");
        return view;
    }
}
