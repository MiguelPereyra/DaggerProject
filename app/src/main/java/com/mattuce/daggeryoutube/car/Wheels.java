package com.mattuce.daggeryoutube.car;

//Si esta clase fuera de una librería y no podemos modificarla
public class Wheels {
    private Rims mRims;
    private Tires mTires;

    public Wheels(Rims rims, Tires tires) {
        mRims = rims;
        mTires = tires;
    }
}
