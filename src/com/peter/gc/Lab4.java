package com.peter.gc;

import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Lab4 {
    public static void main(String[] args) {
        String cont;

        do {
            System.out.println("Enter an integer between 1 to 100: ");

            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            scan.nextLine();

            //if (num % 2 != 0) {
            if (num % 2 == 1) {
                if (num > 60) {
                    System.out.println(num + " is Odd and over 60");
                } else {
                    System.out.println(num + " is an Odd number.");
                }
            } else if (num >= 2 && num <= 25) {
                System.out.println(num + " is Even and less than 25.");
            } else if (num >= 26 && num <= 60) {
                System.out.println(num + " is Even.");
            } else {
                System.out.println(num + " is Even and greater than 60.");
            }
            System.out.println("Continue? (y/n): ");
            cont = scan.nextLine().toUpperCase();
        } while (cont.equals("Y"));
    }
}
