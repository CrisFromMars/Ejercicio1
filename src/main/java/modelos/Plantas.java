package modelos;

import modelos.Anotaciones.Informacion;
import modelos.Anotaciones.Oferta;
import modelos.ArbolFrutal.Manzana;
import modelos.ArbolFrutal.Naranja;
import modelos.ArbolFrutal.Platano;
import modelos.ArbolFrutal.Sandia;
import modelos.Verduras.Cebolla;
import modelos.Verduras.Repoio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Plantas {

    public static void main(String[] args){


        Naranja naranjita = new Naranja(){

            public void color(){
                System.out.println("Como soy naranjita, estoy verde xdxdd");
            }



        };
       
        Repoio repollon = new Repoio(){

            @Override
            public void sabor() {
                System.out.println("Con unos buenos tacos, mi sabor es muy bueno");
            }
        };

        Cebolla cebollini = new Cebolla(){

            @Override
            public void peso() {
                System.out.println("Entre mas capas tenga, mas pesada soy");
            }
        };

        Sandia sandia = new Sandia();
        Platano platanin = new Platano();
        Manzana manzanica = new Manzana();

        List<Informacion> FyV = new ArrayList<Informacion>();

        FyV.add(cebollini);
        FyV.add(repollon);
        FyV.add(naranjita);
        FyV.add(manzanica);
        FyV.add(platanin);
        FyV.add(sandia);

        System.out.println("Adivina la Fruta o Verdura :D");
        FyV.stream().forEach(new Consumer<Informacion>() {
            public void accept(Informacion x) {
                System.out.println();
                x.color();
                x.peso();
                x.sabor();
                x.tamano();
                System.out.print("-|-|-|-|-|-|");
                System.out.println();
            }
            });








    }



}
