package codeReview;
/*
Write a method that can return the sum of the digits in a string
 */
public class SumOfDigitsInString {
    public static void main(String[] args) {
        String data = "1a20b3c4d6";
//        System.out.println(sumDigits(data));
        System.out.println(sum(data));
    }
//    public static int sumDigits(String str){
//        int sum = 0;
//        char [] ch = str.toCharArray();
//        for (char c : ch) {
//            if(Character.isDigit(c)){
//                sum += Integer.valueOf(c +"");
//            }
//        }
//        return sum;
//    }
    public static int sum(String str){
        int sum = 0;
        String num = "";

        for (int i = 0; i <= str.length() - 1; i++) {

            if(Character.isDigit(str.charAt(i)) && i== str.length()-1){
                sum += Integer.parseInt(str.charAt(i)+"");
                break;
            }

            if (Character.isDigit(str.charAt(i))) {
                num += "" + str.charAt(i);


                if (!Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }

        return sum;
    }
}
