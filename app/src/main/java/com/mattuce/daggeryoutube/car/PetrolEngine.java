package com.mattuce.daggeryoutube.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int mHorsePower;
    private int mEngineCapacity;

    @Inject
    public PetrolEngine(@Named("horse power") int horsePower,
                        @Named("engine capacity") int engineCapacity) {
        mHorsePower = horsePower;
        mEngineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "petrol engine started. " +
                "\nHorsepower: " + mHorsePower +
                "\nEngine capacity: " + mEngineCapacity);
    }
}
