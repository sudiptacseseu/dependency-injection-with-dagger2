package com.sudipcseseu.subcomponent;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.sudipcseseu.subcomponent.component.ActivityComponent;
import com.sudipcseseu.subcomponent.model.Car;
import com.sudipcseseu.subcomponent.module.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //private Car car;

    // For field injection, this field can't be private
    @Inject
    Car car1, car2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Activity level component, that recreates when another activity creates and this activity component is getting from app component
        // as activity component is a subclass of app component
        ActivityComponent component = ((ScopeApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(120));
        // Need to pass/inject current activity to the CarComponent while there is no constructor available
        component.inject(this);
        // car = component.getCar();

        // In this case, the same driver will drive both of the cars as driver is Singleton annotated and if we create 2 car components,
        // then it will not work as Singleton only works on a single component, if we create another one then it will create it's own Singleton
        car1.drive();
        car2.drive();
    }
}