package code.practice;

public class OctalToDecimal {
    public static void main(String[] args) {
        String a = "100";
        double j = 0;
        int pow = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            j = j + (a.charAt(i) - '0') * Math.pow(8, pow);
            pow++;
        }
        System.out.println(j);
    }
}
