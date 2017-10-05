package com.example.thales.atividadesgoogleandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Thales on 05/10/2017.
 */

public class DebugActivity extends AppCompatActivity {
    protected static final String TAG = "livro";
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Log.i(TAG, getLocalClassName() + ".onCreate() chamado: " +icicle);
    }

    protected void onStart(){
        super.onStart();
        Log.i(TAG, getLocalClassName() + ".onStart() chamado.");
    }

    protected void onRestart(){
        super.onRestart();
        Log.i(TAG, getLocalClassName() + ".onRestart() chamado.");
    }

    protected void onResume(){
        super.onResume();
        Log.i(TAG, getLocalClassName() + "onResume() chamado.");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, getLocalClassName() + ".onPause() chamado.");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG, getLocalClassName() + "on.SaveInstanceState() chamado.");
    }

    protected void onStop(){
        super.onStop();
        Log.i(TAG, getLocalClassName() + ".onStop() chamado.");
    }

    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,getLocalClassName() + ".onDestroy () chamado.");
    }

    public String getLocalClassName(){
        String s = getClass().getName();
        return s.substring(s.lastIndexOf("."));
    }

}
