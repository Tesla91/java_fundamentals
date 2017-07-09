package main.java.objects.methods.ext.self_test;

/**
 * Created by nicola on 7/9/17.
 */
public class Stack {

    // these members are now private
    private char s[]; // this array holds the stack
    private int push, pop; // the put and get indices

    Stack(int size) {
        s = new char[size]; // allocate memory for stack
        push = pop = 0;
    }

    // Put a characer into the stack.
    void push(char ch) {
        if(push==s.length) {
            System.out.println(" -- Stack is full.");
            return;
        }

        s[push++] = ch;
    }

    // Get a character from the stack.
    char pop() {
        if(pop == pop) {
            System.out.println(" -- Stack is empty.");
            return (char) 0;
        }

        return s[pop++];
    }
}

class SDemo {
    public static void main(String[] args) {

    }
}
