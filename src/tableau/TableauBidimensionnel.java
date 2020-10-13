package tableau;

public class TableauBidimensionnel {
    public static void main(String[] args) {

        int[][] tableau = new int[4][5];

        tableau[0][0] = 15;
        tableau[0][1] = 21;
        tableau[0][2] = 18;
        tableau[0][3] = 9;
        tableau[0][4] = 15;

        tableau[1][0] = 10;
        tableau[1][1] = 52;
        tableau[1][2] = 17;
        tableau[1][3] = 19;
        tableau[1][4] = 7;

        tableau[2][0] = 19;
        tableau[2][1] = 2;
        tableau[2][2] = 19;
        tableau[2][3] = 17;
        tableau[2][4] = 7;

        tableau[3][0] = 92;
        tableau[3][1] = 13;
        tableau[3][2] = 13;
        tableau[3][3] = 32;
        tableau[3][4] = 41;

        for (int i = 0; i < 4; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                System.out.print(tableau[i][j] + " ");
            }
        }

    }
}
