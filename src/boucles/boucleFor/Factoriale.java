package boucles.boucleFor;


import java.util.Scanner;

public class Factoriale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long resultat = 1;

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        for (int i = numero; i > 0; i--) {
            resultat *= i;
        }
        System.out.println("le factoriale de " + numero + " est " + resultat);

    }
}
