package poo.heritage.polymorfisme;

public class VehiculeFourgonnette extends  Vehicule{
    private int charge;

    public VehiculeFourgonnette(String matricule, String marque, String modele, int charge) {
        super(matricule, marque, modele);
        this.charge = charge;
    }

    @Override
    public String getDonner() {
        return "\n" + "L'objet VehiculeFourgonnette "+ "\n" +
                "la matrcule est:"  +matricule + "\n" +
                "La marque est: " + marque + "\n" +
                "Le modele est: " + modele + "\n" +
                "La charge voiture est: " +charge;
    }
}
