package Assess2;

import com.peter.gc.Lab1;

/**
 * Created by PAS8 on 4/19/2017.
 * Assessment 2, Part 2, No 1.
 */
public class PartTwo1 {

    public static void main(String[] args) {
        String test = "askfja;lskdjflaskdjkjaslkaskdfjaslkjf";
        int numVow = 0;

        //Loop thru each characters in string, checks whether or not it's a vowel and count how many there are.
        for (int i = 0; i < test.length(); i++) {
            int v = test.charAt(i);
            if ((v == 'a') || (v == 'e') || (v == 'i') || (v == 'o') || (v == 'u')) {
                numVow ++;
            }
        }

        System.out.println ("There are " + numVow + " vowel(s) in " + test);

    }
}
