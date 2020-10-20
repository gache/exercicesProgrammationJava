package poo.gettersAndSetters;

public class Voiture2 {

    private int roue;
    private int largeur;
    private int longueur;
    private int moteur;
    private int poidVoiture;
    String couleur;
    int poidTotale;
    boolean climatisation, chaiseCuire;

    public Voiture2() {
        roue = 4;
        largeur = 2000;
        longueur = 300;
        moteur = 1600;
        poidVoiture = 500;
    }

    public void setCouleur(String couleurVoiture) {
        // couleur = "Bleu";
        this.couleur = couleurVoiture;
    }

    public String getCouleur() {
        return "La couleur de la Voiture est : " + couleur;
    }

    public void setPoidTotale(int poidTotale) {
        this.poidTotale = poidTotale;
    }

    public void setClimatisation(boolean climatisation) {
        this.climatisation = climatisation;
    }

    // configuration de la chaise
    public void setChaiseCuire(String chaiseCuire) {
        if (chaiseCuire.equals("oui")) {
            this.chaiseCuire = true;
        } else {
            this.chaiseCuire = false;
        }
    }

    public String chaise() {
        if (chaiseCuire) {
            return "La voiture a chaise en cuire";
        } else {
            return "La voiture a chaise en serie";
        }
    }

    public void setClimatisation(String climatisation) {
        if (climatisation.equals("oui")) {
            this.climatisation = true;
        } else {
            this.climatisation = false;
        }
    }

    public String climatisation() {
        if (climatisation) {
            return "La voiture a la climatisation";
        } else {
            return "La voiture n'a pas la climatisationn";
        }
    }

    public int prixVoiture() {
        int prixFinal = 10000;

        if (chaiseCuire) {
            prixFinal += 2000;
        }

        if (climatisation) {
            prixFinal += 1500;

        }
        return prixFinal;
    }

    public int getRoue() {
        return roue;
    }

    public void setRoue(int roue) {

    }

    public int getLargeur() {
        return largeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setLongueur(int longueur) {
        this.longueur = longueur;
    }

    public int getMoteur() {
        return moteur;
    }

    public void setMoteur(int moteur) {
        this.moteur = moteur;
    }

    public int getPoid() {
        return poidVoiture;
    }

    public void setPoid(int poid) {
        this.poidVoiture = poid;
    }


}
