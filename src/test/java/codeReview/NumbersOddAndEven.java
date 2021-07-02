package codeReview;

/**
 * write a method that determines if a number is odd or even
 */
public class NumbersOddAndEven {

    public static void OddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

    }

    /**
     * write a method that divides without using division. "/"
     */
    public static void divideNum(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("not a valid number");
            return;
        }
        int i = 0;
        for (i = 0; num1>=num2; i++) {
        num1 -= num2;
        }
        System.out.println(i+" remainder " +num1 );
    }
}

