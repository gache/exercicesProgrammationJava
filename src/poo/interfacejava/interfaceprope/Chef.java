package poo.interfacejava.interfaceprope;

public class Chef extends Employe implements Chefs {
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


    @Override
    public String prendreDecision(String decision) {
        return "Un membre de la direction a pris la décision de: " + decision;
    }

    @Override
    public double bonus(double bonification) {
        double prime = 2000;
        return Employes.bonusDeBase + bonification + prime;
    }
}
