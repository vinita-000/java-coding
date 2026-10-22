package code.practice;

public class Print1to100WithoutUsingDigits {

    public static void main(String[] args) {

        String a = "*";
        String b = "**********";

        for(int i=a.length(); i<=b.length()*b.length(); i++){
            System.out.println(i);
        }

    }

}
