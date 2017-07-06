package main.java.datatypes.operators.ext.Self_test;

/**
 * Created by nicola on 7/6/17.
 */
public class Sort {


    public static void main(String args[]) {
        String words[] = { "this", "is", "my", "string", "sort" };

        int a, b;
        String t;
        int size;

        size = words.length; // number of elements to sort

        // display original array
        System.out.print("Original array is:");
        for(int i = 0; i < size; i++)
            System.out.print(" " + words[i]);
        System.out.println();

        // This is the Bubble sort with strings.
        for(a = 1; a < size; a++)
            for(b = size -1; b >= a; b--) {
                if(words[b-1] .compareTo(words[b])> 0) { // if out of order
                    // exchange elements
                    t = words[b-1];
                    words[b-1] = words[b];
                    words[b] = t;
                } }

        // display sorted array
        System.out.print("Sorted array is:");
        for(int i=0; i < size; i++)
            System.out.print(" " + words[i]);
        System.out.println();
     }
}
