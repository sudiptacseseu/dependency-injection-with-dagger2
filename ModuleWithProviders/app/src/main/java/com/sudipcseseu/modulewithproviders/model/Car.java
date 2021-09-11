package com.sudipcseseu.modulewithproviders.model;

import android.util.Log;
import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Engine engine, Wheel wheel) {
        this.engine = engine;
        this.wheel = wheel;
    }

    // Method injection(field and method injection are being called automatically if there is any constructor)
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "Car is driving!");
    }
}
