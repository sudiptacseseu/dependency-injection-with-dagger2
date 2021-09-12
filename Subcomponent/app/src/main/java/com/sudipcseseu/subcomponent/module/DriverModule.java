package com.sudipcseseu.subcomponent.module;

import com.sudipcseseu.subcomponent.model.Driver;
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
