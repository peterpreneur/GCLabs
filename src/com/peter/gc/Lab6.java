package com.peter.gc;

import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Lab6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cont, text;

        do {
            //prompt the us`    er for a word.
            System.out.println("Enter a word.");
            text = scan.nextLine().toLowerCase();

            //translate text to Pig Latin and display on console.
            char[] vowel = {'a', 'e', 'i', 'o', 'u'};
            char v = text.charAt(0);

            if ((v == 'a') || (v == 'e') || (v == 'i') || (v == 'o') || (v == 'u')) {
                text = text + "way";
            } else {
                int fstPos = 0;
                int flg = 0;
                for (int i = 0; i < 5; i++) {
                    int vowPos = text.indexOf(vowel[i]);

                    if ((vowPos != -1) ) {
                        if ((flg == 0)) {
                            fstPos = vowPos;
                            flg = 1;
                        } else if (vowPos < fstPos) {
                            fstPos = vowPos;
                        }
                    }
                }
                text = text.substring(fstPos, text.length()) + "ay";
            }

            System.out.println(text);

            //ask user if she wants to translate another word.
            System.out.println("Translate another word? (y/n): ");
            cont = scan.nextLine();
        } while (cont.equalsIgnoreCase("Y"));
    }
}
