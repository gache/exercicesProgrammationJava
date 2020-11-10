package poo.exercicespoo.exercices3;

import java.util.Scanner;

public class Driver {
    public static int indexVoiturePasCher(Vehicule mesVehicule[]) {
        float prix;
        int index = 0;

        prix = mesVehicule[0].getPrix();

        for (int i = 1; i < mesVehicule.length; i++) {
            if (mesVehicule[i].getPrix() < prix) {
                prix = mesVehicule[i].getPrix();
                index = i;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String marque, modele;
        float prix;
        int nVehicule, indexVoiturePasCher;
        System.out.println("Saisir la quantite de vehicule");
        nVehicule = scanner.nextInt();

        Vehicule mesVehicule[] = new Vehicule[nVehicule];

        for (int i = 0; i < mesVehicule.length; i++) {
            scanner.nextLine();
            System.out.println("Saisir les carecteristique du vehicule: " + (i + 1) + ".");
            System.out.println("Saisir la marque du vehicule: ");
            marque = scanner.nextLine();
            System.out.println("Saisir le modele du vehicule: ");
            modele = scanner.nextLine();
            System.out.println("Saisir le prix du vehicule: ");
            prix = scanner.nextFloat();

            mesVehicule[i] = new Vehicule(marque, modele, prix);
        }

        indexVoiturePasCher = indexVoiturePasCher(mesVehicule);
        System.out.println("\nLa voiture moins cher est: ");
        System.out.println(mesVehicule[indexVoiturePasCher].montrerDonner());


    }
}
