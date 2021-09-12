package com.sudipcseseu.customscopewithcomponentdependency.component;

import com.sudipcseseu.customscopewithcomponentdependency.MainActivity;
import com.sudipcseseu.customscopewithcomponentdependency.model.Car;
import com.sudipcseseu.customscopewithcomponentdependency.module.PetrolEngineModule;
import com.sudipcseseu.customscopewithcomponentdependency.module.WheelModule;
import com.sudipcseseu.customscopewithcomponentdependency.scope.ActivityScope;

import javax.inject.Named;
import dagger.BindsInstance;
import dagger.Component;

// Activity level Singleton with custom scope
@ActivityScope
// This component depends on app component to create a driver
@Component(dependencies = AppComponent.class, modules = {WheelModule.class, PetrolEngineModule.class})
public interface ActivityComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder horsePower(@Named("horse power") int horsePower);
        @BindsInstance
        Builder engineCapacity(@Named("engine capacity") int engineCapacity);
        Builder appComponent(AppComponent component);
        ActivityComponent build();
    }
}
