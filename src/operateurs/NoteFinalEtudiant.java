package operateurs;

import java.util.Scanner;

public class NoteFinalEtudiant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Déclaration des variables
        float intervention, examen1, examen2, examenFinal, noteFinal;

        //Je demande l'information à l'utilisateur
        System.out.println("Saisir la note de l'examen numero 1:");
        intervention = scanner.nextFloat();
        System.out.println("Saisir la note de l'examen numero 1:");
        examen1 = scanner.nextFloat();
        System.out.println("Saisir la note de l'examen numero 2:");
        examen2 = scanner.nextFloat();
        System.out.println("Saisir la note de l'examen final :");
        examenFinal = scanner.nextFloat();

        //Operation pour avoir les notes
        // noteFinal = (intervention * 0.10f) +(examen1 * 0.25f) +(examen2 * 0.25f)+ (examenFinal * 0.40f);

        // autre façon de faire pour avoir les notes
        intervention *= 0.10f;
        examen1 *= 0.25f;
        examen2 *= 0.25f;
        examenFinal *= 0.40f;

        // somme des notes de l'étudiant et je l'affiche en console
        noteFinal = intervention + examen1 + examen2 + examenFinal;
        System.out.println("La note final de l'étudiant " + noteFinal);
    }
}
