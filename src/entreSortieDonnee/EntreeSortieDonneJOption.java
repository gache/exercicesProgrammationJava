package entreSortieDonnee;

import javax.swing.*;

public class EntreeSortieDonneJOption {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Saisir un prenom");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Saisir ton age"));
        System.out.println("Salut " + nom + " as " + age + " ans");
    }


}
