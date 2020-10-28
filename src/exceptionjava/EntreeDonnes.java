package exceptionjava;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntreeDonnes {
    public static void main(String[] args) {
        System.out.println("Que souhaitez vous faire: ");
        System.out.println("1. Mettre de donnés: ");
        System.out.println("2. Sortir du programme: ");

        Scanner scanner = new Scanner(System.in);
        int decision = scanner.nextInt();

        if (decision == 1){
            getDonner();
        }else{
            System.out.println("Au revoir");
            System.exit(0);
        }
        scanner.close();
    }

    static void getDonner() throws InputMismatchException {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Saisir ton prenom: ");
            String prenom = scanner.nextLine();
            System.out.println("Saisir votre age");
            int age = scanner.nextInt();
            System.out.println("Hello " + prenom + " l'année prochain tu auras  " + (age+1) + " ans " );
            scanner.close();

        } catch ( InputMismatchException e) {
            System.out.println("l'age doit être un numero");
        }

        System.out.println("Le programme a fini son execution");

    }

}
