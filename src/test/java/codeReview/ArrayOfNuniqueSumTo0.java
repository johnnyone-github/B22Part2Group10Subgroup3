package codeReview;

import java.util.Arrays;

public class ArrayOfNuniqueSumTo0 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(sumZero(6)));

    }
public static int[] sumZero(int n){
        int[] a = new int[n];
    for (int i = 1; i <= n/2; i++) {
        a[i-1] = i;
        a[n-i] = -i;
    }
    return a;
}


    public static int[] sumZero2(int n){

        int[] a  = new int[n];
        int total = 0;
        for (int i = 0; i < n-1; i++) {
            a[i] = i;
            total += i;
        }
        a[n-1] = -total;
        return a;
    }
}
