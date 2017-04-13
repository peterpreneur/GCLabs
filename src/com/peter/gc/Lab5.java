package com.peter.gc;

import java.util.Random;
import java.util.Scanner;

/*
 * Created by pas8 on 4/13/2017.
*/

public class Lab5 {
    public static void main(String[] args) {
        String cont;

        do {
            Scanner scan = new Scanner(System.in);

            //ask user to enter the # of sides for a pair of dice
            System.out.println("How many sides should each die have?");
            int num = scan.nextInt();

            //prompt user to roll the dice
            System.out.println("Press any key to roll the dice.");
            cont = scan.nextLine();

            scan.nextLine();

            //diplay output
            for(int i=1;i<=2;i++){
                System.out.println(randNum(num));
            }

            System.out.println("Roll again? (y/n): ");
            cont = scan.nextLine().toUpperCase();
        } while (cont.equals("Y"));
    }

    public static int randNum(int numSides) {
        //generate random int
        Random rand = new Random();
        return rand.nextInt(numSides) + 1;
    }
}
