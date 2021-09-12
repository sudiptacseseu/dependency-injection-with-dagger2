package com.sudipcseseu.subcomponent.module;

import com.sudipcseseu.subcomponent.model.Engine;
import com.sudipcseseu.subcomponent.model.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
