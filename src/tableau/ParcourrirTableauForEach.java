package tableau;

import java.util.Scanner;

public class ParcourrirTableauForEach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pays = new String[8];
        // je remplie mon tableau avec la boucle for
        for (int i = 0; i < pays.length; i++) {
            System.out.println("Saisir le nom du pays " + (i + 1));
            pays[i] = scanner.nextLine();
        }

        // j'imprime mon tableau avec la boucle for each
        for (String i : pays) {
            System.out.println("Pays: " + i);
        }

    }
}
