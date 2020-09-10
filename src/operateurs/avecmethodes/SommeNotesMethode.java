package operateurs.avecmethodes;


import java.util.Scanner;

public class SommeNotesMethode {
    float note1, note2, note3, somme;


   public void lire() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Saisir la note numero 1:");
       note1 = scanner.nextFloat();
       System.out.println("Saisir la note numero 2:");
       note2 = scanner.nextFloat();
       System.out.println("Saisir la note numero 3:");
       note3 = scanner.nextFloat();

   }

   public void addition(){
        somme = note1 + note2 + note3;
       System.out.println("le resultat de l'operation est: " + somme);
   }
}
