package lesConditions;

import java.util.Scanner;

public class PairImpair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Déclaration des variables
        int numero1, numero2;

        // demande d'information
        System.out.println("Saisir un numero: ");
        numero1 = scanner.nextInt();
        System.out.println("Saisir un numero: ");
        numero2 = scanner.nextInt();

        // verification de la condition
        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            System.out.println("Les deux numeros sont pair");
        }
        if (numero1 % 2 == 0 && numero2 % 2 != 0) {
            System.out.println("Le numero 1 est pair et le numero 2 impair");
        }
        if (numero1 % 2 != 0 && numero2 % 2 == 0) {
            System.out.println("Le numero 1 est impair et le numero 2 pair");
        }

        if (numero1 % 2 != 0 && numero2 % 2 != 0) {
            System.out.println("Les deux numeros sont impair");
        }
    }
}
