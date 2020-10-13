package boucles.boucleWhile;

import java.util.Scanner;

public class NumeroPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 0;
        System.out.println("Saisir un numéro: ");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            System.out.println("Saisir un numéro: ");
            numero = scanner.nextInt();
            somme++;
        }
        System.out.println("Le totale de numeros saisie est de: " + somme);
    }
}
