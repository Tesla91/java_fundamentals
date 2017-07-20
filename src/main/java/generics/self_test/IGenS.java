package main.java.generics.self_test;

import main.java.exception.handling.self_test.StackEmptyException;
import main.java.exception.handling.self_test.StackFullException;

/**
 * Created by nicola on 7/20/17.
 */
public interface IGenS<T> {
    // put an item into the stack
    void push(T obj) throws GenStackFullException;

    // get an item from the stack
    T pop () throws GenStackEmptyException;
}
