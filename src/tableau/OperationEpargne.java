package tableau;

public class OperationEpargne {
    public static void main(String[] args) {
        double benefice;
        double taux = 0.10;

        double[][] capital = new double[6][5];

        for (int i = 0; i < 6; i++) {
            capital[i][0] = 10000;
            benefice = 10000;
            System.out.println();
            for (int j = 1; j < 5; j++) {
                benefice = benefice + (benefice * taux);
                capital[i][j] = benefice;
            }
            taux += 0.01;
        }

        for (int y = 0; y < 6; y++) {
            System.out.println();
            for (int z = 0; z < 5; z++) {
                System.out.printf("%1.2f ", capital[y][z]);
                System.out.print(" ");
            }
        }
    }
}
