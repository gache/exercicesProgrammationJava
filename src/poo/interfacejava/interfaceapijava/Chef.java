package poo.interfacejava.interfaceapijava;

public class Chef extends Employe {
    private double prime;

    public Chef(String nom, double salaire, int annee, int mois, int jour) {
        super(nom, salaire, annee, mois, jour);
    }


    public void setPrime(double prime) {
        this.prime = prime;
    }

    public double getSalaire() {
        double salaireChef = super.getSalaire(); // avec super il fait appel au methode de la class Employe
        return salaireChef + prime;
    }
}
