package codeReview;

import java.util.Arrays;
import java.util.Collections;

/**
 * [String -- Find the unique]
 * Write a return  method that can find the unique characters from the String
 * <p>
 * Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */
public class FindUnique {
    public static void main(String[] args) {
        String str = "AAABBBCCCDEF";
        System.out.println(str);

        System.out.println(findUnique(str));
        System.out.println(Unique(str));
    }

    public static String findUnique(String str) {

        String uniq = "";

        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                uniq += str.charAt(i);
            }
        }
        return uniq;
    }

    public static String Unique(String str) {

        String result ="";

        for(String each : str.split(""))

            result +=(  (Collections.frequency(Arrays.asList(str.split("")), each)) ==1 ) ? each : "";



        return result;

    }

}
