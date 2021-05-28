package codeReview;

/*
Write a return method that can reverse a String
Ex: Reverse("ABCD"); ==> DCBA
 */

import java.util.Arrays;

public class SortLettersNumbers2 {
    public static void main(String[] args) {
        String str = "sa324vk804sm";
        String str2 = str;
        String str3 = "";
        int i, j;
        for (j = 0; j < 5; j++) {
            for (i = 0; i < str2.length() - 1; i++) {
                String temp = "";
                if (Character.isLetter(str2.charAt(i)) && Character.isLetter(str2.charAt(i + 1))) {
                    if (str2.charAt(i + 1) < str2.charAt(i)) {
                        str2 = str2.substring(0, i) + str2.charAt(i + 1) + str2.charAt(i) + str2.substring(i + 2);
                        i++;
                    }
                }
                if (Character.isDigit(str2.charAt(i)) && Character.isDigit(str2.charAt(i + 1))) {
                    if (str2.charAt(i + 1) < str2.charAt(i)) {
                        str2 = str2.substring(0, i) + str2.charAt(i + 1) + str2.charAt(i) + str2.substring(i + 2);
                        i++;
                    }
                }
            }
            if (str2 == str3) {
                j = 6;
            }
            str3 = str2;
        }
        System.out.println(str2);
    }
}