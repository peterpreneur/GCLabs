package Assess2;

/**
 * Created by PAS8 on 4/19/2017.
 * Assessment 2, Part 2, No 3.
 */
public class PartTwo3 {

    public static void main(String[] args) {
        int[] array1 = {100,56,22,50,10,63,15};
        int pos = 0;

        //Loop thru each box in the array, compare the value, find the pos containing the lowest value.
        for (int i = 0; i < array1.length; i++) {
            if(array1[pos] > array1[i]) {
                pos = i;
            }
        }
        System.out.println ("The lowest number is " + array1[pos]);
    }

}
