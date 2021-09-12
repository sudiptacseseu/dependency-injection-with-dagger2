package com.sudipcseseu.bindmodulewithbindinstance;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sudipcseseu.bindmodulewithbindinstance.component.CarComponent;
import com.sudipcseseu.bindmodulewithbindinstance.component.DaggerCarComponent;
import com.sudipcseseu.bindmodulewithbindinstance.model.Car;
import com.sudipcseseu.bindmodulewithbindinstance.module.DieselEngineModule;

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

        // We've created Builder interface and two bind instances to accept values for horse power and engine capacity from CarComponent
        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        // Need to pass/inject current activity to the CarComponent while there is no constructor available
        component.inject(this);
        // car = component.getCar();

        // In this case, the same driver will drive both of the cars as driver is Singleton annotated and if we create 2 car components,
        // then it will not work as Singleton only works on a single component, if we create another one then it will create it's own Singleton
        car1.drive();
        car2.drive();
    }
}