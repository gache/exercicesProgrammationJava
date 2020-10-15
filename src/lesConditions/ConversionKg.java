package lesConditions;

import java.util.Scanner;

public class ConversionKg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir la quantité de kg: ");
        float mesure = scanner.nextFloat();

        System.out.println("Menu : \n 1: Hectogramme \n 2: Décagramme \n 3: Gramme \n 4: Décigramme\n 5: Centigramme \n 6: Milligramme ");
        int choix = scanner.nextInt();

        switch (choix) {
            case 1:
                mesure *= 10;
                System.out.println("La nouvelle mesure en Hectogramme est " + mesure);
                break;
            case 2:
                mesure *= 100;
                System.out.println("La nouvelle mesure en Décagramme est " + mesure);
                break;
            case 3:
                mesure *= 1000;
                System.out.println("La nouvelle mesure en Gramme est " + mesure);
                break;

            case 4:
                mesure *= 10000;
                System.out.println("La nouvelle mesure en Décigramme est " + mesure);
                break;

            case 5:
                mesure *= 100000;
                System.out.println("La nouvelle mesure en Centigramme est " + mesure);
                break;

            case 6:
                mesure *= 1000000;
                System.out.println("La nouvelle mesure en Milligramme est " + mesure);
                break;

            default:
                System.out.println("Erreur le numero ne corespond pas ");
        }

    }
}
