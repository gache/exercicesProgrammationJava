package poo.heritage.polymorfisme;

public class VehiculeTourisme extends Vehicule {
    private int nPorte;

    public VehiculeTourisme(String matricule, String marque, String modele, int nPorte) {
        super(matricule, marque, modele);
        this.nPorte = nPorte;
    }

    @Override
    public String getDonner() {
         return "\n" + "L'objet VehiculeTourisme "+ "\n" +
                 "la matrcule est:"  +matricule + "\n" +
                 "La marque est: " + marque + "\n" +
                 "Le modele est: " + modele+ "\n" +
                 "Le numeros de portes: " + nPorte;
    }
}
