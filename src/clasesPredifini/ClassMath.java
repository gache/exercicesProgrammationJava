package clasesPredifini;

public class ClassMath {
    public static void main(String[] args) {
        // sqrt() pour faire la racine carrée
        double racine = Math.sqrt(9);
        // sqrt de la clase Math fonctione avec double elle me retourne un valeur de type double


        //  transformer une variable double en int avec le methode sqtr
        int racine2 = (int)Math.sqrt(150);
        // je fais un caste
        // c'est mieux de laisser en double


        // Elever un numéro à sa puissance methode pow
        double base = 5, exposant =3;
        double resultat = Math.pow(base, exposant);
        // la puissance que je veux elever doit être en double et le resultat est double


        // Le methode pour faire l'arrondi  round
        double numero = 155.52;
        long resultat2 = Math.round(numero);

        float numero3 = 15.52f;
        int resultat3 = Math.round(numero3);
        // round me dit que si je veux changer un numero double et si je veux l'arrondir ce numero le resultat doit être dans une variable type long
       // round me dit que si je veux changer un numero float et si je veux l'arrondir ce numero le resultat doit être dans une variable type int


        // Methode Randon:  pour avoir de numeros de manière aleatoire
        double aleatoire = Math.random(); // Randon me donne de numero de type double

        System.out.println(racine);
        System.out.println(racine2);
        System.out.println(base);
        System.out.println(resultat);
        System.out.println(resultat2);
        System.out.println(resultat3);
        System.out.println(aleatoire);

    }
}
