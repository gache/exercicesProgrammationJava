package poo.heritage.bonDisigHeritage;



public class DriverEmploye {
    public static void main(String[] args) {
        // instance de la class Chef

        Chef chef1 = new Chef("Jorge", 55000, 2020,9,15);
        chef1.setPrime(2570);


        Employe[] mesEmployes = new Employe[5];
        mesEmployes[0] = new Employe("Pedro", 30000, 2020, 2, 28);
        mesEmployes[1] = new Employe("Juan", 50000, 2019, 9, 10);
        mesEmployes[2] = new Employe("Maria", 25000, 2018, 5, 15);
        mesEmployes[3] = chef1; // polyforfisme principe de subtitution
        mesEmployes[4] = new Chef("Magdalena", 95000, 2015,2,23);

        // Avec la boucle foreach
        for (Employe e : mesEmployes) {
            e.augmenterSalaire(5);
        }

        for (Employe e2 : mesEmployes) {
            System.out.println("Le Prenom: " + e2.getNom() + " Salaire: " + e2.getSalaire() + " Fin contrat: " + e2.getFinContrat());
        }

    }
}
