package com.lovetocode.recursion;

import java.util.Scanner;

public class Factorial {

    public static void main( String[] args ) {
        long n = new Scanner (System.in).nextLong ();
        System.out.println (findFactorial(n));
    }

    private static long findFactorial( long n ) {
        if(n == 1 ) return 1;

        return n * findFactorial (n-1);
    }
}
