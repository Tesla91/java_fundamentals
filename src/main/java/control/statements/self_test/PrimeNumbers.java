package main.java.control.statements.self_test;


class PrimeNumbers{

    public static void main(String args[]){

        int a;
        int b;

        for (a = 2; a <= 100; a++) {
            boolean primeNum = true;
            for(b = 2; b < a; b++) {
                if (a % 2 == 0) {
                    primeNum = false;
                }

            }

            if (primeNum) {
                System.out.println(a);
            }
        }

    }
}