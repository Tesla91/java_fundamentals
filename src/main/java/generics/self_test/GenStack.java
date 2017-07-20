package main.java.generics.self_test;

/**
 * Created by nicola on 7/20/17.
 */
public class GenStack<T> implements IGenS<T> {
    // these members are now private
    private T s[]; // this array holds the stack
    private int tos; // the put and get indices

    public GenStack(T[] size) {
        s = size; // allocate memory for stack
        tos = 0; // top of stack
        
    }

    // Put a character into the stack.
    public void push(T obj) throws GenStackFullException {
        if(tos==s.length) {
            throw new GenStackFullException(s.length);
        }
        s[tos] = obj;
        tos++;
    }

    // Get a character from the stack.
    public T pop() throws GenStackEmptyException {
        if(tos == 0) {
            throw new GenStackEmptyException();
        }

        tos--;
        return s[tos--];

    }
}