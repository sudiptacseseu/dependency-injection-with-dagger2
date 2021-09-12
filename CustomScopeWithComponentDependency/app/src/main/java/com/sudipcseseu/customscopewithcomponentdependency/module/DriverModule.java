package com.sudipcseseu.customscopewithcomponentdependency.module;

import com.sudipcseseu.customscopewithcomponentdependency.model.Driver;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {
    @Provides
    @Singleton
    static Driver provideDriver() {
        return new Driver();
    }
}
