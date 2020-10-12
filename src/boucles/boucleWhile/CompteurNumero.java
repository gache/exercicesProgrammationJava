package boucles.boucleWhile;

import java.util.Scanner;

public class CompteurNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();
        int i = 1;
        while (i <= numero ) {
            System.out.println(i);
            i++;
        }
    }
}
