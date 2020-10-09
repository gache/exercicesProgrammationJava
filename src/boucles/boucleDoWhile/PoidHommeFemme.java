package boucles.boucleDoWhile;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PoidHommeFemme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String genero = "";

        do {
            System.out.println("Choisir votre sexe: (H/F)");
            genero = scanner.nextLine();

        } while (!genero.equalsIgnoreCase("H") && !genero.equalsIgnoreCase("F"));

        System.out.println("Saisir l'hauteur: ");
        int hauteur = scanner.nextInt();
        int poidIdeal = 0;

        if (genero.equalsIgnoreCase("H")) {
            poidIdeal = hauteur - 110;
        } else if (genero.equalsIgnoreCase("F")) {

            poidIdeal = hauteur - 120;
        }

        System.out.println("Ton poid idéal est de: " + poidIdeal + " Kg");
    }
}
