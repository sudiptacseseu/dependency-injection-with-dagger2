package com.sudipcseseu.modulewithproviders.module;

import com.sudipcseseu.modulewithproviders.model.Rim;
import com.sudipcseseu.modulewithproviders.model.Tire;
import com.sudipcseseu.modulewithproviders.model.Wheel;

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
