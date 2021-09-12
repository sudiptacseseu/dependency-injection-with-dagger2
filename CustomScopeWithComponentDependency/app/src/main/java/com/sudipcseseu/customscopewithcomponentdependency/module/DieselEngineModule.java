package com.sudipcseseu.customscopewithcomponentdependency.module;
import com.sudipcseseu.customscopewithcomponentdependency.model.DieselEngine;
import com.sudipcseseu.customscopewithcomponentdependency.model.Engine;

import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int horsePower;
    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }
    @Provides
    int provideHorsePower() {
        return horsePower;
    }
    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
