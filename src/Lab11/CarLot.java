package Lab11;

import java.util.ArrayList;
import java.util.Scanner;

public class CarLot {
    public static void main(String[] args) {

        String cont;
        Scanner scan = new Scanner ( "System.In" );

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car ("Honda","Pilot",2017,40000));
        carList.add(new Car ("Honda","Accord",2017,30000));
        carList.add(new Car ("Honda"," Civic",2017,20000));
        carList.add(new UsedCar ("Honda","Pilot",2016,35000,15000));
        carList.add(new UsedCar ("Honda","Accord",2015,25000,30000));
        carList.add(new UsedCar ("Honda","Civic",2014,10000,45000));

        do {
            System.out.println ("Please enter a car: ");
            scan.nextLine ();

            System.out.println ("Do you want to select another car?: ");
            cont = scan.nextLine ();
        } while (cont.equalsIgnoreCase ( "y" ));

    }
}
