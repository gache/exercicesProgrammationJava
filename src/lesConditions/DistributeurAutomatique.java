package lesConditions;

import java.util.Scanner;

public class DistributeurAutomatique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int soldeInitial = 1000;
        float depot, soldeActuel, retirer;

        System.out.println("Choisir l'operation que vous souhaitez faire : \n 1: Mettre de l'argent \n 2: Retirer de l'argent \n 3: Sortir ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                System.out.println("Saisir le montant à mettre sur votre compte");
                depot = scanner.nextFloat();
                soldeActuel = depot + soldeInitial;
                System.out.println("Le solde de votre compte est : " + soldeActuel);
                break;
            case 2:
                System.out.println("Saisir le montant à retirer de votre compte");
                retirer = scanner.nextFloat();
                if (retirer > soldeInitial) {
                    System.out.println("Cette operation ne peut pas se faire.Car le solde de votre compte est insuffisant  ");
                } else {
                    soldeActuel = soldeInitial - retirer;
                    System.out.println("Le solde de votre compte est : " + soldeActuel);
                    break;
                }
            case 3:
                break;
            default:
                System.out.println("Erreur on ne peut pas faire l'operation");

        }
    }
}
