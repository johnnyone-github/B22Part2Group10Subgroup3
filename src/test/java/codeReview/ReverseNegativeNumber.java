package codeReview;

import java.util.Arrays;

/**
 * Write a return method that can reverse negative number and return it as int
 */
public class ReverseNegativeNumber {
    public static void main(String[] args) {
        int test = -745;
        System.out.println(reverseNegativeNumber(test));
    }

    public static int reverseNegativeNumber(int num) {
        num = num * -1;
        String temp = String.valueOf(num);
        String temp2 = "";
        for (int i = temp.length() - 1; i > 0; i--) {
            temp2 += temp.charAt(i);
        }
        return Integer.parseInt(temp2) * -1;
    }
}
