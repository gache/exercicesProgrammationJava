package poo.heritage.personne;

public class Etudiant extends Personne {
    private int codeEtudiant;
    private float noteFinal;


    public Etudiant(String prenom, String nom, int age, int codeEtudiant, float noteFinal) {
        super(prenom, nom, age);
        this.codeEtudiant = codeEtudiant;
        this.noteFinal = noteFinal;
    }

    public void getDonner() {
        System.out.println("Son prenom est: " + getPrenom() + " Son nom famille est: " + getNom() +
        " son age est: " + getAge() + " sa note finale est: " + noteFinal + " Son code étudiant est: " +
                codeEtudiant
        );
    }
}
