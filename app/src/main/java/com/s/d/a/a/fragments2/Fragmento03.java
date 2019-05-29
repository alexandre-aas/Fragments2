package com.s.d.a.a.fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmento03 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmento03, null);
        TextView text = (TextView) view.findViewById(R.id.text3);
        text.setText("Fragmento03! Texto 3.");
        return view;
    }
}
