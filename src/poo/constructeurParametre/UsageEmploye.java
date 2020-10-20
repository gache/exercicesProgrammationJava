package poo.constructeurParametre;

import java.util.Date;
import java.util.GregorianCalendar;

public class UsageEmploye {
// cette methode de travail ne pas conseiller. c'est pour de raison d'illustration

    public static void main(String[] args) {
        // Instance de class
//        Employe employe = new Employe("Erick", 1400,2020,2,28);
//        Employe employe2 = new Employe("Lina", 1600,2019,9,10);
//        Employe employe3 = new Employe("Patricia", 1700,2018,5,15);
//
//        employe.augmenterSalaire(5);
//        employe2.augmenterSalaire(10);
//        employe3.augmenterSalaire(15);
//
//        System.out.println("Le nom de l'employée est: "+ employe.getNom() + " Salaire: " +employe.getSalaire() + " Date de la fin de son contrat " + employe.getFinContrat() );
//        System.out.println("Le nom de l'employée est: "+ employe2.getNom() + " Salaire: " +employe2.getSalaire() + " Date de la fin de son contrat " + employe2.getFinContrat() );
//        System.out.println("Le nom de l'employée est: "+ employe3.getNom() + " Salaire: " +employe3.getSalaire() + " Date de la fin de son contrat " + employe3.getFinContrat() );

        Employe[] mesEmployes = new Employe[3];
        mesEmployes[0] = new Employe("Erick", 1400, 2020, 2, 28);
        mesEmployes[1] = new Employe("Lina", 1600, 2019, 9, 10);
        mesEmployes[2] = new Employe("Patricia", 1700, 2018, 5, 15);

        // Avec la boucle for
//       for (int i = 0; i < mesEmployes.length; i++){
//           mesEmployes[i].augmenterSalaire(5);
//       }

        // Avec la boucle foreach
        for (Employe e : mesEmployes
        ) {
            e.augmenterSalaire(5);
        }

        for (Employe e2 : mesEmployes
        ) {
            System.out.println("Le nom: " + e2.getNom() + " Salaire: "  +e2.getSalaire() + " Fin contrat: " + e2.getFinContrat());
        }
        // Avec la boucle for

//       for (int i = 0; i < 3; i ++){
//           System.out.println("Le nom: " + mesEmployes[i].getNom() + " Salaire: "  +mesEmployes[i].getSalaire() + " Fin contrat: " + mesEmployes[i].getFinContrat());
//       }


    }
}


class Employe {
    public Employe(String nom, double salaire, int annee, int mois, int jour) {
        this.nom = nom;
        this.salaire = salaire;
        GregorianCalendar calendar = new GregorianCalendar(annee, mois - 1, jour);
        finContrat = calendar.getTime();

    }

    private String nom;
    private double salaire;
    private Date finContrat;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public Date getFinContrat() {
        return finContrat;
    }

    public void setFinContrat(Date finContrat) {
        this.finContrat = finContrat;
    }

    public void augmenterSalaire(double porcetage) {
        double augmentation = (salaire * porcetage) / 100;
        salaire += augmentation;
    }
}