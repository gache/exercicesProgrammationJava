package entreSortieDonnee;

import java.util.Scanner;

public class EntreSortieCarree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num;
        System.out.println("Saisir un numero: ");
        num = scanner.nextDouble();
        System.out.print("la racine carrée " + "est ");
        System.out.printf("%1.4f", Math.sqrt(num));
    }
}
