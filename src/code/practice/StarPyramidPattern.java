package code.practice;

public class StarPyramidPattern {
    static String star = "*";

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= 5 - i) {
                    System.out.print(" ");
                }
            }
            System.out.print(star);
            System.out.println();
            star = star + "**";


        }
    }


}
