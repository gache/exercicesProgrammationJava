package clasesPredifini;

public class ClassString {

    // les methodes plus utilisés de la class String

   // length(): retourne les numeros de charecter de la chaine
   // charAt(n): retourne la position d'un charecter à l'interieur de la chaine
   // substring(): retourne une sub chaine à l'interieur de la cahine initiale
   // equals(): retourne true si deux chaine sont pareil et false si les deux chaines ne sont pas pareil
    public static void main(String[] args) {

      String chaine = "Hola soy Erick";
      String chaine2 = "hola soy Erick";
      String chaine3 = "Aujourd'hui c'est un jour magnifique pour appredre Java";

      int finLettre = chaine.length();
        System.out.println(chaine);
        System.out.println("Ma chaine a " + chaine.length() + " lettres.");
        System.out.println("la première lettre de ma chaine est " + chaine.charAt(0));
        System.out.println("la dernière lettre de ma chaine est " + chaine.charAt(finLettre - 1));
        System.out.println(chaine.substring(4));
        System.out.println(chaine3.substring(0,36) + " pour aller à la plage" +  " et " + chaine3.substring(42, 55)); // concatenation avec d'autre string
        System.out.println(chaine.equals(chaine2)); // returne true ou false
        System.out.println(chaine.equalsIgnoreCase(chaine2)); // returne true ou false par contre ignore les mayuscule et le miniscule


    }
}
