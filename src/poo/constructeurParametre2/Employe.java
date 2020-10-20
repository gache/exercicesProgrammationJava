package poo.constructeurParametre2;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employe {
    private String nom;
    private double salaire;
    private Date finContrat;

    public Employe(String nom, double salaire, int annee, int mois, int jour) {
        this.nom = nom;
        this.salaire = salaire;
        GregorianCalendar calendar = new GregorianCalendar( annee, mois, jour);
        finContrat = calendar.getTime();
    }

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

    public void augmenterSalaire(double porcentage) {
        double aumentation = (salaire * porcentage) / 100;
        salaire += aumentation;

    }
}
