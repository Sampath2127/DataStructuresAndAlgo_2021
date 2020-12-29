package com.lovetocode.recursion;

import java.util.Scanner;

public class Fibonacci {

    static long[] memoization;

    public static void main( String[] args ) {
        int n = new Scanner (System.in).nextInt ();
        memoization = new long[n+1];
        System.out.println (returnfibonacci(n));
    }

    private static long returnfibonacci( int n ) {
        if(n<0) throw new IllegalArgumentException ("Index negative is not possible for me .. please think..!");
        if(n==0 || n==1) return n;
        if(memoization[n]==0) {
            memoization[n] = returnfibonacci (n - 1) + returnfibonacci (n - 2);
        }else{
            return memoization[n];
        }
        return returnfibonacci (n-1) + returnfibonacci (n-2);
    }
}
