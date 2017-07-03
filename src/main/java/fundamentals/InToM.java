package main.java.fundamentals;

/**
 * Created by nicola on 7/3/17.
 */
class InToM {
    public static void main (String args[]) {
        double inches;
        double meters;
        int counter;

        counter = 0;
        for(inches = 1; inches <= 144; inches++) {
            meters = inches / 39.37;
            System.out.println(inches + "inches is " + meters + "meters.");

            counter++;
            if (counter == 12) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
