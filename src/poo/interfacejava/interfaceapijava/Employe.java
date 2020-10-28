package poo.interfacejava.interfaceapijava;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employe implements Comparable { // j'implemente interface Comparable de l'api de java

    private String nom;
    private double salaire;
    private Date finContrat;
    private int id;
    private static int idIncrementation;


    public Employe(String nom, double salaire, int annee, int mois, int jour) {
        this.nom = nom;
        this.salaire = salaire;
        GregorianCalendar calendar = new GregorianCalendar(annee, mois - 1, jour);
        finContrat = calendar.getTime();
        idIncrementation++;
        id = idIncrementation;

    }

    public String getNom() {
        return nom + " ID: " + id;
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

    @Override // cette inteface a la methode compareTo() pour organiser nos salaire
    public int compareTo(Object o) {
        Employe autreEmploye = (Employe) o;
        if (this.salaire < autreEmploye.salaire) {
            return -1;
        }
        if (this.salaire > autreEmploye.salaire) {
            return 1;
        }
        return 0;
    }
}
