package code.practice;

public class ReverseInteger {

    public static void main(String[] args) {
        int number = 5674;
        int rev = 0;
        int mod;
        int num = number;


        while(num>0){
            mod = num%10;
            rev = rev*10 + mod;
            num = num/10;
        }

        System.out.println("Reverse number: " + rev);
    }

}
