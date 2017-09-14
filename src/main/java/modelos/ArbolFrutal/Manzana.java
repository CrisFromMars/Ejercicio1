package modelos.ArbolFrutal;

import modelos.Anotaciones.Informacion;

public class Manzana extends Frutas implements Informacion{


    public void tamano() {
        System.out.println("Soy de tamaño pequeño");

    }

    public void sabor() {
        System.out.println("Tengo un sabor dulce");
    }

    public void color() {
        System.out.println("Soy de color rojo");

    }

    public void peso() {
        System.out.println("Con una mano me sostienes");

    }
}
