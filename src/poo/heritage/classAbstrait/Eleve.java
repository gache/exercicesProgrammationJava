package poo.heritage.classAbstrait;

public class Eleve extends Personne {

    private String carriere;

    public Eleve(String prenom, String carriere) {
        super(prenom);
        this.carriere = carriere;
    }

    @Override
    public String description() {
        return "Cet elève est en train d'etudier la carrière de: " + carriere;
    }
}
