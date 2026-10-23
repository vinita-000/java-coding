package code.practice;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int num[] = {4, 20, 7, 9, 3, 5, 0, 1, 6};

        int max = num[num.length - 1];
        System.out.println(max + " is a leader");
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] > max) {
                max = num[i];
                System.out.println(num[i] + " is a leader");
            }
        }
    }
}
