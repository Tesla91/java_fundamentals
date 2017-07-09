package main.java.objects.methods.ext.self_test;

/**
 * Created by nicola on 7/9/17.
 */
public class Recursive {
    String str;

    Recursive(String a){
        str = a;
    }
    void recursive(int b){
        if(b != str.length()-1) recursive(b+1);
        System.out.println(str.charAt(b));
    }
}
class RDemo {
    public static void main(String[] args) {
        Recursive a =  new Recursive ("Write this string backwards");
        a.recursive(0);
    }
}