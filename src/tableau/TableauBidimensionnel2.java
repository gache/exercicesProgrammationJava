package tableau;

public class TableauBidimensionnel2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {10, 15, 18, 19, 21},
                {5, 25, 37, 41, 15},
                {7, 19, 32, 14, 90},
                {85, 2, 7, 40, 27}
        };

/*
        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
*/

        for (int[] file : matrix) {
            System.out.println();
            for (int j : file) {
                System.out.print(j + " ");
            }
        }
    }
}
