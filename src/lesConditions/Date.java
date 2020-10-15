package lesConditions;

import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarion des variables
        int jour, mois, annee;
        System.out.println("Saisir un jour: ");
        jour = scanner.nextInt();

        System.out.println("Saisir le mois: ");
        mois = scanner.nextInt();

        System.out.println("Saisir l'anneé: ");
        annee = scanner.nextInt();

        if ((jour >= 1) && (jour <= 30)) { // si le jour est correcte
            if ((mois >= 1) && (mois <= 12)) { // si le mois est correcte
                if (annee != 0) { // si l'année est correcte
                    System.out.println("La date est correcte");
                } else {
                    System.out.println("La date n'est pas correcte, l'année est incorrect");
                }
            } else {
                System.out.println("La date n'est pas correcte, Le mois est incorrect");
            }

        } else {
            System.out.println("La date n'est pas correcte, Le jour est incorrect ");
        }

    }
}


