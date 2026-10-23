package code.practice;

public class GeneralisedArmStrongNumber {

    public static void main(String[] args) {
        int num = 1523;
        int number = num;
        int l = String.valueOf(num).length();
        double result = 0;
        while (num > 0) {
            int mod = num % 10;
            result = result + Math.pow(mod, l);
            num = num / 10;
        }
        if (result == number) {
            System.out.println("Number Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }
    }
}
