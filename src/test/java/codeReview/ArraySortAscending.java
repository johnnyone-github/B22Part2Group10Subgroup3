package codeReview;

import java.util.Arrays;

public class ArraySortAscending {
    public static void main(String[] args) {

        int[] arr = {78, 34, 1, 3, 90, 34, -1, -4, 6, 55, 20, -65};

        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }

}
