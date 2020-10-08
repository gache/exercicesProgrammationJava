package lesConditions;

import java.util.Scanner;

public class CalculeFigureGeometrique {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // déclaration des variables

        int calcule;

        System.out.println("Choisir une option de calcule: \n 1: Carre \n 2: Rectangle \n 3: Triangle \n 4: Cercle");

        calcule = scanner.nextInt();

        if (calcule == 1) {
            int cote;
            System.out.println("Saisir le Côté:");
            cote = scanner.nextInt();
            System.out.println("Le resultat de l'operation est: " + Math.pow(cote, 2));
        } else if (calcule == 2) {
            int longueur, largeur;
            System.out.println("Saisir la Longueur:");
            longueur = scanner.nextInt();
            System.out.println("Saisir la Largeur:");
            largeur = scanner.nextInt();
            System.out.println("Le resultat de l'operation est: " + longueur * largeur);
        } else if (calcule == 3) {
            int longueur, largeur;
            System.out.println("Saisir la Longueur:");
            longueur = scanner.nextInt();
            System.out.println("Saisir la Largeur:");
            largeur = scanner.nextInt();
            System.out.println("Le resultat de l'operation est: " + (longueur * largeur) / 2);
        } else if (calcule == 4) {
            int radio;
            System.out.println("Saisir le Radio:");
            radio = scanner.nextInt();
            System.out.println("Le resultat de l'operation est: " + Math.PI * Math.pow(radio, 2));
        } else {
            System.out.println("Option n'est pas correcte");
        }

    }
}
