package com.peter.gc;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        String input;
        do {

            System.out.println("Enter an number: "); //prompt
            Scanner scan = new Scanner(System.in); //Init scan
            long topNum = scan.nextLong();
            scan.nextLine();
            long i;
            int colL = 22;

            for (i = 0; i <= topNum; i++) {
                if (i == 0) {
                    System.out.printf("%" + colL + "s%" + colL + "s%" + colL + "s\n","Number","Squared","Cubed");
                    System.out.printf("%" + colL + "s%" + colL + "s%" + colL + "s\n","======","=======","=====");
                } else {
                    long sqr = i * i;
                    long cube = i * i * i;
                    System.out.printf("%" + colL + "d%" + colL + "d%" + colL + "d\n", i, sqr, cube);
                }
            }
            System.out.println("Continue? (y/n): ");
            input = scan.nextLine();

        } while (input.equalsIgnoreCase("y"));
    }
}
