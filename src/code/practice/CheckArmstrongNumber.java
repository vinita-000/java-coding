package code.practice;

public class CheckArmstrongNumber {

    public static void main(String[] args) {

        int num = 9474;
        int number = num;
        double result =0;

        String str = String.valueOf(num);
        int pow= str.length();

        while(num>0){
            result = result + Math.pow(num%10,pow);
            num = num/10;
        }

        if(number==result){
            System.out.println("Armstrong number");
        }

        else {
            System.out.println("Not Armstrong Number");
        }

    }

}
