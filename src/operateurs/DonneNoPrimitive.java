package operateurs;

public class DonneNoPrimitive {
    public static void main(String[] args) {
        // Integer permet de stoker de donnés entier et null.
        // Je ne peux pas mettre null sur un donné de type primitive ça nous dit erreur
        // les données non primitive nou permet d'utilser les methode, chose qu'on ne peut pas faire avec les données primitive

        Integer valuer = 10;
        Integer valeur2 = null;


        // les chaine de chracter ou string
        // dans les chaines on peut utiliser les methodes.

        String mot = "Hola a todos";
        // Dans les chaines on utilise les " ", les '' simple sot pour la variable de type character
        System.out.println("El valor de la variable es: " + valuer);
        System.out.println("El valor de la variable es: " + valeur2);
        System.out.println(mot);
    }
}
