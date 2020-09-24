package lesConditions;

import java.util.Scanner;

public class OrdonnerNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarion des variable
        int numero1, numero2, numero3;

        // Demande de l'information
        System.out.println("Saisir le numero 1");
        numero1 = scanner.nextInt();
        System.out.println("Saisir le numero 2");
        numero2 = scanner.nextInt();
        System.out.println("Saisir le numero 3");
        numero3 = scanner.nextInt();

        // verification de la condition
        if ((numero1 > numero2) && (numero2 > numero3)) {
            System.out.println("Ordre de numero: "+ numero1 +" " + numero2+" " + numero3);
        }
        if ((numero1 > numero3) && (numero3 > numero2)) {
            System.out.println("Ordre de numero: "+ numero1 +" " + numero3+" " + numero2);
        }
        if ((numero2 > numero1) && (numero1 > numero3)) {
            System.out.println("Ordre de numero: "+ numero2 +" " + numero1+" " + numero3);
        }
        if ((numero2 > numero3) && (numero3 > numero1)) {
            System.out.println("Ordre de numero: "+ numero2 +" " + numero3+" " + numero1);
        }
        if ((numero3 > numero1) && (numero1 > numero2)) {
            System.out.println("Ordre de numero: "+ numero3 +" " + numero1+" " + numero2);
        }
        if ((numero3 > numero2) && (numero2 > numero1)) {
            System.out.println("Ordre de numero: "+ numero3 +" " + numero2+" " + numero1);
        }


    }
}
