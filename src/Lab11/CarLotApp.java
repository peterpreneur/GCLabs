package Lab11;

import java.util.ArrayList;

/**
 * Created by PAS8 on 4/21/2017.
 * IN PROGRESS
 */
public class CarLotApp {

    ArrayList<Car> carList = new ArrayList<>();



    //Display car

    public void displayCar(int Position){
        System.out.println("Contents of carlist: "+ carList);
    }

    //Add a car
    public void addCar(int Position){
        carList.add(Position);
    }

    //Remove a car
    public void removeCar(int Position){
        carList.remove(Position);
    }

    //Lookup a car in a given position
    public void lookUpCar(int Position){
        carList.remove(Position);
    }

    //Replace a car in a given position
    public void replaceCar(int Position){

    }

}
