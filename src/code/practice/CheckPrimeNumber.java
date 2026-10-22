package code.practice;

public class CheckPrimeNumber {

    public static void main(String[] args) {

        int num = 50;
        boolean isPrime = true;

        for (int i = 2; i < num/2; i++) {
            if (num % i == 0) {
                isPrime =false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not Prime");
        }


    }


}
