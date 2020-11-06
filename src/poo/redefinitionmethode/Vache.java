package poo.redefinitionmethode;

public class Vache extends Animal{
    @Override
    public void manger() {
        System.out.println("La vache mange de l'herbe");
    }
}
