package main.java.io;

import java.io.*;

/**
 * Created by nicola on 7/14/17.
 */
public class ClassChallenge {
    public static void main(String[] args) throws IOException
    {
        int i;

        // First, confirm that all three files has been specified.
        if(args.length != 3) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        // Writes a file to the disk using the 1st argument
        try (FileOutputStream fout = new FileOutputStream(args[0] + "nicola.txt"))
        {
            // Enters text into the file
            String sample = "Hello I/O";
            int a = 0;
            do {
                fout.write(sample.charAt(a));
                a++;
            } while(a < sample.length());

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }


        //Reads the file and copies it to the same directory with a new name that has been specified in the 2nd argument.
        try (FileOutputStream fout1 = new FileOutputStream(args[0] + args[1]);
             FileInputStream fin = new FileInputStream(args[0] + "nicola.txt"))
        {

            do {
                i = fin.read();
                if(i != -1) fout1.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        //Reads the file and writes it to the directory that was specified in the 3rd argument.
        try (FileOutputStream fout2 = new FileOutputStream(args[2] + args[1]);
             FileInputStream fin1 = new FileInputStream(args[0] + args[1]))
        {

            do {
                i = fin1.read();
                if(i != -1) fout2.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }

    }
}
