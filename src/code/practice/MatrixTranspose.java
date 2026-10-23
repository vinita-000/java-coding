package code.practice;

public class MatrixTranspose {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2},
                {3, 4},
                {5, 6}
        };

        int result[][] = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                result[i][j] = arr[j][i];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
