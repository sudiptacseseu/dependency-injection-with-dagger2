package com.sudipcseseu.statefulmodule.component;

import com.sudipcseseu.statefulmodule.MainActivity;
import com.sudipcseseu.statefulmodule.model.Car;
import com.sudipcseseu.statefulmodule.module.DieselEngineModule;
import com.sudipcseseu.statefulmodule.module.WheelModule;

import dagger.Component;

// This defines which engine to use and can't use both of them at a time
@Component(modules = {WheelModule.class, DieselEngineModule.class})
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
