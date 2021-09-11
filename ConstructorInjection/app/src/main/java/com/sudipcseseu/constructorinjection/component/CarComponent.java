package com.sudipcseseu.constructorinjection.component;

import com.sudipcseseu.constructorinjection.model.Car;
import dagger.Component;

// The injector
@Component
public interface CarComponent {
    Car getCar();
}
