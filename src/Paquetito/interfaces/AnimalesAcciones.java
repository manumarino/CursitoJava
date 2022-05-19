package Paquetito.interfaces;

import Paquetito.Animales;

public interface AnimalesAcciones {

    //en lugar de usar 'class' usamos 'interface'
    //ACA SE DEFINEN METODOS DE QUE ES LO QUE HAY QUE HACER Y ES UNA CLASE QUIEN TOMA ESO Y DEFIENE COMO LO TIENE QUE HACER
    Animales nacimientoAnimal(); //este metodo no tiene cuerpo, solo la signatura

    //nuevo metodo
    void alimentarAnimal(Animales animales);
}
