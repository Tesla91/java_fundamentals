package main.java.generics.self_test;

/**
 * Created by nicola on 7/20/17.
 */
public class GenStackFullException extends Exception{
    int size;

    GenStackFullException(int s) { size = s; }

    public String toString() {
        return "\nStack is full. Maximum size is " +
                size;
    }
}
