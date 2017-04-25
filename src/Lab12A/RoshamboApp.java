package Lab12A;


import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by PAS8 on 4/24/2017.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println ("Welcome to Rock Paper Scissors!");

        System.out.println ("Enter your name:");
        String name = scan.nextLine();

        System.out.println ("Would you like to play against TheJets or TheSharks (j/s)?:");
        String opp = scan.nextLine();
        switch (opp.toLowerCase ()) {
            case "j":
                //This player will produce random value.

                break;
            case "s":
                //This player will always select Rock.
                break;
            default:
                //Invalid value.
                System.out.println ("Please enter \"j\" for TheJets or \"s\"for TheSharks.");
                break;
        }


        System.out.println ("Rock, paper, or scissors? (R/P/S): ");
        scan.nextLine ();


    }
}
