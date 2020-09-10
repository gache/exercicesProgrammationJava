package operateurs;

import java.util.Scanner;

public class SommeNotes {
    public static void main(String[] args) {
        // instance de ma class  Scanner
        Scanner scanner = new Scanner(System.in);

        // Déclarations de variables
        int note1, note2, note3, total;

        // Demande d'information à l'utilisateur
        System.out.println("Saisir la note numero 1: ");
        note1 = scanner.nextInt();

        System.out.println("Saisir la note numero 2: ");
        note2 = scanner.nextInt();

        System.out.println("Saisir la note numero 3: ");
        note3 = scanner.nextInt();

        // somme des notes
        total = note1 + note2 + note3;

        // j'imprime en console le resultat
        System.out.println("La somme total est de: " + total);
    }


}
