package com.sudipcseseu.constructorinjection.model;

import android.util.Log;
import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    //private Engine engine;
    private Wheel wheel;

    // Field injection
    @Inject
    Engine engine;

    // Constructor injection
    @Inject
    public Car(Wheel wheel) {
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
