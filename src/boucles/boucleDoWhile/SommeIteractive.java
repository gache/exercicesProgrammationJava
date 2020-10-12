package boucles.boucleDoWhile;

import java.util.Scanner;

public class SommeIteractive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, resultat = 0;

        do {
            System.out.println("Saisir un Numero: ");
            numero = scanner.nextInt();
            resultat += numero;
        } while (numero != 0);
        System.out.println(" La somme totale des numeros est " + resultat);
    }
}
