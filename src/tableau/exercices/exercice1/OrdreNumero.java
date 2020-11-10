package tableau.exercices.exercice1;

import java.util.Scanner;

public class OrdreNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeros[] = new int[5];
        System.out.println("Enregistremenet des numeros ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Saisir 5 numero: ");
            numeros[i] = scanner.nextInt();
        }
        System.out.println("les numeros de mon tableau sont: ");
        for (int j = 0; j < 5; j++) {
            System.out.println(numeros[j]);
        }

    }
}
