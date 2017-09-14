package modelos.Verduras;

import modelos.Anotaciones.Informacion;

public class Repoio extends Verduricas implements Informacion {
    public void tamano() {
        System.out.println("Poco grande, igual que la lechuga");
    }

    public void sabor() {
        System.out.println("Nulo, muy rico en tacos");
    }

    public void color() {
        System.out.println("Entre verde y blanco");
    }

    public void peso() {
        System.out.println("Ligero medio :)");
    }
}
