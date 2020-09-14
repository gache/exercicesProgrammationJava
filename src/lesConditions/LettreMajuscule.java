package lesConditions;

import java.util.Scanner;

public class LettreMajuscule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclarion de la variable
        char lettre;

        // demande de saisir une lettre
        System.out.println("Saisir une lettre: ");
        lettre = scanner.next().charAt(0);

        // verification de la condition et impression dans la console
        if(Character.isUpperCase(lettre) ){
            System.out.println("La lettre " + lettre + " est une lettre en majuscule");
        }else {
            System.out.println("La lettre " + lettre + " est une lettre en miniscule");
        }




    }
}
