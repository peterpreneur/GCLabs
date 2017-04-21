package Lab7;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by pas8 on 4/17/2017.
 */

public class Lab7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont, cate;
        final int NUMOFSTUDENT = 20;

        //Prompt use to enter a student ID
        System.out.println("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-20)");
        int stuId = scan.nextInt();

        //ensure user are entering valid student number - not higher
        // than NOMOFSTUDENT
        while (stuId < 0 || stuId > NUMOFSTUDENT) {
            System.out.println("That student does no exist. Please try again " + "(enter a number 1-20): ");
            stuId = scan.nextInt();
        }
        scan.nextLine();

        int i = stuId - 1;
        System.out.println("Student " + stuId + " is " + stuFName(i) + " " + stuLName(i) + ". What would you like to know about " + stuFName(i) + "?" + " (enter or \"hometown\" or \"favorite food\"): ");
        cate = scan.nextLine();

        do {
            switch (cate) {
                case "hometown":
                    System.out.println(stuFName(i) + " is from " + stuCity(i) + "," + stuState(i) + ". " + "Would you like to know  more? " + " (enter \"yes\" or \"no\"): ");
                    cont = scan.next();
                    break;
                case "favorite food":
                    System.out.println(stuFName(i) + "'s favorite food is " + stuFood(i) + ". " + "Would you like to know  more? " + " (enter \"yes\" or \"no\"): ");
                    cont = scan.next();
                    break;
                default:
                    System.out.println("That data does not exist. Please try again.  (enter \"hometown\" or \"favorite food\"): ");
                    cate = scan.nextLine();
                    cont = "y";
                    break;
            }

        }while(cont.equalsIgnoreCase("y"));
        System.out.println("Thanks!");
    }

    public static String stuFName(int stuID) {
        String[] stuFName = {"FName1", "FName2", "FName3","FName4","FName5","FName6", "FName7", "FName8","FName9","FName10","FName11", "FName12", "FName13","FName14","FName15","FName16", "FName17", "FName18","FName19","FName20"};
        return stuFName[stuID];
    }

    public static String stuLName(int stuID) {
        String[] stuLName = {"LName1", "LName2", "LName3","LName4","LName5","LName6", "LName7", "LName8","LName9","LName10","LName11", "LName12", "LName13","LName14","LName15","LName16", "LName17", "LName18","LName19","LName20"};
        return stuLName[stuID];
    }

    public static String stuCity(int stuID) {
        String[] stuCity = {"City1", "City2", "City3","City4","City5","City6", "City7", "City8","City9","City10","City11", "City12", "City13","City14","City15","City16", "City17", "City18","City19","City20"};
        return stuCity[stuID];
    }

    public static String stuState(int stuID) {
        String[] stuState = {"State1", "State2", "State3","State4","State5","State6", "State7", "State8","State9","State10","State11", "State12", "State13","State14","State15","State16", "State17", "State18","State19","State20"};
        return stuState[stuID];
    }

    public static String stuFood(int stuID) {
        String[] stuFood = {"Food1", "Food2", "Food3","Food4","Food5","Food6", "Food7", "Food8","Food9","Food10","Food11", "Food12", "Food13","Food14","Food15","Food16", "Food17", "Food18","Food19","Food20"};
        return stuFood[stuID];
    }
}
