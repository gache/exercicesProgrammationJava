package poo.exercicespoo.exercices1;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Quadrilatere q1;

        System.out.println("Saisir le cote numero 1 :");
        float cote1 = scanner.nextFloat();
        System.out.println("Saisir le cote numero 2 :");
        float cote2 = scanner.nextFloat();


        if (cote1 == cote2) {
            q1 = new Quadrilatere(cote1);
        } else {
            q1 = new Quadrilatere(cote1, cote2);
        }

        System.out.println("El area: " +q1.getArea());
        System.out.println("Le perimetro: "+q1.perimetro());

    }


}
