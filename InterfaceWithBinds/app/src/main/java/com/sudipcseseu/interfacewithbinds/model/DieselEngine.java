package com.sudipcseseu.interfacewithbinds.model;

import android.util.Log;
import javax.inject.Inject;

// To use engine interface we need to implement it on a custom class
public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    @Inject
    public DieselEngine() {
    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started");
    }
}
