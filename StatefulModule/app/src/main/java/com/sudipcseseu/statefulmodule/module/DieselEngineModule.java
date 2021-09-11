package com.sudipcseseu.statefulmodule.module;
import com.sudipcseseu.statefulmodule.model.DieselEngine;
import com.sudipcseseu.statefulmodule.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    // To get the value at runtime
    private int horsePower;

    // As dagger doesn't know how to find horsePower, so we need to remove provides and create a constructor manually
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    Engine provideEngine() {
        return new DieselEngine(horsePower);
    }
}
