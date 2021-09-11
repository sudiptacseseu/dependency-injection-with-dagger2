package com.sudipcseseu.interfacewithbinds.component;

import com.sudipcseseu.interfacewithbinds.MainActivity;
import com.sudipcseseu.interfacewithbinds.model.Car;
import com.sudipcseseu.interfacewithbinds.module.DieselEngineModule;
import com.sudipcseseu.interfacewithbinds.module.WheelModule;

import dagger.Component;

// This defines which engine to use and can't use both of them at a time
@Component(modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
