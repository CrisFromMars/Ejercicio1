package modelos.Verduras;

import modelos.Anotaciones.Informacion;

public class Lechuga extends Verduricas implements Informacion {
    public void tamano() {
        System.out.println("Bien grande");
    }

    public void sabor() {
        System.out.println("A agua");
    }

    public void color() {
        System.out.println("Verde");
    }

    public void peso() {
        System.out.println("Muy ligero");
    }
}
