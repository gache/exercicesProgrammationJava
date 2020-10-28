package poo.interfacejava.interfaceprope;
import java.util.Arrays;

public class EmployeDriver {
    public static void main(String[] args) {
        Chef chef1 = new Chef("Jorge", 55000, 2020, 9, 15);
        chef1.setPrime(2570);


        Employe[] mesEmployes = new Employe[6];
        mesEmployes[0] = new Employe("Pedro", 30000, 2020, 2, 28);
        mesEmployes[1] = new Employe("Juan", 50000, 2019, 9, 10);
        mesEmployes[2] = new Employe("Maria", 25000, 2018, 5, 15);
        mesEmployes[3] = chef1; // polyforfisme principe de subtitution
        mesEmployes[4] = new Chef("Magdalena", 95000, 2015, 2, 23);
        mesEmployes[5] = new Chef("Julio", 85000,2016,6,15);

        Chef chefFinance = (Chef) mesEmployes[5];
        chefFinance.setPrime(50000);
        System.out.println(chefFinance.prendreDecision("Donner plus de congés"));
        System.out.println( "Le chef: " + chefFinance.getNom() + " a un bonus de: " + chefFinance.bonus(500));

        System.out.println( "L'employé: " + mesEmployes[0].getNom() + " a un bonus de: " + mesEmployes[0].bonus(200));



        // Avec la boucle foreach
        for (Employe e : mesEmployes) {
            e.augmenterSalaire(5);
        }

        Arrays.sort(mesEmployes); // cette methode a besoin l'implemetation de l'interface Comparable


        for (Employe e2 : mesEmployes) {
            System.out.println("Le Prenom: " + e2.getNom() + " Salaire: " + e2.getSalaire() + " Fin contrat: " + e2.getFinContrat());
        }

    }
}
