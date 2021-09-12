package com.sudipcseseu.customscopewithcomponentdependency;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.sudipcseseu.customscopewithcomponentdependency.component.DaggerActivityComponent;
import com.sudipcseseu.customscopewithcomponentdependency.model.Car;
import com.sudipcseseu.customscopewithcomponentdependency.component.ActivityComponent;

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

        // Activity level component, that recreates when another activity creates
        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(120)
                .engineCapacity(1400)
                .appComponent(((ScopeApp) getApplication()).getAppComponent())
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