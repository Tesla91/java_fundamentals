package main.java.datatypes.operators.ext.Self_test;

/**
 * Created by nicola on 7/6/17.
 */
public class DoubleValues {

    public static void main(String[] args) {

        double array [] = { 1.5, 7.9, 4.6, 11.24, 9.35, 2.77, 8.22, 7.30, 7.28, 5.82};
        double sum = 0;

        for(double x: array) sum += x;

        System.out.println("The average double is " + sum / array.length);
    }





}


