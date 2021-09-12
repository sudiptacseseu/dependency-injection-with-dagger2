package com.sudipcseseu.customscopewithcomponentdependency.module;

import com.sudipcseseu.customscopewithcomponentdependency.model.Engine;
import com.sudipcseseu.customscopewithcomponentdependency.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
