package Misc;

import com.peter.gc.Lab1;

/**
 * Created by PAS8 on 4/20/2017.
 */
public class UsedCar extends Car {
    private double mileage;

    @Override
    public String toString(){
        return car.toString() + "\t" + price;
    }
}
