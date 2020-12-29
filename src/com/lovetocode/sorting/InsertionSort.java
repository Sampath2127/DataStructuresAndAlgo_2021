package com.lovetocode.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main( String[] args ) {
        int[] array = new int[]{5, 2, 3, 6, 8, 9};
        int[] sortedArr = insertionSort(array);
        System.out.print ("Sorted Array: "+ Arrays.toString (sortedArr));
    }

    private static int[] insertionSort( int[] array ) {
        for(int i=1; i< array.length; i++){
            int currentNumber = array[i], j=i;
            while(j>0 && array[j-1]>currentNumber ){
                array[j] = array[j-1];
                j--;
                array[j] = currentNumber;
            }
        }

        return array;
    }
}
