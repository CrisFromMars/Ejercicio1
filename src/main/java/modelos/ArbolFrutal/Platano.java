package modelos.ArbolFrutal;

import modelos.Anotaciones.Informacion;

public class Platano extends Frutas implements Informacion{
    public void tamano() {
        System.out.println("Alargado");
    }

    public void sabor() {
        System.out.println("Plataneico");
    }

    public void color() {
        System.out.println("Amarillo banana");
    }

    public void peso() {
        System.out.println("Peso variable");
    }
}
