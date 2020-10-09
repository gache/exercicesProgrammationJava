package boucles.boucleWhile;

import java.util.Scanner;

public class NumeroNegatif {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir un numero");
        int numero = scanner.nextInt();

        while (numero >= 0) {
            numero = (int) Math.pow(numero, 2);
            System.out.println("Le carré est: " + numero);
            numero = scanner.nextInt();
            if (numero <= 0) {
                System.out.println("On ne peut pas faire le carré car le numero est negatig o est zero");
            }
        }

    }
}
