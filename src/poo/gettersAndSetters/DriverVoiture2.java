package poo.gettersAndSetters;

import java.util.Scanner;

public class DriverVoiture2 {
    public static void main(String[] args) {

        Voiture2 voiture2 = new Voiture2();
        System.out.println("Cette Voiture a " + voiture2.getRoue() + " roues.");
        System.out.println("Cette Voiture a une largeur de " + voiture2.getLargeur());

        Voiture2 v2 = new Voiture2();
        v2.setCouleur("red");
        System.out.println(v2.getCouleur());

        v2.setChaiseCuire("oui");
        System.out.println( v2.chaise());

        v2.setClimatisation("oui");
        System.out.println( v2.climatisation());
        System.out.println( "Le prix de la voiture est: "+v2.prixVoiture());




    }
}
