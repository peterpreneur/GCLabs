package Assess2;

/**
 * Created by PAS8 on 4/19/2017.
 * Assessment 2, Part 2, No 2.
 */
public class PartTwo2 {

    public static void main(String[] args) {
        int fstVal = 0;
        System.out.println (fstVal + " is " + check(fstVal ));

        int secVal = 1;
        System.out.println (secVal + " is " + check(secVal ));
    }

    public static boolean check(int number){
        if (number == 0) {
            return true;
        } else {
            return false;
        }
    }
}
