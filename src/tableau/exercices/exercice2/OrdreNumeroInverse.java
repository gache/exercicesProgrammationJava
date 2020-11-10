package tableau.exercices.exercice2;

import java.util.Scanner;

public class OrdreNumeroInverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mesNumeros[] = new int[5];
        System.out.println("Enregistrement des numeros");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Saisir les numeros: ");
            mesNumeros[i] = scanner.nextInt();
        }
        System.out.println("L'odre de mon tableau dans son ordre inverse");
        for (int j = 4; j >= 0; j--) {
            System.out.println(mesNumeros[j]);
        }

    }
}
