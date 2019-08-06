package com.mattuce.daggeryoutube;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mattuce.daggeryoutube.car.Car;
import com.mattuce.daggeryoutube.dagger.CarComponent;
import com.mattuce.daggeryoutube.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);

        mCar.drive();
    }
}
