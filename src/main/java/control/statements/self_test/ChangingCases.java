package main.java.control.statements.self_test;

/**
 * Created by nicola on 7/4/17.
 */
public class ChangingCases {
    public static void main(String args[])
        throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.println("Enter a . to stop ");
        System.out.println("Enter any letter to change its case: ");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            if (ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        } while (ch != '.');
        System.out.println("Number of case changes: " + changes);
    }
}
