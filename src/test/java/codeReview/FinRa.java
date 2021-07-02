package codeReview;

/**
 * Write a method which prints out the numbers from 1 to 30 but for
 * numbers which are a multiple of 3, print "FIN" instead of the
 * number and for numbers which are a multiple of 5, print "RA"
 * instead of the number. for numbers which are a multiple of both 3
 * and 5, print "FINRA" instead of the number.
 */

public class FinRa {
    public static void main(String[] args) {

        int max = 30;

        System.out.println(finra(max));
        finraTernary(max);

    }

    public static String finra(int max) {
        String result = "";

        for (int i = 1; i <= max; i++) {

            if (i % 15 == 0)        result += "FINRA\n";
            else if (i % 5 == 0)    result += "RA\n";
            else if (i % 3 == 0)    result += "FIN\n";
            else                    result += "" + i + "\n";

        }
        return result;
    }

    public static void finraTernary(int max) {

        String result = "";

        for (int i = 1; i <= max; i++) {

            result += (i % 15 == 0) ? "FINRA " : (i % 5 == 0) ? "RA " : (i % 3 == 0) ? "FIN " : i + " ";

        }
        System.out.println(result);
    }
}
