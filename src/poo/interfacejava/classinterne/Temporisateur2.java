package poo.interfacejava.classinterne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Temporisateur2 {
    public static void main(String[] args) {

        Montre maMontre = new Montre(3000, true);
        maMontre.marche();
        JOptionPane.showMessageDialog(null, "Faire click pour arrêter le programme");
        System.exit(0);

    }
}


class Montre {

    private int intervale;
    private boolean son;

    public Montre(int intervale, boolean son) {
        this.intervale = intervale;
        this.son = son;

    }

    public void marche() {
        ActionListener ecoute = new DonneHeure2();
        Timer montempo = new Timer(intervale, ecoute);
        montempo.start();
    }

    private class DonneHeure2 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Date heure = new Date();
            System.out.println("Je mets l'heure chaque 3 seconde " + heure);
            if (son) {
                Toolkit.getDefaultToolkit().beep();
            }

        }
    }

}