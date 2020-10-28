package poo.interfacejava.mytemporisateur;

import javax.swing.*;

public class Temporisateur {
    public static void main(String[] args) {
        DonneHeure ecoute = new DonneHeure();
        Timer monTemporisateur = new Timer(5000, ecoute);
        monTemporisateur.start();

        JOptionPane.showMessageDialog(null, "Faire click pour arrêter le programme");
        System.exit(0);

    }
}
