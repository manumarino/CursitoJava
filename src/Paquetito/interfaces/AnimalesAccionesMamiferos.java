package Paquetito.interfaces;

import Paquetito.Animales;
import Paquetito.AnimalesLeon;
import Paquetito.interfaces.AnimalesAcciones;

public class AnimalesAccionesMamiferos implements AnimalesAcciones {
   //esta es la estructura de la implementacion del metodo
    @Override
    public Animales nacimientoAnimal() {
        System.out.println("acaba de nacer un mamifero Leon");
        return new AnimalesLeon();
    }

    @Override
    public void alimentarAnimal(Animales animales) {
        System.out.println("alimentando al animal");

    }
    //las clases que implementan interfaces estan obligadas a proporcionar cuerpos para la implementacion


}
