package operateurs;

import java.util.Scanner;

public class CalculeSemaineJour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        int totaleHeure, semaine, jour, heure;

        System.out.println("Saisir un nombres d'heures:");
        totaleHeure = scanner.nextInt();
        semaine = totaleHeure / 168;
        jour = totaleHeure % 168 / 24;
        heure = totaleHeure % 24;

        System.out.println("L'equivalent de " + totaleHeure + " heures est: ");
        System.out.println("Le resultat en semaine est:  " + semaine + " semaines");
        System.out.println("Le resultat en jour est:  " + jour + " jours");
        System.out.println("Le resultat en heures est:  " + heure + " heures");

    }
}
