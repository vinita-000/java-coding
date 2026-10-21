package code.practice;

public class SwapTwoStringsWithoutTemp {

    public static void main(String[] args) {
        String a = "Vinita";
        String b = "Deshmukh";

        a = a+b;
        b = a.substring(0,a.length()-b.length());
        a = a.substring(b.length());

        System.out.println("a: " +a+ " b: " +b);


    }

}
