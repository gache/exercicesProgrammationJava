package operateurs;

import java.util.Scanner;

public class SalaireVendeur {
    public static void main(String[] args) {
        final int salaire = 1000;
        int numVoitureVendu;
        float valeurVente, salaireMois;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir la quantité de voiture vendu dans le mois ");
        numVoitureVendu = scanner.nextInt();

        System.out.println("Saisir la valeur de la voiture ");
        valeurVente = scanner.nextInt();

        salaireMois = salaire + (numVoitureVendu * 150) + (valeurVente * 0.05f * numVoitureVendu);
        System.out.println("Le salaire du vendeur au mois est de : " + salaireMois);


    }
}
