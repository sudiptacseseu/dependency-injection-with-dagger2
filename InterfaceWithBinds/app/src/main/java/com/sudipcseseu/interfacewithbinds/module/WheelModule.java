package com.sudipcseseu.interfacewithbinds.module;

import com.sudipcseseu.interfacewithbinds.model.Rim;
import com.sudipcseseu.interfacewithbinds.model.Tire;
import com.sudipcseseu.interfacewithbinds.model.Wheel;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {
    @Provides
    static Rim provideRim() {
        return new Rim();
    }
    @Provides
    static Tire provideTire() {
        Tire tire = new Tire();
        tire.inflate();
        return tire;
    }
    @Provides
    static Wheel provideWheel(Rim rim, Tire tire) {
        return new Wheel(rim, tire);
    }
}
