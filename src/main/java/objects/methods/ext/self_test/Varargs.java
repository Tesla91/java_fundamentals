package main.java.objects.methods.ext.self_test;

/**
 * Created by nicola on 7/9/17.
 */
public class Varargs {

    static int sum(int ... v){
        int result = 0;

        for (int a = 0; a <v.length; a++)
            result +=v[a];
        return result;
    }
}

class VDemo{
    public static void main(String[] args) {
        Varargs obj = new Varargs();

        int sum2 = obj.sum(8, 15, 32);
        System.out.println("Sum is " + sum2);

        sum2 = obj.sum(7, 52, 68);
        System.out.println("Sum is " + sum2);
    }
}