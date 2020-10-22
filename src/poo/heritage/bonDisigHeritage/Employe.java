package poo.heritage.bonDisigHeritage;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employe {

    private String nom;
    private double salaire;
    private Date finContrat;

    public Employe(String nom, double salaire, int annee, int mois, int jour) {
        this.nom = nom;
        this.salaire = salaire;
        GregorianCalendar calendar = new GregorianCalendar( annee, mois - 1, jour);
        finContrat = calendar.getTime();
    }

    public Employe(String nom) {
        // this.nom = nom; // pour recuperer un seul parametre
        this(nom, 3000, 2000, 01,01);
        // comme je recepere le parametre nom. je peux initialiser par defaut les autres parametres qui font appel à  l'autre constructeur
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

    public void augmenterSalaire(double porcetage) {
        double augmentation = (salaire * porcetage) / 100;
        salaire += augmentation;
    }
}
