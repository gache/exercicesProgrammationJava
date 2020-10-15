package lesConditions;

import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisir l'operation que vous souhaitez: \n 1: A \n 2: S \n 3: F \n 4: M \n 5: D");
        String choix = scanner.nextLine();

        if (choix.equalsIgnoreCase("A")) {
            int somme;
            System.out.println("Saisir un numero pour la somme: ");
            int n1 = scanner.nextInt();
            System.out.println("Saisir autre numero pour la somme: ");
            int n2 = scanner.nextInt();
            somme = n1 + n2;
            System.out.println("La somme de l'operation est: " + somme);
        } else if (choix.equalsIgnoreCase("S")) {
            int reste;
            System.out.println("Saisir un numero: ");
            int n1 = scanner.nextInt();
            System.out.println("Saisir autre numero: ");
            int n2 = scanner.nextInt();
            reste = n1 - n2;
            System.out.println("La reste de l'operation est: " + reste);

        } else if (choix.equalsIgnoreCase("F")) {
            int fois;
            System.out.println("Saisir un numero: ");
            int n1 = scanner.nextInt();
            System.out.println("Saisir autre numero: ");
            int n2 = scanner.nextInt();
            fois = n1 * n2;
            System.out.println("La multiplicationes de l'operation est: " + fois);

        } else if (choix.equalsIgnoreCase("M")) {
            int module;
            System.out.println("Saisir un numero: ");
            int n1 = scanner.nextInt();
            System.out.println("Saisir autre numero: ");
            int n2 = scanner.nextInt();
            module = n1 % n2;
            System.out.println("Le module de l'operation est: " + module);
        } else if (choix.equalsIgnoreCase("D")) {
            int division;
            System.out.println("Saisir un numero: ");
            int n1 = scanner.nextInt();
            System.out.println("Saisir autre numero: ");
            int n2 = scanner.nextInt();
            division = n1 / n2;
            System.out.println("La division de l'operation est: " + division);
        }
        else{
            System.out.println("Erreur vous êtes trompé d'operation");
        }

    }
}
