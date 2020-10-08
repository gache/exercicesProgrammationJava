package lesConditions;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.println("Saisir votre age: ");
        age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Tu es majeur");
        }else{
            System.out.println("tu est mineur");
        }
    }
}
