package boucles;

import java.util.Scanner;

public class DevinerNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Déclaration de la variable
        int numero = 0, essai = 0;
        // Déclaration de la variable avec un numero entre 0 et 100
        int aleatoire = (int)(Math.random() * 100);


        while (numero != aleatoire){
            System.out.println("Saisir un Numero: ");
            numero = scanner.nextInt();
           if (aleatoire > numero) {
               System.out.println("Le numero est majeur");
           }else if(aleatoire < numero){
               System.out.println("Le numero est plus petit");
           }
            essai++;
        }
        System.out.println("Bravo vous avez réussi !!!! numero est " + aleatoire+" avec " + essai + " fois");




    }
}
