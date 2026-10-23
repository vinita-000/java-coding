package code.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class PercentageOfUppLowDigSplChars {

    public static void main(String[] args) {
        String str = "ajbsd123AKFJ!#$#123ad";
        char ch[] = str.toCharArray();
        int lowerCaseCount = 0;
        int upperCaseCount = 0;
        int digitsCount = 0;
        int specialChars = 0;
        Map<String, Integer> map = new LinkedHashMap<>();

        for (char c : ch) {
            if (String.valueOf(c).matches("[a-z]")) {
                ++lowerCaseCount;
            } else if (String.valueOf(c).matches("[A-Z]")) {
                ++upperCaseCount;
            } else if (String.valueOf(c).matches("\\d+")) {
                ++digitsCount;
            } else {
                ++specialChars;
            }
        }
        System.out.println("UpperCase: " + upperCaseCount * 100.0 / str.length());
        System.out.println("Lowercase: " + lowerCaseCount * 100.0 / str.length());
        System.out.println("Digits: " + digitsCount * 100.0 / str.length());
        System.out.println("SpecialChars: " + specialChars * 100.0 / str.length());
    }

}
