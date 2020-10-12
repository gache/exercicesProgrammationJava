package boucles.boucleWhile;

import java.util.Scanner;

public class NumeroPairImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero % 2 == 0) {
                System.out.println("Le numero " + numero+ " est Pair");
            } else if (numero % 2 != 0) {
                System.out.println("Le numero " + numero+ " Impair");
            }
            System.out.println("Saisir autre numero: ");
            numero = scanner.nextInt();
        }
        System.out.println("le numero est Zero fin du processus");
    }
}
