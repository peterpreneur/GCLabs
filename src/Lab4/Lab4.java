package Lab4;

import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Lab4 {
    public static void main(String[] args) {
        String cont;
        long fact = 1;
        int num;
        Scanner scan = new Scanner(System.in);
        StringBuffer text = new StringBuffer();

        do {
            System.out.println("Enter an integer between 1 to 10: ");
            num = scan.nextInt();
            scan.nextLine();

            if (num < 1 || num > 10) {
                System.out.println("Input needs to be between 1 to 10");
            } else {
                for (int i = 1; i <= num; i++) {
                    if (i == 1) {
                        //text = String.valueOf(i);
                        text.append(String.valueOf(i));
                    } else {
                        //text = text + " x " + String.valueOf(i);
                        text.append(" x " + String.valueOf(i));
                    }
                    fact = fact * i;
                    System.out.printf("%-50s", (i + "!" + "= " + text));
                    System.out.printf("%s %-10d \n", " which equals ", fact);
                }
            }
            System.out.println("Continue? (y/n): ");
            cont = scan.nextLine().toUpperCase();
        } while (cont.equals
                ("Y"));
    }
}