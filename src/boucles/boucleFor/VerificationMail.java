package boucles.boucleFor;

import javax.swing.*;

public class VerificationMail {
    public static void main(String[] args) {
        boolean arobase = false;
        String mail = JOptionPane.showInputDialog("Saisir votre mail: ");

        for (int i = 0; i < mail.length(); i++){
            if (mail.charAt(i) == '@') {
                arobase = true;
                break;
            }
        }
        if(arobase){
            System.out.println("mail correcte");
        }else {
            System.out.println("mail n'est pas correcte");
        }

    }
}
