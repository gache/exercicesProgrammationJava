package boucles.boucleWhile;

import java.util.Scanner;

public class BoucleWhileMdp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String mdp = "erick";
        String mdp2 = "";
        while (mdp.equals(mdp2) == false) {
            System.out.println("Saisir le mot de pass \n");
            mdp2 = scanner.nextLine();

            if (!mdp.equals(mdp2)) {
                System.out.println("Mot de passe incorrecte\n");
            }
        }
        System.out.println("Mot de passe correcte. Vous avez acces");
    }
}
