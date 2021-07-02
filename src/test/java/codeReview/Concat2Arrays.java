package codeReview;

import java.util.Arrays;
import java.util.Random;

/**
 * Array -- Concat two arrays
 * Write a return method that can concatenate two arrays
 */

public class Concat2Arrays {
    public static void main(String[] args) {

        //Creating a Random object to assign random numbers to our arrays.
        //Just for fun.
        Random r = new Random();

        //Declaring and initializing our first array of a random size.
        int[] a1 = new int[r.nextInt(10)];

        //Assigning random numbers to our array.
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt(99);
        }

        //Declaring and initializing our second array of a random size.
        int[] a2 = new int[r.nextInt(10)];

        //Assigning random numbers to our second array.
        for (int i = 0; i < a2.length; i++) {
            a2[i] = r.nextInt(99);
        }

        //Printing to see our randomly generated arrays.
        System.out.println("first  array: " + Arrays.toString(a1));
        System.out.println("second array: " + Arrays.toString(a2));

        //calling our first method.
        System.out.println("\n***FOR LOOP METHOD***");
        concatArrays(a1, a2);
        //calling our second method (Canvas solution).
        System.out.println();
        System.out.println("***FOR EACH LOOP METHOD***");
        concatArraysForEach(a1, a2);
    }


    //Solution using the regular for loop.
    public static void concatArrays(int[] a, int[] b) {
        int[] ab = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            ab[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            ab[i + a.length] = b[i];
        }
        System.out.println(Arrays.toString(ab));
    }

    //Solution from Canvas. Same logic, using the for each loop.
    public static void concatArraysForEach(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];

        int indx = 0;
        for (int each : a) {
            result[indx] = each;
            indx++;
        }
        for (int each : b) {
            result[indx] = each;
            indx++;
        }
        System.out.println(Arrays.toString(result));
    }


}
