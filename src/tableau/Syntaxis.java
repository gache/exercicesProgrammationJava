package tableau;

import java.util.Scanner;

public class Syntaxis {
    public static void main(String[] args) {
        // Déclaration d'un tableau
        int[] monTableau = new int[5];
        // d'abord il faut dire type de donnée du tableau dans notre cas c'est type int, àa peut-être type double, String
        // Ensuite faire la déclaration  [] pour dire que c''st un tableau
        // Après le nom du tableau
        // Après new +  type de données et numero de donnée stocker dans tableau


        // Déclaration et initialisation du tableau
        int[] monTableau2 = new int[5];
        monTableau2[0] = 15;
        monTableau2[1] = 25;
        monTableau2[2] = 8;
        monTableau2[3] = -7;
        monTableau2[4] = 92;
        // pour imprimer les valeurs de mon tableau
        for (int i = 0; i < monTableau2.length; i++) {
            // System.out.println("Le valeur de mon index " + i + " = " + monTableau2[i]);
        }

        // Déclaration et initialisation du tableau
        int[] mmonTableau3 = {5, 38, -15, 92, 71, 95, 85, 65, 25, 14, 78};

        for (int i = 0; i < mmonTableau3.length; i++) {
            System.out.println("Le valeur de mon index " + (i + 1) + " = " + mmonTableau3[i]);
        }

    }
}
