package poo.classetmethodefinal;

public class FugureFermer extends Figure {

    private int nCote;

    public FugureFermer(double taille, int nCote) {
        super(taille);
        this.nCote = nCote;
    }

    public final void designer() {
        System.out.println("je fais un desing de ma figure fermer");
    }
}
