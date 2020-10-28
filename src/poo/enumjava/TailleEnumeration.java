package poo.enumjava;

import java.util.Scanner;

public class TailleEnumeration {

    enum Taille {
        MINI("S"), MOYENNE("M"), GRAND("L"), TRES_GRAND("XL");

        private Taille(String abreviation) {
            this.abrevation = abreviation;
        }

        private String abrevation;

        public String getAbrevation() {
            return abrevation;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir la taille: MINI, MOYENNE, GRAND, TRES_GRAND");

        String entreeDonnee = scanner.next().toUpperCase();

        Taille laTaille = Enum.valueOf(Taille.class, entreeDonnee);
        System.out.println("La taille: " + laTaille);
        System.out.println("L'abrevation est: " + laTaille.getAbrevation());

    }

}
