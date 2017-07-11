package main.java.objects.methods.ext.self_test;

/**
 * Created by nicola on 7/9/17.
 */
public class Stack {

    // these members are now private
    private char s[]; // this array holds the stack
    private int pushloc, poploc; // the put and get indices

    Stack(int size) {
        s = new char[size]; // allocate memory for stack
        pushloc = poploc = 0;
    }

    // Put a character into the stack.
    void push(char ch) {
        if(pushloc==s.length) {
            System.out.println(" -- Stack is full.");
            return;
        }
        pushloc = poploc;
        s[pushloc++] = ch;
    }

    // Get a character from the stack.
    char pop() {
        if(pushloc == 0) {
            System.out.println(" -- Stack is empty.");
            return (char) 0;
        }

        pushloc--;
        return s[poploc--];

    }
}

class SDemo {
    public static void main(String[] args) {

        Stack x = new Stack(5);
        x.push('a');
        x.push('b');
        char c = x.pop(); // = 'b'
        char a = x.pop(); // ='a'


    }
}
