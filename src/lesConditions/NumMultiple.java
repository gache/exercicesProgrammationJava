package lesConditions;

import java.util.Scanner;

public class NumMultiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // déclaration de la variable
        int num;

        // demande d'information
        System.out.println("Saisir un numero: ");
        num = scanner.nextInt();
        
        // verification de la condition
        if (num % 10 == 0) {
            System.out.println("Le numero saisi est multiple de 10");
        } else {
            System.out.println("Le numero saisi n'est pas multiple de 10");
        }
    }
}
