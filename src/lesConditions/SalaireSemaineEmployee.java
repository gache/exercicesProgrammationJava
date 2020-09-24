package lesConditions;

import java.util.Scanner;

public class SalaireSemaineEmployee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Déclaration des variables
        int heureTravaillee, salaireSemaine;
        final int salaireFixe = 40;

        // demande d'information
        System.out.println("Saisir les nombres d'heure travaillée cette semaine: ");
        heureTravaillee = scanner.nextInt();

        // verification de la condition
        if (heureTravaillee <= salaireFixe) {
            salaireSemaine = heureTravaillee * 16;
            System.out.println("Le salaire de la semaine de l'employée est de: " + salaireSemaine + "€");
        }
        if (heureTravaillee > salaireFixe) {
            salaireSemaine = (salaireFixe * 16) + (heureTravaillee - salaireFixe) * 20;
            System.out.println("Le salaire de la semaine de l'employée est de: " + salaireSemaine + "€");
        }
    }
}
