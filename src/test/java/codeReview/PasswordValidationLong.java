package codeReview;

/**
 * String -- Password Validation Task
 * 1. Write a return method that can verify if a password is valid or not.
 * requirements:
 * 1. Password MUST be at least have 6 characters and should not contain space
 * 2. PassWord should at least contain one upper case letter
 * 3. PassWord should at least contain one lowercase letter
 * 4. Password should at least contain one special characters
 * 5. Password should at least contain a digit
 */
public class PasswordValidationLong {

    public static void main(String[] args) {

        String str = "1AAuhkljhdffgz;!@$!@$pijoij";



        System.out.println(isPasswordValid(str));
    }

    public static boolean isPasswordValid(String str) {
        return str.length() > 5 && hasDigit(str) && hasLowerChar(str) && hasUpperChar(str) && hasSpecialCharacter(str) && !str.contains(" ");
    }

    public static boolean hasUpperChar(String password) {
        int countUpper = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                countUpper++;
            }
        }
        return countUpper >= 2;
    }

    public static boolean hasLowerChar(String str) {
        int countLower = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                countLower++;
            }
        }
        return countLower >= 1;
    }

    public static boolean hasDigit(String str) {
        int countDigit = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                countDigit++;
            }
        }
        return countDigit >= 1;
    }

    public static boolean hasSpecialCharacter(String str) {

        int countSpecial = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 33 && str.charAt(i) <= 47 ||
                    str.charAt(i) >= 58 && str.charAt(i) <= 64 ||
                    str.charAt(i) >= 91 && str.charAt(i) <= 96 ||
                    str.charAt(i) >= 123 && str.charAt(i) <= 126) {
                countSpecial++;
            }
        }
        return countSpecial >= 1;
    }

}
