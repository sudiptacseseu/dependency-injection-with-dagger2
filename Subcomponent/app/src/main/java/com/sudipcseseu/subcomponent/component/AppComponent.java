package com.sudipcseseu.subcomponent.component;

import com.sudipcseseu.subcomponent.model.Driver;
import com.sudipcseseu.subcomponent.module.DieselEngineModule;
import com.sudipcseseu.subcomponent.module.DriverModule;

import javax.inject.Singleton;

import dagger.Component;

// App level Singleton
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {

    // App component has the reference of activity component
    // ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule);


    // Call the subcomponent builder
    // ActivityComponent.Builder getActivityComponentBuilder();

    // Call the subcomponent factory
    ActivityComponent.Factory getActivityComponentFactory();
    @Component.Factory
    interface Factory {
        AppComponent create(DriverModule driverModule);
    }
}
