package com.mattuce.daggeryoutube.dagger;

import com.mattuce.daggeryoutube.car.Engine;
import com.mattuce.daggeryoutube.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine provideEngine(PetrolEngine engine);
}
