package Lab12;

import java.util.Scanner;

/**
 * Created by PAS8 on 4/21/2017.
 * Lab12 : Create a rock, paper, scissors game.
 * IN PROGRESS
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        System.out.println ( "Welcome to Rock Paper Scissors!" );

        //Prompt user for name
        System.out.println ( "Enter your name: " );
        scan.nextLine ();

        //Select opponent
        System.out.println ( "Would you like to play against TheJets or TheSharks (j/s): " );
        String opp = scan.nextLine ().toLowerCase ();

        switch (opp) {
            case "j":
                System.out.println ("TheJets");
                break;
            case "s":
                System.out.println ("TheSharks");
                break;
            case "3":
                System.out.println ("TheSharks");
                break;
            default:
                System.out.println ("TheSharks");
        }

        //Select selection
        System.out.println ( "Rock, paper, or scissors? (R/P/S)" );
        String choice = scan.nextLine ().toLowerCase ();

        switch (choice) {
            case "r":
                System.out.println ("Rock");
                Roshambo.RoshamboEnum.ROCK.toString ();
                break;
            case "p":
                //Roshambo(2);
                break;
            case "s":
                //Roshambo(3);
                break;
            default:
                System.out.println ("Invalid selection. Please enter R/P/S:");
        }
    }


    //Human, Random, Rock

    //Match
    //User select R, P, S
    //Opp select R, P, S

    //User select R
    //Opp select S
    //Output

}
