package codeReview;

/*
Write a return method that can reverse a String

Ex: Reverse("ABCD"); ==> DCBA
 */
public class StringReverse05 {
    public static void main(String[] args) {
        String data = "abcd";
        System.out.println(reverseString(data));
    }

    public static String reverseString(String str) {
        String str2 = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            str2 += "" + str.charAt(i);
        }
        return str2;
    }

}
