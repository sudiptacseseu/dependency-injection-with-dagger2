package com.sudipcseseu.subcomponent.module;

import com.sudipcseseu.subcomponent.model.Driver;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public class DriverModule {

    private String driverName;
    public DriverModule(String driverName) {
        this.driverName = driverName;
    }

    @Provides
    @Singleton
    Driver provideDriver() {
        return new Driver(driverName);
    }
}
