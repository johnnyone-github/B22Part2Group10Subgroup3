package codeReview;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
 *
 * Ex:
 * input:  {1,0,2,0,3,0,4,0};
 * output: [1, 2, 3, 4, 0, 0, 0, 0]
 */
public class ArraysMoveZerosToEnd {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 1, 2, 3};
        System.out.println(moveZeros(nums));
    }


    public static String moveZeros(int[] nums) {

        //move this int array to Array List, then a counter variable that count zeros
        // ditch the zeros in the arrayList, create a new empty array, put the numbers from the ARray list
        //into the array and then automatically, there will zeros at end


        //  int[] nums = {0, 0, 0, 1, 2, 3};
        //
       int[] nums2 = new int[nums.length];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums2[j] = nums[i];
                j++;

            }
        }

        return Arrays.toString(nums2);
    }

}
