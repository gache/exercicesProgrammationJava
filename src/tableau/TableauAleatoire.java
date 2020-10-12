package tableau;

public class TableauAleatoire {
    public static void main(String[] args) {
        int[] aleatoire = new int[150];

        for (int i = 0; i < aleatoire.length; i++) {
            aleatoire[i] = (int) (Math.round(Math.random() * 100));
        }

        for (int numeros : aleatoire) {
            System.out.print(numeros + ", ");
        }
    }
}
