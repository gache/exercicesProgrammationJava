package operateurs;

import java.util.Scanner;

public class OperateurArithmetique {
    public static void main(String[] args) {
        Scanner entradaDatos = new Scanner(System.in);
        // Declaration des variables.
        float numero1,numero2,addition,moins,fois,div,module;

        // Demande d'information de saisir les numeros
        System.out.println("Saisir deux numeros: ");
        numero1 = entradaDatos.nextFloat();
        numero2 = entradaDatos.nextFloat();

        // Je fais les operations
        addition  = numero1 + numero2;
        moins = numero1 - numero2;
        fois = numero1 * numero2;
        div   = numero1 / numero2;
        module = numero1 % numero2;

        //J'imprime en console
        System.out.println("La addition est: " + addition);
        System.out.println("La moins est: " + moins);
        System.out.println("La fois est: " + fois);
        System.out.println("La div est: " + div);
        System.out.println("La module est: " + module);
    }
}
