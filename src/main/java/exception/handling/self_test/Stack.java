package main.java.exception.handling.self_test;

/**
 * Created by nicola on 7/13/17.
 */
public class Stack implements ICharS{
    // these members are now private
    private char s[]; // this array holds the stack
    private int pushloc, poploc; // the put and get indices

    Stack(int size) {
        s = new char[size]; // allocate memory for stack
        pushloc = poploc = 0;
    }

    // Put a character into the stack.
    synchronized public void push(char ch) throws StackFullException{
        if(pushloc==s.length) {
            throw new StackFullException(s.length);
        }
        pushloc = poploc;
        s[pushloc++] = ch;
    }

    // Get a character from the stack.
    synchronized public char pop() throws StackEmptyException{
        if(pushloc == 0) {
            throw new StackEmptyException();
        }

        pushloc--;
        return s[poploc--];

    }
}
