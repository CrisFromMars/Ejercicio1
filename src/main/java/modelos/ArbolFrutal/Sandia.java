package modelos.ArbolFrutal;

import modelos.Anotaciones.Informacion;

public class Sandia extends Frutas implements Informacion {
    public void tamano() {
        System.out.println("Muy grande");
    }

    public void sabor() {
        System.out.println("Dulce y muy rica");
    }

    public void color() {
        System.out.println("Verde por fuera, rojo por dentro");
    }

    public void peso() {
        System.out.println("Muy pesada, la fruta mas pesada");
    }
}
