package com.sudipcseseu.subcomponent.model;

import android.util.Log;
import com.sudipcseseu.subcomponent.scope.ActivityScope;
import javax.inject.Inject;

@ActivityScope
public class Car {
    private static final String TAG = "Car";
    private Driver driver;
    private Engine engine;
    private Wheel wheel;

    @Inject
    public Car(Driver driver, Engine engine, Wheel wheel) {
        this.driver = driver;
        this.engine = engine;
        this.wheel = wheel;
    }

    // Method injection(field and method injection are being called automatically if there is any constructor)
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        // This will show which engine is running
        engine.start();
        Log.d(TAG, driver + " " + driver.name + " drives " + this);
    }
}
