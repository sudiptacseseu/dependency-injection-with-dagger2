package com.sudipcseseu.statefulmodule.module;

import com.sudipcseseu.statefulmodule.model.Rim;
import com.sudipcseseu.statefulmodule.model.Tire;
import com.sudipcseseu.statefulmodule.model.Wheel;

import dagger.Module;
import dagger.Provides;

// If every method is static the class should be abstract
@Module
public abstract class WheelModule {
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
