package com.s.d.a.a.fragments2;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragmento02 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_fragmento02, null);
        TextView text = (TextView) view.findViewById(R.id.text2);
        text.setText("Fragmento02! Texto 2.");
        return view;
    }

    public void setTexto(String msg) {
        View view = getView();
        if (view != null) {
            TextView text = (TextView) view.findViewById(R.id.text2);
            text.setText(msg);
        }
    }
}
