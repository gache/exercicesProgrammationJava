package boucles.boucleWhile;

import java.util.Scanner;

public class DevinerNumeroAleatoire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somme = 1;
        int numeroAleatoire = (int) (Math.random() * 100);

        System.out.println("Saisir un numero: ");
        int numero = scanner.nextInt();

        while (numero != numeroAleatoire) {
            if (numero < numeroAleatoire) {
                System.out.println("Le numero es majeur");
            } else if (numero > numeroAleatoire) {
                System.out.println("Le numero es mineur");
            }
            System.out.println("Saisir un numero: ");
            numero = scanner.nextInt();
            somme++;
        }

        System.out.println("Bravo tu as réussi " + somme + " fois");

    }
}
