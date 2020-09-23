package boucles;

import java.util.Scanner;

public class Pyramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Saisir un numero: ");

        int n = sc.nextInt();
        System.out.println("Debut de ma boucle:\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }for (int j2 = 0; j2 <= i; j2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("\nFin de ma boucle");

    }

}
