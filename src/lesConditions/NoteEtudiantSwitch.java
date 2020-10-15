package lesConditions;

import java.util.Scanner;

public class NoteEtudiantSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Saisir votre note: ");
        int note = scanner.nextInt();

        switch (note) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("la note est insuffisante ");
                break;
            case 5:
                System.out.println("la note est suffisante ");
                break;
            case 6:
            case 7:
                System.out.println("la note est Bien ");
                break;
            case 8:
                System.out.println("la note est remarquable ");
                break;
            case 9:
            case 10:
                System.out.println("la note est extraordinaire ");
                break;
            default:
                System.out.println("la note ne correspond pas à la qualification");
                break;
        }
    }
}
