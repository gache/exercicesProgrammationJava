package operateurs;

import java.util.Scanner;

public class CalculeArgent {
    public static void main(String[] args) {
        // instance de ma class  Scanner
        Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        int louis, guillaume, jean, somme;

        // Demande d'information à l'utilisateur
        System.out.println("Saisir la quantité d'argent que vous avez: ");
        guillaume = scanner.nextInt();

        // Calcule de la quantité d'argent de chaque un
        louis = guillaume / 2;
        jean = (guillaume + louis) / 2;
        somme = guillaume + louis +jean;

        // j'imprime en console le resultat
        System.out.println("Guillaume a la somme de: " + guillaume);
        System.out.println("Louis a la somme de: " + louis);
        System.out.println("Jean a la somme de: " + jean);
        System.out.println("La somme totale de trois est de: " + somme);


    }
}
