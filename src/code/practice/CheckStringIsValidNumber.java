package code.practice;

public class CheckStringIsValidNumber {

    public static void main(String[] args) {

        String str = "1234";
            if(str.matches("\\d+")){
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
    }
}
