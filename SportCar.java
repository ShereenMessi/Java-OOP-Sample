package com.example.android.javainheritence;

import android.util.Log;

/**
 * Created by Shereen on 7/5/2018.
 */

public class SportCar extends Car {
    public SportCar(){
        super();
        Log.d("SportCar", "SportCar: this is the child class");
    }
    public SportCar(int justAnotherParam){
        super();

        Log.d("SportCar", "SportCar: this is the child constructor with parameter");

    }
}
