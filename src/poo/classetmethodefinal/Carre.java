package poo.classetmethodefinal;

public class Carre extends FugureFermer {

    private double superficie;

    public Carre(double taille, int nCote, double superficie) {
        super(taille, nCote);
        this.superficie = superficie;
    }

    public void designer1() {
        System.out.println("je fais une desing de mon carre");
    }
}
