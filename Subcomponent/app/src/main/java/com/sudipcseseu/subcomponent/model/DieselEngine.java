package com.sudipcseseu.subcomponent.model;

import android.util.Log;
import javax.inject.Inject;

// To use engine interface we need to implement it on a custom class
public class DieselEngine implements Engine {
    private static final String TAG = "Car";
    private int horsePower;
    @Inject
    public DieselEngine(int horsePower) {
        this.horsePower = horsePower;
    }
    @Override
    public void start() {
        Log.d(TAG, "Diesel engine started. Horsepower: " + horsePower);
    }
}
