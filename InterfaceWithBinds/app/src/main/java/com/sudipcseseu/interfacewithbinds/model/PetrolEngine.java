package com.sudipcseseu.interfacewithbinds.model;

import android.util.Log;
import javax.inject.Inject;

// To use engine interface we need to implement it on a custom class
public class PetrolEngine implements Engine {
    private static final String TAG = "Car";
    @Inject
    public PetrolEngine() {
    }
    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started");
    }
}
