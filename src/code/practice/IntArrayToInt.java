package code.practice;

public class IntArrayToInt {
    public static void main(String[] args) {
        int nums[] = {10, 3, 40};
        double num = 0;
        for (int n : nums) {
            int dig = 0;
            dig = String.valueOf(n).length();
            num = num * Math.pow(10, dig) + n;
        }
        System.out.println((int) num);
    }
}
