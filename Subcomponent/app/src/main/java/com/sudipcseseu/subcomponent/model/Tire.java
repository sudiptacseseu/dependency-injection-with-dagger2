package com.sudipcseseu.subcomponent.model;

import android.util.Log;

public class Tire {
    //Suppose we don't own this class so we can't annotate it with @Inject
    private static final String TAG = "Car";
    public void inflate() {
        Log.d(TAG, "Tires inflated");
    }
}
