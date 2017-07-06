package main.java.datatypes.operators.ext.Self_test;

/**
 * Created by nicola on 7/6/17.
 */
public class XOREncode {

    // Use XOR to encode and decode a message with 8 character string.

    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        int j;

        String key = "abcdefgh";

        System.out.print("Original message: ");
        System.out.println(msg);

        // encode the message
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.print("Encoded message: ");
        System.out.println(encmsg);

// decode the message
        j = 0;
        for (int i = 0; i < msg.length(); i++){
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }
        System.out.print("Decoded message: ");
        System.out.println(decmsg);
    }

}
