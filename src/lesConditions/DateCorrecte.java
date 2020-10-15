package lesConditions;

import java.util.Scanner;

public class DateCorrecte {
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

        if (annee == 0) {
            System.out.println("La date n'est pas correcte, l'année est incorrect");
        } else if ((mois == 2) && (jour >= 1 && jour <= 28)) {
            System.out.println("La date est correcte, Le mois est correct");
        } else if ((mois == 4 || mois == 6 || mois == 9 || mois == 11) && (jour >= 1 && jour <= 30)) {
            System.out.println("La date est correcte, Le mois est correct");
        } else if ((mois == 1 || mois == 3 || mois == 5 || mois == 7 || mois == 8 || mois == 10 || mois == 12) && (jour >= 1 && jour <= 31)) {
            System.out.println("La date est correcte, Le mois est correct");
        } else {
            System.out.println("La date est incorrecte");
        }

    }
}
