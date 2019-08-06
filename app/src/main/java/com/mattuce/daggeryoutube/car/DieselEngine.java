package com.mattuce.daggeryoutube.car;

import android.util.Log;

import javax.inject.Inject;

public class DieselEngine implements Engine {
    private static final String TAG = "Car";

    private int mhorsePower;

    @Inject
    public DieselEngine(int horsePower) {
        this.mhorsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "Diesel engine start. Horsepower: " + mhorsePower);
    }
}
