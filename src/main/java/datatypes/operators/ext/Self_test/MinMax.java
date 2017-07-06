package main.java.datatypes.operators.ext.Self_test;

/**
 * Created by nicola on 7/6/17.
 */
public class MinMax {


// Find the minimum and maximum values in an array.

    public static void main(String args[]) {
        int nums[] = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;

        min = max = nums[0];
        for(int a : nums) {
            if(a < min) min = a;
            if(a > max) max = a;
        }
        System.out.println("min and max: " + min + " " + max);
    }

}
