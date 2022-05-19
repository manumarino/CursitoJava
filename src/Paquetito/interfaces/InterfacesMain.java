package Paquetito.interfaces;

import Paquetito.Animales;

public class InterfacesMain {

    public static void main(String[] args) {
        //aca se utilizan las interfaces
        AnimalesAcciones mamifero = new AnimalesAccionesMamiferos();
        //esto es un polimorfismo de interfaces. creamos el objeto
        // mamifero que hereda de una interfaz (AnimalesAcciones) y de una implementacion (AnimalesAccionesMamiferos)

        Animales leon = mamifero.nacimientoAnimal();

    }
}
