package boucles.boucleFor;

import javax.swing.*;

public class VerificationMail {
    public static void main(String[] args) {
        int arobase = 0;
        boolean point = false;
        String mail = JOptionPane.showInputDialog("Saisir votre mail: ");

        for (int i = 0; i < mail.length(); i++) {
            if (mail.charAt(i) == '@') {
                arobase++;
            }
            if (mail.charAt(i) == '.') {
                point = true;
            }
        }
        if (arobase == 1 && point) {
            System.out.println("Le mail est correcte");
        } else {
            System.out.println("Le mail n'est pas correcte");
        }

    }
}
