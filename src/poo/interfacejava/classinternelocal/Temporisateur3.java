package poo.interfacejava.classinternelocal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Temporisateur3 {
    public static void main(String[] args) {
        Montre2 montre2 = new Montre2();
        montre2.marche(3000, true);
        JOptionPane.showMessageDialog(null,"Faire click pour arrêter le programme");
        System.exit(0);

    }
}

class Montre2 {

    public void marche(int intervale, final boolean son) {
        class DonnerHeure3 implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date heure2 = new Date();
                System.out.println("Je mets l'heure chaque 3 seconde " + heure2);
                if (son) {
                    Toolkit.getDefaultToolkit().beep();
                }

            }
        }
        ActionListener ecoute = new DonnerHeure3();
        Timer monTempo2 = new Timer(intervale, ecoute);
        monTempo2.start();

    }


}
