package codeReview;

public class PasswordValidationRegex {
    public static void main(String[] args) {
        String str = "a;slk123djfA@@$";

        System.out.println("PassWordvalidation(str) = " + PasswordValidation(str));
    }

    public static boolean PasswordValidation(String password) {

        String lowercase = "(.*[a-z].*)";
        String uppercase = "(.*[A-Z].*)";
        String numbers = "(.*[0-9].*)";
        String specialchars = "(.*[ -/, :-@].*)";


        boolean HasLower = password.matches(lowercase),
                HasUpper = password.matches(uppercase),
                HasDigits = password.matches(numbers),
                HasSpecial = password.matches(specialchars),
                Valid = false;

        if (password.length() >= 6 && !password.contains(" "))

            if (HasLower && HasUpper && HasDigits && HasSpecial)

                Valid = true;

        return Valid;

    }
}
