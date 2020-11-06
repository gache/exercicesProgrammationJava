package poo.heritage.polymorfisme;

public class VehiculeDeportive extends Vehicule {

    private int puissance;

    public VehiculeDeportive(String matricule, String marque, String modele, int puissance) {
        super(matricule, marque, modele);
        this.puissance = puissance;
    }

    @Override
    public String getDonner() {
        return "\n" + "L'objet VehiculeDeportive "+ "\n" +
                "la matrcule est:"  +matricule + "\n" +
                "La marque est: " + marque + "\n" +
                "Le modele est: " + modele + "\n" +
                "La puissande voiture est: " + puissance;
    }
}
