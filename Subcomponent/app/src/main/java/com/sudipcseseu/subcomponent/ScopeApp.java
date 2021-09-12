package com.sudipcseseu.subcomponent;

import android.app.Application;
import com.sudipcseseu.subcomponent.component.AppComponent;
import com.sudipcseseu.subcomponent.component.DaggerAppComponent;

// App level component, this will create only once
public class ScopeApp extends Application {
    private AppComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerAppComponent.create();
    }
    public AppComponent getAppComponent() {
        return component;
    }
}
