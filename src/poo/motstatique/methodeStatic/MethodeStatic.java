package poo.motstatique.methodeStatic;

public class MethodeStatic {
    private final String prenom; // c'est une constante
    private String section;
    private int id;
    private static int idIncrementation = 1;


    public MethodeStatic(String prenom) { // je le passe son prenom comme parametre dans le constructeur et pas setter car  je ne peut pas modifier son prenom
        this.prenom = prenom;
        section = "Administration"; // je met un etat initial à la propriété  section
        id = idIncrementation;
        idIncrementation++;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getSection() {
        return "Le nom est: " + prenom + " et la section est: " + section + " et son id est: " + id;
    }

    public static String getIdSuivant() {
        return "L'id suivant est : " + idIncrementation;
    }
}
