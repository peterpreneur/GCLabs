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
 n           int numBats = scan.nextInt();
            int[] numBatsArr = new int[numBats];

            System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
            for (int i = 0; i < numBats; i++) {
                System.out.println("Result for at bat " + i + ": ");
                int inpInt= scan.nextInt();

                //Validate input so user can only enter positive integers
                while ((inpInt < 0) && (inpInt > 4)){
                    System.out.print("Please re-enter number between 0-4 :");
                    inpInt = scan.nextInt();
                }
                numBatsArr[i] = inpInt;

                //Add total bases
                totalBases += numBatsArr[i];
                //System.out.println("totalBases: " + totalBases);

                //Count number of bats on base
                if (numBatsArr[i] > 0){
                    cntOnBase ++;
                    //System.out.println(cntOnBase);
                }
            }

            //Outputs
            System.out.println("numBats: " + numBats);
            System.out.println("cntOnBase: " +  cntOnBase);
            System.out.println("totalBases: " + totalBases);

            System.out.println ("Batting average (cntOnBase/numBats): " + calcAvg ( numBats, cntOnBase ));
            System.out.println("Slugging percentage (totNumOfBases/numBats): " + calcPct (numBats, totalBases));

            scan.nextLine();
            System.out.println("Another batter? (y/n): ");
            cont = scan.nextLine();
        }while(cont.equalsIgnoreCase("y"));
        System.out.println ("Goodbye!");
    }

    //Methods to calculate batting average
    public static double calcAvg(int numBats, int cntOnBase) {
        return ((double)cntOnBase/numBats);
    }

    //Methods to calculate slugging percentage
    public static double calcPct(int numBats,int totNumOfBases) {
        return ((double)totNumOfBases/numBats);
    }
}