package codeReview;

public class Numbers_PrintConsecutiveNumbers {
    public static void main(String[] args) {
        printConsecutiveNumbers(24);
    }

    public static void printConsecutiveNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0 && i % 3 != 0 && i % 5 != 0){
                System.out.println(i);
                continue;
            }
            if (i % 2 == 0) {
                System.out.print("Codility");
            }
            if (i % 3 == 0) {
                System.out.print("Test");
            }
            if (i % 5 == 0) {
                System.out.print("Coders");
            }
            System.out.println("");
        }
//comment
    }
}

