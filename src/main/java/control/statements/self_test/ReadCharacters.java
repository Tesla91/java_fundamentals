package main.java.control.statements.self_test;

/**
 * Created by nicola on 7/4/17.
 */


public class ReadCharacters {
    public static void main (String args[])
        throws java.io.IOException {

        char ch;
        int NumSpaces = 0;

        System.out.println("Enter a . to stop: ");
        do {

            ch = (char) System.in.read();
            if (ch == ' ') NumSpaces++;
        } while (ch != '.');

        System.out.println("Number of spaces: " + NumSpaces);
    }

}
