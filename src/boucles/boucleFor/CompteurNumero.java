package boucles.boucleFor;

import java.util.Scanner;

public class CompteurNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        for (int i = 0; i < numero; i++) {
            System.out.println(i + 1);
        }

    }

}
