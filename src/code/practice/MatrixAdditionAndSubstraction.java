package code.practice;

public class MatrixAdditionAndSubstraction {

    public static void main(String[] args) {
        int a[][] = {
                {5, 4, 7},
                {8, 4, 9},
                {1, 6, 8}
        };

        int b[][] = {
                {4, 8, 2},
                {6, 1, 3},
                {8, 2, 5}
        };

        int add[][] = new int[a.length][a[1].length];
        int sub[][] = new int[a.length][a[1].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                add[i][j] = a[i][j] + b[i][j];
                sub[i][j] = a[i][j] - b[i][j];
            }
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(add[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(sub[i][j]);
            }
            System.out.println();
        }

    }

}
