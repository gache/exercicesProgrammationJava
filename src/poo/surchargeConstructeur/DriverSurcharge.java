package poo.surchargeConstructeur;

public class DriverSurcharge {
    public static void main(String[] args) {
        SurchargeConstructeur[] mesEmploye = new SurchargeConstructeur[4];
        mesEmploye[0] = new SurchargeConstructeur("Paco", 600, 2015, 5 - 1, 30);
        mesEmploye[1] = new SurchargeConstructeur("Juan", 700, 2016, 9 - 1, 25);
        mesEmploye[2] = new SurchargeConstructeur("Pedro", 800, 2017, 12 - 1, 15);
        mesEmploye[3] = new SurchargeConstructeur("Pablo");

        for (int i = 0; i < mesEmploye.length; i++) {
            mesEmploye[i].augmenterSalaire(5);
        }

        for (int i = 0; i < mesEmploye.length; i++) {
            System.out.println("Nom: " + mesEmploye[i].getNom() + " Salaire: " +
                    mesEmploye[i].getSalaire() + " Fin contrat: " +
                    mesEmploye[i].getFinContrat());
        }

    }
}
