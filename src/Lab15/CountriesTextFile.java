package Lab15;

import java.io.*;
import java.nio.file.*;

/**
 * Created by PAS8 on 4/24/2017.
 */
public class CountriesTextFile {

    //Create file method
    public static void createFile(String fileString) {
        Path filePath = Paths.get (fileString );

        if (Files.notExists ( filePath )) {
            System.out.println ( Files.notExists ( filePath ) );
            try {
                Files.createFile ( filePath );
            } catch (IOException e) {
                //e.printStackTrace ();
                System.out.println ( "There was an error: " + e );
            }
        }
    }

    //Read a list of countries
    public static void readFromFile(String fileString) {
        //Reference filename and pate
        Path filePath = Paths.get ( fileString );
        File fileName = filePath.toFile ();

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader ( fileName );

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader ( fileReader );
            try {
                //Read line by line
                while ((line = bufferedReader.readLine ()) != null) {
                    System.out.println ( line );
                }
                // Always close files.
                bufferedReader.close ();
            } catch (IOException e) {
                //e.printStackTrace ();
                System.out.println ( "There was an error: " + e );
            }
        } catch (FileNotFoundException e) {
            //e.printStackTrace ();
            System.out.println ( "There was an error: " + e );
        }
    }

    //Write a country
    public static void writeToFile(String fileString, String newCountry) {
        //Reference filename and pate
        Path filePath = Paths.get ( fileString );
        File fileName = filePath.toFile ();

        try {
            // Assume default encoding.
            PrintWriter fileWriter = new PrintWriter ( new FileOutputStream ( fileName, true ) );

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter ( fileWriter );

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write ( newCountry );
            bufferedWriter.newLine ();
            System.out.println ("This country has been saved!");

            // Always close files.
            bufferedWriter.close ();
        } catch (IOException e) {
            //e.printStackTrace ();
            System.out.println ( "There was an error: " + e );
        }
    }
}
