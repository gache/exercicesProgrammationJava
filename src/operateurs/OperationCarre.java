package operateurs;

import java.util.Scanner;

public class OperationCarre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 //       Déclaration des variable
//        int a, b, ab, resultat; // sans la class Math
        double a, b, ab, resultat; // je mets les variables car la methode Math a besoin de variable en double

        // demande d'informatio à l'utilisateur
        System.out.println("Saisir un numero: ");
        a = scanner.nextInt();
        System.out.println("Saisir un numero: ");
        b = scanner.nextInt();

//       Operation sans la class Math

//        a *= a;
//        b *= b;
//        ab = (2*a * b);

        // operation avec la class Math
        resultat = Math.pow(a, 2) + Math.pow(b, 2) + (2 * a * b);

        //   System.out.println("le resultat est: " + a + " " + ab + " " + b);
        System.out.println("le resultat est: " + resultat);
    }
}
