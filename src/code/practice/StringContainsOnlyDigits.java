package code.practice;

public class StringContainsOnlyDigits {

    public static void main(String[] args) {
        String str = "12";

        if (str.matches("\\d+")) {
            System.out.println("String contains only digits");
        } else {
            System.out.println("String do not contains only digit");
        }
    }

}
