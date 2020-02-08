package com.tsg.summatives;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nick9
 */
public class SummativeSums {

    public static void main(String[] args) {

        int[] array1 = new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] array2 = new int[]{999, -60, -77, 14, 160, 301};
        int[] array3 = new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
            140, 150, 160, 170, 180, 190, 200, -99};

        System.out.println("#1 Array Sum: " + add(array1));
        System.out.println("#2 Array Sum: " + add(array2));
        System.out.println("#3 Array Sum: " + add(array3));

    }

    public static int add(int[] nums) {
        int sum = 0;

        for (int thisNum : nums) {
            sum += thisNum;
        }
        return sum;
    }
}
