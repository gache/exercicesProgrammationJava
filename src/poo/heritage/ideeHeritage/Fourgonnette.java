package poo.heritage.ideeHeritage;

public class Fourgonnette extends Voiture {

    private int capaciteCharge;
    private int numeroPlace;

    public Fourgonnette(int capaciteCharge, int numeroPlace) {
        super(); // avec le mot super on fait appel au constructeur de la class mère
        this.capaciteCharge = capaciteCharge;
        this.numeroPlace = numeroPlace;
    }


    public String getCapaciteCharge() {
        return " La capacité de charge est: " + capaciteCharge + " et le numéro de place est: " + numeroPlace;
    }


}
