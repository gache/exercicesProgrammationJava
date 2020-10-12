package tableau;

import java.util.Random;
import java.util.Scanner;

public class NomAleatoire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nom = {"Erick", "Maud","Adeline","Elena", "Laura"};
        Random random = new Random();
        System.out.println(nom[random.nextInt(nom.length)]);
    }
}
