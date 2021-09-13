package com.sudipcseseu.subcomponent.component;

import com.sudipcseseu.subcomponent.MainActivity;
import com.sudipcseseu.subcomponent.model.Car;
import com.sudipcseseu.subcomponent.module.DieselEngineModule;
import com.sudipcseseu.subcomponent.module.PetrolEngineModule;
import com.sudipcseseu.subcomponent.module.WheelModule;
import com.sudipcseseu.subcomponent.scope.ActivityScope;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

// Activity level Singleton with custom scope
@ActivityScope
// This component depends on app component to create a driver
// @Subcomponent(modules = {WheelModule.class, DieselEngineModule.class})
@Subcomponent(modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);

    // Subcomponent builder, this builder isn't needed for diesel engine module as it's not using binds
    /*@Subcomponent.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        ActivityComponent build();
    }**/

    // Subcomponent factory(alternative of builder)
    @Subcomponent.Factory
    interface Factory {
        ActivityComponent create(@BindsInstance @Named("horse power") int horsePower,
                                 @BindsInstance @Named("engine capacity") int engineCapacity);
    }
}
