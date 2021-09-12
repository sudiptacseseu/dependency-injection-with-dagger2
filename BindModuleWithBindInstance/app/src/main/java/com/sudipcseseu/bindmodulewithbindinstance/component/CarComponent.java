package com.sudipcseseu.bindmodulewithbindinstance.component;

import com.sudipcseseu.bindmodulewithbindinstance.MainActivity;
import com.sudipcseseu.bindmodulewithbindinstance.model.Car;
import com.sudipcseseu.bindmodulewithbindinstance.module.DieselEngineModule;
import com.sudipcseseu.bindmodulewithbindinstance.module.PetrolEngineModule;
import com.sudipcseseu.bindmodulewithbindinstance.module.WheelModule;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

// This defines which engine to use and can't use both of them at a time
@Singleton
@Component(modules = {WheelModule.class, PetrolEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {
        // Named used to eliminated the confusion between two integers gor dagger
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        CarComponent build();
    }
}
