package code.practice;

public class CheckPalindromeNumber {

    public static void main(String[] args) {
        int num = 10112;
        int number = num;
        int rev = 0;
        while(num>0){
            rev = rev*10 + num%10;
           num= num/10;
        }

        System.out.println(rev);
        if(number==rev){
            System.out.println("Number is palindrome");
        }

        else {
            System.out.println("Number is not palindrome");
        }
    }

}
