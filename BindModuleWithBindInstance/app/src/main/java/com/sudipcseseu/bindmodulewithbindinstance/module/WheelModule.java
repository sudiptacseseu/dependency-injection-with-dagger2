package com.sudipcseseu.bindmodulewithbindinstance.module;

import com.sudipcseseu.bindmodulewithbindinstance.model.Rim;
import com.sudipcseseu.bindmodulewithbindinstance.model.Tire;
import com.sudipcseseu.bindmodulewithbindinstance.model.Wheel;

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
