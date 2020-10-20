package poo.constructeurParametre2;

public class DriverEmploye {
    public static void main(String[] args) {
        Employe[] mesEmploye = new  Employe[3];
        mesEmploye[0] = new Employe("Erick", 600,2015, 5 -1, 30);
        mesEmploye[1] = new Employe("Juan", 700,2016, 9 -1, 25);
        mesEmploye[2] = new Employe("Pedro", 800,2017, 12 -1, 15);

        for (int i = 0 ; i < mesEmploye.length; i++){
            mesEmploye[i].augmenterSalaire(5);
        }

        for (int i = 0 ; i < mesEmploye.length; i++){
            System.out.println("Nom: " + mesEmploye[i].getNom() + " Salaire: " + mesEmploye[i].getSalaire() + "Fin contrat: " + mesEmploye[i].getFinContrat());
        }

    }
}
