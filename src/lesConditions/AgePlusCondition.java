package lesConditions;

import java.util.Scanner;

public class AgePlusCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age;
        System.out.println("Saisir votre age: ");
        age = scanner.nextInt();

        if (age < 18){
            System.out.println("Tu es un adolescent");
        }else if(age < 40){
            System.out.println("Tu es un jeune");
        }else if(age < 65 ){
            System.out.println("Tu as l'experience");
        }else {
            System.out.println("faite attention à ta santé");
        }
    }
}
