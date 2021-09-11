package com.sudipcseseu.interfacewithbinds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sudipcseseu.interfacewithbinds.component.CarComponent;
import com.sudipcseseu.interfacewithbinds.component.DaggerCarComponent;
import com.sudipcseseu.interfacewithbinds.model.Car;
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