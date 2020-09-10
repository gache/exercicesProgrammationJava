package operateurs;

import java.util.Scanner;

public class SalaireSemaineEmploye {
    public static void main(String[] args) {
        // instance de ma class  Scanner
        Scanner scanner = new Scanner(System.in);

        // Déclarations de variables
        int heureTravaillee, semaine = 4;
        float salaireSemaine, salaireHeure, salaireMois;

        // Demande d'information à l'utilisateur
        System.out.println("Saisir le nombres d'heures travaillée cette semaine");
        heureTravaillee = scanner.nextInt();

        System.out.println("Saisir le salaire que vous gagnez par heure");
        salaireHeure = scanner.nextFloat();

        // Calcule du salaire
        salaireSemaine = heureTravaillee * salaireHeure;
        salaireMois = salaireSemaine * semaine;

        // j'imprime en console le resultat
        System.out.println("\nle salaire de la semaine est de: " + salaireSemaine);
        System.out.println("\nle salaire du mois est de: " + salaireMois);
    }
}
