package poo.exercicespoo.exercices3;

public class Vehicule {

    private String marque;
    private String modele;
    private float prix;

    public Vehicule(String marque, String modele, float prix) {
        this.marque = marque;
        this.modele = modele;
        this.prix = prix;
    }

    public float getPrix() {
        return prix;
    }

    public String montrerDonner() {
        return "La marque  est: " + marque + "\n" +
                "Le Modele est: " + modele + "\n" +
                "Le prix est: $" + prix;
    }
}
