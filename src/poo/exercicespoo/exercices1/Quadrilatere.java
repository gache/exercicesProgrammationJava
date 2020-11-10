package poo.exercicespoo.exercices1;

public class Quadrilatere {

    private float lado1, lado2;

    // Methode constructor pour Quadrilatere
    public Quadrilatere(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Methode constructor 2 pour (Carré)
    public Quadrilatere(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }


    public float getArea() {
        float area = (lado1 * lado2);
        return area;
    }

    public float perimetro() {
        float perimetro = 2 * (lado1 + lado2);
        return perimetro;
    }
}
