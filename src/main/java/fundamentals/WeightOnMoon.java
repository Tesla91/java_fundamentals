package main.java.fundamentals;

/**
 * Created by nicola on 7/3/17.
 */
class WeightOnMoon {
    public static void main (String [] args) {
        int weight;
        int weight_on_moon;

        weight = 145;

        System.out.println ("Weight on earth " + weight);

        weight_on_moon = weight * 17 / 100;

        System.out.println ("Weight on the moon " + weight_on_moon);
    }
}