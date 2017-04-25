package Lab15;

import java.io.*;
import java.nio.file.*;
import java.util.Scanner;


/**
 * Created by PAS8 on 4/24/2017.
 */
public class CountriesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner ( System.in );
        final String FILENAME =  "countries.txt";
        int menuNum = 0;
        String newCountry;

        //Ensure file exist or create one
        CountriesTextFile.createFile (FILENAME);

        System.out.println ( "Welcome to the Countries Maintenance Application!" );
        do {
            //Menu with 3 options
            System.out.println ( "1 = See the list of countries" );
            System.out.println ( "2 = Add a country" );
            System.out.println ( "3 = Exit" );
            System.out.println ( "Enter menu number: " );
            menuNum = scan.nextInt ();
            scan.nextLine ();

            switch (menuNum) {
                case 1:
                    //Display list of all countries
                    CountriesTextFile.readFromFile (FILENAME);
                    break;
                case 2:
                    //Ask user to enter a country
                    System.out.println ("Enter country: ");
                    newCountry = scan.nextLine ();

                    //To write to file and add country
                    CountriesTextFile.writeToFile (FILENAME, newCountry);
                    break;
                case 3:
                    System.out.println ( "Buh-bye!" );
                    break;
                default:
                    System.out.println ( "You've entered an invalid value." );
                    break;
            }
        } while (menuNum != 3);
    }
}