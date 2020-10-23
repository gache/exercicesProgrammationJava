package poo.heritage.classAbstrait;

public abstract class Personne {
    private String prenom;

    public Personne(String prenom) {
        this.prenom = prenom;
    }

    public String getPrenom() {
        return prenom;
    }

    public abstract String description(); // déclaration du methode abstract
}
