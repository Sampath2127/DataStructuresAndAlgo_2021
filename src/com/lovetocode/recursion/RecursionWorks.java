package com.lovetocode.recursion;

public class RecursionWorks {


    private static int count = 0;
    public static void main( String[] args ) {
        int i=5, j=7, k=3;
        callYourSelf(i, j, k, "");
    }

    // Debug to get deep insights of recursion
    private static void callYourSelf( int i, int j, int k, String calledBy ) {

        if(i==0 || j==0 || k==0) return;
        count++;
        System.out.println ("Called By recursive method (" +  calledBy + ") i "+ i +" j "+ j + " k "+ k );
        callYourSelf (i-1, j, k, "i");
        callYourSelf (i, j-1, k, "j");
//        callYourSelf (i, j, k-1, "k");
        System.out.println ("Recursive methods called "+ count +" times ..!");
    }
}
