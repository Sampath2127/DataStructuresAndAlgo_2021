package com.lovetocode.recursion;

public class HelloWorldRecursion {


    public static void main( String[] args ) {
        fooRecursion(7);
    }

    private static void fooRecursion( int i ) {
        if(i == 0){
            return;
        }

        fooRecursion (i-1);
        System.out.println ("Hello Recursion "+i);

    }
}
