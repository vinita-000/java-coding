package code.practice;

public class RemoveSpecialChars {

    public static void main(String[] args) {
        String str = "Vinit@123abc!";

        String output = str.replaceAll("[^A-Za-z]","");
        System.out.println(output);
    }
}
