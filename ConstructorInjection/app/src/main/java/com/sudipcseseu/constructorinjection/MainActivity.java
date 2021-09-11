package com.sudipcseseu.constructorinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sudipcseseu.constructorinjection.component.CarComponent;
import com.sudipcseseu.constructorinjection.component.DaggerCarComponent;
import com.sudipcseseu.constructorinjection.model.Car;

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

        // Dagger gives compile time DaggerCarComponent
        CarComponent component = DaggerCarComponent.create();
        // Need to pass/inject current activity to the CarComponent while there is no constructor available
        component.inject(this);
        // car = component.getCar();
        car.drive();
    }
}