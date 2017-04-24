package Lab12;

import java.util.Scanner;

/**
 * Created by PAS8 on 4/21/2017.
 */
public abstract class Player {
    //Create an abstract class name Player that stores a name and Roshambo value
    private String name;
    private int roshamboValue;

    //Abstract method that allows sub-class to generate and return a Roshambo value
    public abstract void generateRoshambo(int roshamboValue);

    public void askRPSSelection() {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Rock, paper, or scissors? (R/P/S): ");
        scan.nextInt();
    }
}
