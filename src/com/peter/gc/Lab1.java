package com.peter.gc;
import java.util.Scanner;

/**
 * Created by pas8 on 4/10/2017.
 */

public class Lab1 {
    public static void main(String[] args) {
        float length, width, area, peri;
        String cont;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter Length: ");
            length = scan.nextFloat();
            System.out.println("Enter Width: ");
            width = scan.nextFloat();

            area = length * width;
            peri = (length + width) * 2;

            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + peri);
            scan.nextLine();

            System.out.println("Continue? (y/n): ");
            cont =scan.nextLine().toUpperCase();
        } while (cont.equals("Y"));
    }
}