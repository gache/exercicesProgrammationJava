package tableau.exercices.exercice3;

import java.util.Scanner;

public class MoyenneTableau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sommePositive = 0, sommeNegatif = 0, moyennePositive, moyenneNegatif;
        int comptePostive = 0, compteNegatif = 0, compteZero = 0;

        int mesNumeros[] = new int[5];

        System.out.println("Enregistrement des numeros: ");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + " Saisir 5 numeros: ");
            mesNumeros[i] = scanner.nextInt();
            if (mesNumeros[i] > 0) {
                comptePostive++;
                sommePositive += mesNumeros[i];

            } else if (mesNumeros[i] == 0) {
                compteZero++;
            } else {
                compteNegatif++;
                sommeNegatif += mesNumeros[i];
            }
        }
        //La moyenne du numero positive
        if (comptePostive == 0) {
            System.out.println("On ne peut pas faire la moyenne car il n'ya pas de numero positive");
        } else {
            moyennePositive = sommePositive / comptePostive;
            System.out.println("La moyenne des numeros positives est: " + moyennePositive);
        }
        //La moyenne du numero positive
        if (compteNegatif == 0) {
            System.out.println("On ne peut pas faire la moyenne car il n'y a pas de numero negative");
        } else {
            moyenneNegatif = sommeNegatif / compteNegatif;
            System.out.println("La moyenne des numeros negatives est: " + moyenneNegatif);
        }

        //le nombre de zero dans le tableau
        System.out.println("Le numero de Zero dans le tableau est : " + compteZero);


    }
}
