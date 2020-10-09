package boucles.boucleWhile;

import java.util.Scanner;

public class ConnexionMdp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mdp1 = "Maud";
        String mdp2 = " ";
        while (!mdp1.equals(mdp2)) {
            System.out.println("Saisir le mot de passe de connexion");
            mdp2 = scanner.nextLine();
            if (!mdp1.equals(mdp2)) {
                System.out.println("le Mot de passe est incorrecte! ");
            }
        }
        System.out.println("Le mot de passe est correcte. Vous êtes connecté");
    }
}
