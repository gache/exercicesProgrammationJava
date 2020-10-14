package poo.gettersAndSetters;

public class DriverVoiture2 {
    public static void main(String[] args) {

        Voiture2 voiture2 = new Voiture2();
        System.out.println("Cette Voiture a " + voiture2.getRoue() + " roues.");
        System.out.println("Cette Voiture a une largeur de " + voiture2.getLargeur());

        Voiture2 v2 = new Voiture2();
        v2.setCouleur();
        System.out.println(v2.getCouleur());


    }
}
