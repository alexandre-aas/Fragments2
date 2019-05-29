package com.s.d.a.a.fragments2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class DebugActivity extends Activity {

    private static final String TAG = "conceito_fragment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "DebugActivity.onCreate(): " + getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "DebugActivity.onStart(): " + getClass().getSimpleName());
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "DebugActivity.onResume(): " + getClass().getSimpleName());
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "DebugActivity.onPause(): " + getClass().getSimpleName());
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "DebugActivity.onStop(): " + getClass().getSimpleName());
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "DebugActivity.onDestroy(): " + getClass().getSimpleName());
        super.onDestroy();
    }
}
