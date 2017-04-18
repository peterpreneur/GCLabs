package com.peter.gc;

/**
 * Created by pas8 on 4/17/2017.
 */
public class Lab8 {
    public static void main(String[] args) {
        int[] arrNums = new int[5];
        for (int i = 0; i < arrNums.length; i++) {
            arrNums[i] = i + 1;
            System.out.println(arrNums[i]);
            System.out.println("break");
        }
    }
}
