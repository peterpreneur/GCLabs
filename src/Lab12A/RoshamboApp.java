package Lab12A;


import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by PAS8 on 4/24/2017.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        String cont, opp ;
        System.out.println ( "Welcome to Rock Paper Scissors!" );

        System.out.println ( "Enter your name:" );
        String name = scan.nextLine ();

        Player opponent = null;
        Player user = new User ();

        System.out.println ( "Would you like to play against TheJets or TheSharks (j/s)?:" );
        opp = scan.nextLine ();
        do {
            switch (opp.toLowerCase ()) {
                case "j":
                    //This player will produce random value.
                    opponent = new Rock ();
                    break;
                case "s":
                    opponent = new Random ();
                    //This player will always select Rock.
                    break;
                default:
                    //Invalid value.
                    System.out.println ( "Please enter \"j\" for TheJets or \"s\"for TheSharks." );
                    opp = scan.nextLine ();
                    break;
            }
        } while (opp.equalsIgnoreCase ( "j" ) || opp.equalsIgnoreCase ( "s" ));

        do {
            System.out.println ( "Rock, paper, or scissors? (R/P/S): " );
            String yourpick = scan.nextLine ();
            switch (yourpick)
                case "R"


            user.setRoshamboVal (yourpick);

            //Output
            System.out.println ( name + ": " + yourpick );
            System.out.println ( oppName + ": " + yourpick );
            System.out.println ( result + " wins!" );

            System.out.println ( "Play again? (y/n)" );
            cont = scan.nextLine ();
        }while(cont.equalsIgnoreCase ( "y" ));
    }
}