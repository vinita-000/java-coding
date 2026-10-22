package code.practice;

public class AlphabeticTrianglePattern {

    public static void main(String[] args) {
        int n = 64; //96- lowercase-a
        char alpha = 'A';
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (n + j));
            }
            System.out.println();
        }
    }

}
