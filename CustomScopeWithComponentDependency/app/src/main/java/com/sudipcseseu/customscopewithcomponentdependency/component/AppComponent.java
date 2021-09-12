package com.sudipcseseu.customscopewithcomponentdependency.component;

import com.sudipcseseu.customscopewithcomponentdependency.model.Driver;
import com.sudipcseseu.customscopewithcomponentdependency.module.DriverModule;

import javax.inject.Singleton;
import dagger.Component;

// App level Singleton
@Singleton
@Component(modules = DriverModule.class)
public interface AppComponent {
    Driver getDriver();
}
