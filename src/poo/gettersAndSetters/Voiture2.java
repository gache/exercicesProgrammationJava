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

    public void setCouleur() {
        couleur = "Bleu";
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

    public void setChaiseCuire(boolean chaiseCuire) {
        this.chaiseCuire = chaiseCuire;
    }

    public int getRoue() {
        return roue;
    }

    public void setRoue(int roue) {
        this.roue = roue;
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
