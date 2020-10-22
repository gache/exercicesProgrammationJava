package poo.heritage.ideeHeritage;


public class Driver {
    public static void main(String[] args) {

        Voiture v1 = new Voiture();
        v1.setCouleur("Green");
        System.out.println(v1.donneGenerale() + v1.getCouleur());
        Fourgonnette fourgonnette1 = new Fourgonnette(580, 3);
        fourgonnette1.setCouleur("Red");
        fourgonnette1.setChaiseCuire("oui");
        fourgonnette1.setClimatisation("oui");
        System.out.println(fourgonnette1.donneGenerale() + fourgonnette1.getCapaciteCharge());

    }
}


