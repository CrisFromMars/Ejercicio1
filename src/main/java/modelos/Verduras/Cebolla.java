package modelos.Verduras;

import modelos.Anotaciones.Informacion;

public class Cebolla extends Verduricas implements Informacion{
    public void tamano() {
        System.out.println("Igual que el tomate gg");
    }

    public void sabor() {
        System.out.println("Cocida, muy buena; Cruda, horrible");
    }

    public void color() {
        System.out.println("Blanca :) ");
    }

    public void peso() {
        System.out.println("Normal, pequeña");
    }
}
