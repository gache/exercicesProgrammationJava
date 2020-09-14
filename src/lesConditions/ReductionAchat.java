package lesConditions;

import java.util.Scanner;

public class ReductionAchat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaration des variables
        float achat, reduction;

        // demande de saisir le valeur de la vente
        System.out.println("Saisir le montant de votre commande: ");
        achat = scanner.nextFloat();

        if (achat >= 300) {
            reduction = achat * 0.20f;
            achat -= reduction;
            System.out.println("Vous avez le droit à " + reduction +"€ de réduction le nouveau prix est de " +achat +"€" );
        } else {
            System.out.println("Vous n'avez pas le droit à la réduction le prix est de " +achat +"€");
        }
    }
}
