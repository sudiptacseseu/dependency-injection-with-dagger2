package com.sudipcseseu.subcomponent;

import android.app.Application;
import com.sudipcseseu.subcomponent.component.AppComponent;
import com.sudipcseseu.subcomponent.component.DaggerAppComponent;
import com.sudipcseseu.subcomponent.module.DriverModule;

// App level component, this will create only once
public class ScopeApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        //component = DaggerAppComponent.create();

        // Pass driver name to the app component factory
        component = DaggerAppComponent.factory().create(new DriverModule("Jakir"));

    }
    public AppComponent getAppComponent() {
        return component;
    }
}
