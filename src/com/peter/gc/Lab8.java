package com.peter.gc;

import java.util.Scanner;

/**
 * Created by pas8 on 4/17/2017.
 * Lab 8 - Calculate batting average and slugging percentage for 1 or more players
 */
public class Lab8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont;
        float avgBats, pctSlug;
        int totalBases = 0, cntOnBase = 0;

        System.out.println("Welcome to Batting Average Calculator");

        do {
            System.out.print("Enter number of times at bat: ");
            int numBats = scan.nextInt();
            int[] numBatsArr = new int[numBats];

            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            for (int i = 0; i < numBats; i++) {
                System.out.print("Result for at bat " + i + ": ");
                int inpInt= scan.nextInt();

                //Validate input so user can only enter positive integers
                while ((inpInt < 0) && (inpInt > 4)){
                    System.out.print("Please re-enter number between 0-4 :");
                    inpInt = scan.nextInt();
                }
                numBatsArr[i] = inpInt;
                System.out.println(numBatsArr[i]);

                //Add total bases
                totalBases += numBatsArr[i];
                System.out.println(totalBases);

                //Count number of bats on base
                if (numBatsArr[i] > 0){
                    cntOnBase ++;
                    System.out.println(cntOnBase);
                }
            }

            System.out.println("Batting average: " + calcAvg(numBats,cntOnBase));
            System.out.println("Slugging percentage: " + calcPct(numBats, totalBases));

            scan.nextLine();
            System.out.println("Another batter? (y/n): ");
            cont = scan.nextLine();
        }while(cont.equalsIgnoreCase("y"));
    }

    //Methods to calculate batting average
    public static float calcAvg(int numBats, int cntOnBase) {
        return (cntOnBase/numBats);
    }

    //Methods to calculate slugging percentage
    public static float calcPct(int numBats,int totNumOfBases) {
        return (totNumOfBases/numBats);
    }

}
