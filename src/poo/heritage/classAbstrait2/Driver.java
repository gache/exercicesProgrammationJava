package poo.heritage.classAbstrait2;

public class Driver {
    public static void main(String[] args) {
        Plante plante = new Plante();
        plante.seNourrir();

        AnimalCarnivore animalCarnivore = new AnimalCarnivore();
        animalCarnivore.seNourrir();

        AnimalHerbivore animalHerbivore = new AnimalHerbivore();
        animalHerbivore.seNourrir();
    }
}
