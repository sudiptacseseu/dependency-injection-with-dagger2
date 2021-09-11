package com.sudipcseseu.modulewithproviders.component;

import com.sudipcseseu.modulewithproviders.MainActivity;
import com.sudipcseseu.modulewithproviders.model.Car;
import com.sudipcseseu.modulewithproviders.module.WheelModule;

import dagger.Component;

// The injector
@Component(modules = WheelModule.class)
public interface CarComponent {
    Car getCar();

    void inject(MainActivity mainActivity);
}
