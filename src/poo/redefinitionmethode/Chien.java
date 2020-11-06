package poo.redefinitionmethode;

public class Chien extends Animal {
    @Override
    public void manger() {
        System.out.println("Le chien mange avec plat par terre");
    }
}
