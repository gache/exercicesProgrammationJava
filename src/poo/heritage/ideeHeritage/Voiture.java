package poo.heritage.ideeHeritage;

public class Voiture {

    private int roue;
    private int largeur;
    private int longueur;
    private int moteur;
    private int poidVoiture;
    String couleur;
    int poidTotale;
    boolean climatisation, chaiseCuire;


    public Voiture() {
        roue = 4;
        largeur = 2000;
        longueur = 300;
        moteur = 1600;
        poidVoiture = 500;
    }

    public  String donneGenerale(){
        return "La plataforme du Vehicule a: " + roue + " roues" + " mesure " + largeur/1000 + " mètres avec une largeur de: "
                + longueur + " cm et un poid de la plataforme de: " + poidVoiture + " kg";
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

    public int getPoidVoiture() {
        return poidVoiture;
    }

    public void setPoidVoiture(int poidVoiture) {
        this.poidVoiture = poidVoiture;
    }

    public String getCouleur() {
        return " La couleur de la Voiture est : " + couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getPoidTotale() {
        return poidTotale;
    }

    public void setPoidTotale(int poidTotale) {
        this.poidTotale = poidTotale;
    }

    public String Climatisation() {
        if (climatisation) {
            return "La voiture a la climatisation";
        } else {
            return "La voiture n'a pas la climatisationn";
        }
    }

    public void setClimatisation(String climatisation) {
        if (climatisation.equals("oui")) {
            this.climatisation = true;
        } else {
            this.climatisation = false;
        }
    }

    public String ChaiseCuire() {
        if (chaiseCuire) {
            return "La voiture a chaise en cuire";
        } else {
            return "La voiture a chaise en serie";
        }
    }

    public void setChaiseCuire(String chaiseCuire) {
        if (chaiseCuire.equals("oui")) {
            this.chaiseCuire = true;
        } else {
            this.chaiseCuire = false;
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
}
