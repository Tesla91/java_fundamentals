package main.java.control.statements.self_test;

/**
 * Created by nicola on 7/4/17.
 */
public class ProgressionLoop {
    public static void main(String args[]){

        for(int i =1; i < 100; i += i)
            System.out.print(i + " ");
    }
}
