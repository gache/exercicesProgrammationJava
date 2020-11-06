package poo.redefinitionmethode;

public class Personne extends Animal {
    @Override
    public void manger() {
        System.out.println("La personne est en train de manger avec de couvert ");
    }
}
