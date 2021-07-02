package codeReview;

/**
 * Numbers -- Prime Number
 * Write a method that can check if a number is prime or not.
 * Also write a method that will print all prime numbers in the range of 0 to num;
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        int num = 50;

        System.out.println(isPrime(23));

        printPrimeNumbersUsingBoolean(num);
        System.out.println();
        printPrimeNumbersUsingCounter(num);
    }

    public static boolean isPrime(int num) {

        if (num < 0) return false;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }

        return true;
    }

    public static void printPrimeNumbersUsingBoolean(int num) {

        for (int i = 2; i <= num; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {

                    isPrime = false;
                    break;
                }
            }

            if (isPrime) System.out.print(i + " ");
        }
    }

    /**
     * This method uses the same logic as the previous method.
     * The only difference is that the boolean value "isPrime" is replaced with an
     * "int count"
     *
     * @param num
     */
    public static void printPrimeNumbersUsingCounter(int num) {

        for (int i = 0; i < num; i++) {

            int count = 0;
            
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {

                    count++;
                }
            }

            //Depending on the ranges in our loops,
            //prime numbers can have the count == 2, 1 or 1;
            if (count == 1) System.out.print(i + " ");
        }
    }
}

