package premierPas;

public class TypeVariable {
    public static void main(String[] args) {
        //  Variables qui stoke numeros entier

        byte entier; // un entier relatif très court (entre -128 et 127).
        entier = 80;
        short entier2 = 1800; // type de donné de 16 bits un entier relatif court (entre -32 768 et 32 767).
        int entier3   = 15000; //type de donné de 32 bits un entier relatif (entre -2 147 483 648 et 2 147 483 647).
        long entier4  = 1500000; // type de donné de 64 bits un entier relatif long (entre -9 223 372 036 854 775 808 et 9 223 372 036 854 775 807).

        System.out.println("Le Numéro byte est: " + entier);
        System.out.println("Le Numéro short deux  est: " + entier2);
        System.out.println("Le Numéro int trois est: " + entier3);
        System.out.println("Le Numéro long quatre est: " + entier4);

        //  Variables qui stoke numeros decimal

        float decimal = 1.5f; // Quand je declere une variable de type float je dois mettre à fin de la déclaration la lettre f pour indiquer float

        double decimal2 = 34.55154; //con este tipo de variable no tengo necesidad de colocar la letra f
        System.out.println("Le Numero float est: " + decimal);
        System.out.println("Le Numero double est: " + decimal2);

        // un caractère (entre '\u0000' et '\uffff').
        char caracter = '1';
        System.out.println("El Caracter char es: " + caracter ); // pour stoker un charecter on utilise ''

        // un booléen  qui ne pourra prendre que les valeurs true ou false
        boolean decision = true;
        System.out.println("La Decision boolean es : " + decision);
    }
}
