package lesConditions;

import java.util.Scanner;

public class NumSuperieurInferieur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // déclaration des variables
        int num1, num2;

        // Demande de saisir les numeros
        System.out.println("Saisir un numero: ");
        num1 = scanner.nextInt();
        System.out.println("Saisir un deuxième numero: ");
        num2 = scanner.nextInt();

        // Verification de la condition et impression dans la console
        if (num1 > num2) {
            System.out.println("numero " + num1 + " est major que numero " + num2);
        } else if (num2 > num1) {
            System.out.println("numero " + num2 + " est major que numero " + num1);
        } else {
            System.out.println("les deux numeros sont egals");
        }

    }
}
