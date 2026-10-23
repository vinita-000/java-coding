package code.practice;

public class FindNumbersStartingWith1 {
    public static void main(String[] args) {
        int arr[] = {23, 45, 12, 4, 9, 13, 43, 19};

        for (int e : arr) {
            if (String.valueOf(e).charAt(0) == '1') {
                System.out.println(e);
            }
        }
    }

}
