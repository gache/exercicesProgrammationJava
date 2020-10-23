package poo.heritage.classAbstrait;

public class DriverAbstrait {
    public static void main(String[] args) {

        Personne [] personne = new Personne[2];
        personne[0] = new Eleve("Pedro", "Medicine");
        personne[1] = new Employe("Maria",1500,2020, 12,30);

        for (int i = 0; i < personne.length; i++){
            System.out.println(personne[i].getPrenom() + ", " +  personne[i].description());
        }
        System.out.println();
        System.out.println("Boucle for each");
        for (Personne e: personne) {
            System.out.println(e.getPrenom() + ", " +  e.description());
        }
    }
}
