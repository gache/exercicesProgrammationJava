package poo.redefinitionmethode;

public class Driver {
    public static void main(String[] args) {

        Personne personne = new Personne();
        personne.manger();

        Chien chien = new Chien();
        chien.manger();

        Vache vache = new Vache();
        vache.manger();
    }
}
