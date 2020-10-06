package entreSortieDonnee;

import java.util.Scanner;

public class EntreSortieDonnee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nom;
        int age;

        System.out.println("Saisir ton prenom: ");
        nom = scanner.nextLine();
        System.out.println("Saisir ton age: ");
        age = scanner.nextInt();
        System.out.println("Salut " + nom + " as " + age + " ans");

    }
}
