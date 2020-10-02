package lesConditions;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarion des variables
        int jour, mois, annee;
        System.out.println("Saisir un jour: ");
        jour = scanner.nextInt();

        System.out.println("Saisir un mois: ");
        mois = scanner.nextInt();

        System.out.println("Saisir un anneé: ");
        annee = scanner.nextInt();

        if ((jour >= 1) && (jour <= 30)) {
            if ((mois >= 1) && (mois <= 12)) {
                if (annee != 0 && annee <= 360) {
                    System.out.println("La date est correcte");
                } else {
                    System.out.println("L'année n'est pas correcte");
                }
            } else {
                System.out.println("Le mois n'est pas correcte");
            }

        } else {
            System.out.println("le Jour n'est pas correcte");
        }

    }
}


