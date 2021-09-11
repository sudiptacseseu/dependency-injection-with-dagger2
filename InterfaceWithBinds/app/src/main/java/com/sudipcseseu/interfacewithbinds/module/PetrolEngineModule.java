package com.sudipcseseu.interfacewithbinds.module;

import com.sudipcseseu.interfacewithbinds.model.Engine;
import com.sudipcseseu.interfacewithbinds.model.PetrolEngine;
import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {
    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
