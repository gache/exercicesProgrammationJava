package lesConditions;

import javax.swing.*;
import java.util.Scanner;

public class CalculatriceSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // déclaration des variables
        int numero1, numero2, somme, soustraire, fois, division;
        char choix;
        System.out.println("Saisir un numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Saisir autre numero: ");
        numero2 = scanner.nextInt();

        choix = JOptionPane.showInputDialog("Choisir l'operation que vous souhaitez: \n 1: A \n 2: R \n 3: F \n 4: M \n 5: D").charAt(0);

        switch (choix) {
            case 'A':
            case 'a':
                somme = (numero1 + numero2);
                System.out.println("La somme de l'operation est: " + somme);
                break;

            case 'r':
            case 'R':
                soustraire = (numero1 - numero2);
                System.out.println("La reste de l'operation est: " + soustraire);
                break;

            case 'f':
            case 'F':
            case 'm':
            case 'M':
                fois = (numero1 * numero2);
                System.out.println("La multiplicationes de l'operation est: " + fois);
                break;

            case 'd':
            case 'D':
                division = (numero1 / numero2);
                System.out.println("La division de l'operation est: " + division);
                break;

        }

    }
}
