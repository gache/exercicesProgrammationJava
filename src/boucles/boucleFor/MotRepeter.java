package boucles.boucleFor;

import java.util.Scanner;

public class MotRepeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un mot :");
        String str = sc.nextLine();
        System.out.println("Vous avez saisi :" + str);

        int[] counts = new int[(int) Character.MAX_VALUE];

        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            counts[(int) charAt]++;
        }

        int i;
        int plusGrand = Integer.MIN_VALUE;
        for (i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println("Nombre de " + (char) i + ": " + counts[i]);
            }
            if (counts[i] > plusGrand) {
                plusGrand = counts[i];

            }
        }

        //System.out.println("la lettre qui se repete le plus est "+ plusGrand );
        for (i = 0; i < str.length(); i++) {

            if ((counts[i]) == plusGrand) {

                char t = (char) i;
                System.out.println("la lettre qui se repete le plus est" + t);
            }

        }

    }
}

