package com.example.android.javainheritence;

import android.util.Log;

/**
 * Created by Shereen on 7/5/2018.
 */

//good name

public class Car {
    SportCar car;

    public Car() {
        Log.d("Car", "Car: this constructor takes one parameter");
        car = new SportCar();
    }
}
