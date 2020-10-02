package lesConditions;

import java.util.Scanner;

public class CalculeChiffreNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration de la variable
        int numero;

        // demande de l'information
        System.out.println("Saisir un numéro :");
        numero= scanner.nextInt();

        // Verification de la condition
        if (numero < 9) {
            System.out.println("Le numéro " + numero+ " a une chiffre ");
        }else if(numero < 99){
            System.out.println("Le numéro " + numero+ " a deux chiffres ");
        }else if(numero < 999){
            System.out.println("Le numéro " + numero+ " a trois chiffres ");
        }else if(numero < 9999){
            System.out.println("Le numéro " + numero+ " a quatre chiffres ");
        }else if(numero < 99999){
            System.out.println("Le numéro " + numero+ " a cinque chiffres ");
        }else {
            System.out.println("Le numéro " + numero+ " a plus de cinque chiffres ");
        }
    }
}
