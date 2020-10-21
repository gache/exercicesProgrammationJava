package constante;

public class EmployeConstante {
    private final String prenom; // c'est une constante
    private String section;


    public EmployeConstante(String prenom) { // je le passe son prenom comme parametre dans le constructeur et pas setter car  je ne peut pas modifier son prenom
        this.prenom = prenom;
        section = "Administration"; // je met un etat initial à la propriété  section
    }


    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return "Le nom est: " + prenom + " et la section est: "  +  section;
    }

}
