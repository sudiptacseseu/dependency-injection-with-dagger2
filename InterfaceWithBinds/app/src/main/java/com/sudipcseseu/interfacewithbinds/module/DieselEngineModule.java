package com.sudipcseseu.interfacewithbinds.module;

import com.sudipcseseu.interfacewithbinds.model.DieselEngine;
import com.sudipcseseu.interfacewithbinds.model.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DieselEngineModule {
    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
