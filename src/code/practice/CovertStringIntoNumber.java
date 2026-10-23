package code.practice;

public class CovertStringIntoNumber {
    public static void main(String[] args) {
        String str = "1234";
        char c[] = str.toCharArray();
        int result = 0;

        for (char ch : c) {
            int digit = ch - '0';
            result = result * 10 + digit;
        }

        System.out.println(result);

    }

}
