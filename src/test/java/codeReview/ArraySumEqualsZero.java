package codeReview;

import java.util.Arrays;

/*
a single number will be provided and that number will be the size of an Array.

requirement: create a method that returns an array where:
all numbers in the Array are different
when all numbers in the Array are added together the total is 0
3,{0,1,-1} correct solution
 */
public class ArraySumEqualsZero {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumArray(5)));
    }

    public static int[] sumArray(int n){
        int[] Ary = new int[n];
        int sum = 0;
        for (int i = 0; i < n-1; i++) {
            Ary[i] = i;
            sum += i;
        }
        Ary[n-1] = -sum;
        return Ary;
    }
}
