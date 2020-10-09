package boucles.boucleWhile;

import java.util.Scanner;

public class NumeroPositifNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        while (numero != 0) {
            if (numero > 0) {
                System.out.println("Le numero est positif");
            } else {
                System.out.println("Le numero est negatif");
            }
            numero = scanner.nextInt();
        }
        System.out.println("le numero est Zero fin du processus");
    }
}
