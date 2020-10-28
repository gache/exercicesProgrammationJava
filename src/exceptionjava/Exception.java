package exceptionjava;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int[] matrix = new int[5];
        matrix[0] = 5;
        matrix[1] = 38;
        matrix[2] = 15;
        matrix[3] = 92;
        matrix[4] = 71;


        for (int i = 0; i < matrix.length; i++){
            System.out.println("La position " + i + " = " + matrix[i]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Saisir votre prenom: ");
        String prenom = scanner.nextLine();

        System.out.println("Saisir votre age");
        int age = scanner.nextInt();

        System.out.println("Hello " + prenom + " a " + age + " ans " + " Le programme a fini son execution");

    }
}
