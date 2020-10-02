package operateurs;

public class IncrementationDecrementation {
    public static void main(String[] args) {
        int x = 10;
        // L'operation d'incrementation est  ++ avec cet operateur j'incremente ma variable d'un valeur
        x++; // equivaut  x = x + 1; o x +=1;

        // L'operation d'incrementation est  -- avec cet operateur j'incremente ma variable d'un valeur
        x--; // equivaut x = x - 1; o x -=1;
        System.out.println(x);

        // les operateurs d'incrementation ou decrementation peuvent changer leurs valeurs au moment de l'asignation exemple

        int p = 5, y;
        y = p++; // dans ce cas à Y on l'asigne la valeur P et après de cette asignation à Y.  à P on l'incremente d'un valeur. ça arrive car la valeur d'incrementation est est à fin
        // y = p++;  dans ce cas il fait l'asignation d'abord et après  l'incrementation
        y = ++p; // dans ce cas on increment la valeur de P et après on l'asigne la valeur a Y
        // y = ++p dans ce cas il fait incrementation d'abord et après  l'asingation
        System.out.println(y);
        System.out.println(p);
    }
}
