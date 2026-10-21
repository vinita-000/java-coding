package code.practice;

public class ReverseString {

    public static void main(String[] args) {
        String name = "Vinita";

        char temp[] = name.toCharArray();

        StringBuilder rev = new StringBuilder();

        for (int i = temp.length - 1; i >= 0; i--) {

            rev.append(temp[i]);

        }

        System.out.println("Reverse: " + rev);
    }


}
