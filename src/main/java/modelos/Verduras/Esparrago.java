package modelos.Verduras;

import modelos.Anotaciones.Informacion;

public class Esparrago extends Verduricas implements Informacion {
    public void tamano() {
        System.out.println("Alargado y pequeño");
    }

    public void sabor() {
        System.out.println("Feo, no se deberian comer");
    }

    public void color() {
        System.out.println("Verdeson");
    }

    public void peso() {
        System.out.println("Algo ligero");
    }
}
