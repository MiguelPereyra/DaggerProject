package com.mattuce.daggeryoutube.dagger;

import com.mattuce.daggeryoutube.car.DieselEngine;
import com.mattuce.daggeryoutube.car.Engine;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public class DieselEngineModule {
    private int mHorsePower;

    public DieselEngineModule(int horsePower) {
        mHorsePower = horsePower;
    }

    @Provides
    int provideHorsePower(){
        return mHorsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine){
        return engine;
    }
}
