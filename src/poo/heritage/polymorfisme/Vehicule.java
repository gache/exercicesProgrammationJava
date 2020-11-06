package poo.heritage.polymorfisme;

public class Vehicule {
    protected String matricule;
    protected String marque;
    protected String modele;


    public Vehicule(String matricule, String marque, String modele) {
        this.matricule = matricule;
        this.marque = marque;
        this.modele = modele;
    }

    public String getDonner() {
        return "L'objet Vehicule "+ "\n" +
                "la matrcule est:"  +matricule + "\n" +
                "La marque est: " + marque + "\n" +
                "Le modele est: " + modele ;
    }

}
