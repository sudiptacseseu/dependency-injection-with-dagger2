package com.sudipcseseu.statefulmodule.module;

import com.sudipcseseu.statefulmodule.model.Engine;
import com.sudipcseseu.statefulmodule.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
