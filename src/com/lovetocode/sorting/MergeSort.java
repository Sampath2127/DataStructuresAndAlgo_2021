package com.lovetocode.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main( String[] args ) {
        int[] array = new int[]{ 5, 4, 2, 3, 6, 11, 8, 9, 7 };
        int[] sortedArr = mergeSort (array, 0, array.length-1);
        System.out.print ("Sorted Array: " + Arrays.toString (sortedArr));
    }

    private static int[] mergeSort( int[] array, int li, int ri ) { //li --> LeftIndex, ri --> RightIndex
        if ( li < ri ) {

            int mid = ( li + ri ) / 2;
            mergeSort (array, li, mid);
            mergeSort (array, mid + 1, ri);
            merge (array, li, mid, ri);

        }

        return array;
    }

    private static void merge( int[] arr, int li, int mid, int ri ) {

        int i = li, j = mid + 1, k = li;
        int[] mArr = new int[ri+1];

        while ( i <= mid && j <= ri ) {

            if ( arr[i] <= arr[j] ) {
                mArr[k] = arr[i];
                i++;
            } else {
                mArr[k] = arr[j];
                j++;
            }
            k++;
        }
        if ( i > mid ) {
            while ( j <= ri ) {
                mArr[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while ( i <= mid ) {
                mArr[k] = arr[i];
                i++;
                k++;
            }
        }

        for ( k = li; k <= ri; k++ ) {
            arr[k] = mArr[k];
        }
    }


}
