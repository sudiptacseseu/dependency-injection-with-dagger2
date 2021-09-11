package com.sudipcseseu.statefulmodule;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sudipcseseu.statefulmodule.component.CarComponent;
import com.sudipcseseu.statefulmodule.component.DaggerCarComponent;
import com.sudipcseseu.statefulmodule.model.Car;
import com.sudipcseseu.statefulmodule.module.DieselEngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    //private Car car;

    // For field injection, this field can't be private
    @Inject
    Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // As we've created the constructor manually, we need to call builder and instantiate DieselEngineModule with horsePower
        CarComponent component = DaggerCarComponent.builder()
                .dieselEngineModule(new DieselEngineModule(100))
                .build();
        // Need to pass/inject current activity to the CarComponent while there is no constructor available
        component.inject(this);
        // car = component.getCar();
        car.drive();
    }
}