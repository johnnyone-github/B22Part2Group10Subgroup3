package codeReview;

import java.util.Arrays;

/**
 * Array -- Sort Ascending
 * Write a return method that can sort an int array in
 * Ascending order without using the sort method of the Arrays class
 * Ex:
 * int[] arr = {10, 9, 8, 7};
 * arr = Sort(arr);  ==>{ 7, 8, 9, 10};
 */

public class ArraySortDescending {
    public static void main(String[] args) {

        int[] arr = {10, 9, 8, 7};

        //sorting logic
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                int temp = 0;

                if (arr[i] > arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
