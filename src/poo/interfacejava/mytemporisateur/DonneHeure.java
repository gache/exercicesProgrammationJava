package poo.interfacejava.mytemporisateur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class DonneHeure implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        Date heure = new Date();
        System.out.println("Je mets l'heure chaque seconde " + heure);

    }
}
