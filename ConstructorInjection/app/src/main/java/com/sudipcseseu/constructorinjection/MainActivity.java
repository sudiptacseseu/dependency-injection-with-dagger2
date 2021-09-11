package com.sudipcseseu.constructorinjection;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sudipcseseu.constructorinjection.component.CarComponent;
import com.sudipcseseu.constructorinjection.component.DaggerCarComponent;
import com.sudipcseseu.constructorinjection.model.Car;

public class MainActivity extends AppCompatActivity {
    private Car car;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Dagger gives compile time DaggerCarComponent
        CarComponent component = DaggerCarComponent.create();
        car = component.getCar();
        car.drive();
    }
}