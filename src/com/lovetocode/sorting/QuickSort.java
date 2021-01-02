package com.lovetocode.sorting;

import java.util.Arrays;

/*
* Time complexity in worst case is O(n^2) best and average cases tend to be O(nlogn)
*/
public class QuickSort {


    public static void main( String[] args ) {
        int[] array = new int[]{ 7, 6, 10, 5, 9, 2, 1, 15, 7, 21, 18, -2 };
        quickSort (array, 0, array.length - 1);
        System.out.println ("Sorted Array .. "+ Arrays.toString (array));
    }

    private static void quickSort( int[] array, int lb, int ub ) {

        if(lb < ub){
            int partitionLoc = partition (array, lb, ub);
            quickSort (array, lb, partitionLoc-1);
            quickSort (array, partitionLoc+1, ub );
        }

    }

    private static int partition(int[] array, int lb, int ub){
        int pivot = array[lb]; //choose the pivot element for partitioning the array
        int start = lb;
        int end = ub;

        while ( start < end ) {
            while ( array[start] <= pivot ) {
                start++;
                if(start>array.length-1) break;
            }
            while ( array[end] > pivot ) {
                end--;
            }
            if ( start < end ) {
                swap (array, start, end);
            }
        }
        // returned value is the pivot location after swap that splits into sub arrays to be sorted.
        return swap (array, lb, end);
    }

    private static int swap( int[] array, int start, int end ) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        return end;
    }
}
