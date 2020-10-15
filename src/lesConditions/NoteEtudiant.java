package lesConditions;

import java.util.Scanner;

public class NoteEtudiant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir votre note: ");
        int note = scanner.nextInt();

        if (note < 4) {
            System.out.println("la note est insuffisante ");
        } else if (note == 5) {
            System.out.println("la note est suffisante ");
        } else if (note <= 7) {
            System.out.println("la note est Bien ");
        } else if (note == 8) {
            System.out.println("la note est remarquable ");
        } else if (note <= 10) {
            System.out.println("la note est extraordinaire ");
        } else {
            System.out.println("la note ne correspond pas à la qualification");
        }
    }
}
