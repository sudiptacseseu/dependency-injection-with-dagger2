package com.sudipcseseu.bindmodulewithbindinstance.module;

import com.sudipcseseu.bindmodulewithbindinstance.model.Engine;
import com.sudipcseseu.bindmodulewithbindinstance.model.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
