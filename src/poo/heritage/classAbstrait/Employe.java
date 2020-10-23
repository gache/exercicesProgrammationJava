package poo.heritage.classAbstrait;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employe extends Personne {

    private double salaire;
    private Date finContrat;
    private int id;
    private static int idIncrementation;

    public Employe( String prenom, double salaire, int annee, int mois, int jour) {
        super(prenom);
        this.salaire = salaire;
        GregorianCalendar calendar = new GregorianCalendar(annee, mois - 1, jour);
        finContrat = calendar.getTime();
        idIncrementation++;
        id = idIncrementation;
    }


//    public String getNom() {
//        return nom + " ID: " + id;
//    }

//    public void setNom(String nom) {
//        this.nom = nom;
//    }

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

    @Override
    public String description() {
        return "Cet employée a une Id: " + id + " avec Salaire: " + salaire + " date de fin contrat est: " + finContrat;
    }
}
