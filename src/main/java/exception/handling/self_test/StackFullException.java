package main.java.exception.handling.self_test;

/**
 * Created by nicola on 7/13/17.
 */
public class StackFullException extends Exception{
    int size;

    StackFullException(int s) { size = s; }

    public String toString() {
        return "\nStack is full. Maximum size is " +
                size;
    }

}
