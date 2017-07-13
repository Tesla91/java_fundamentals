package main.java.exception.handling.self_test;

/**
 * Created by nicola on 7/13/17.
 */
// A character stack interface that throws exceptions.
interface ICharS {
    // Put a character into the stack.
    void push(char ch) throws StackFullException;

    // Get a character from the stack.
    char pop() throws StackEmptyException;
}