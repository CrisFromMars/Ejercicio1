package modelos.ArbolFrutal;

import modelos.Anotaciones.Informacion;

public class Naranja extends Frutas implements Informacion {
    public void tamano() {
        System.out.println("Igual que la manzana");
    }

    public void sabor() {
        System.out.println("Muy dulce");
    }

    public void color() {
        System.out.println(":v naranja");
    }

    public void peso() {
        System.out.println("Peso ligero");
    }
}
