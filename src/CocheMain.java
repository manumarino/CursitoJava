public class CocheMain { //creamos la clase con el metodo main

    public static void main(String[] args) {
        //este metodo main es el punto de entrada de la aplicacion en la que usamos una clase de otro archivo.
        String coche = "alfa romeo";
        Coche cocheObj = new Coche(); //invocamos el metodo constructor, para crear el objeto.
        //Coche es el tipo de dato. new es el operador que permite crear un bjeto a partir de la clase Coche

        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 635.87, 5.4 ); //instanciamos la clase,
        // con los valores de los atributos particulares del coche en concreto

        cocheObj2.acelerar(50); //accedemos a los atributos o metodos del objeto (ya que no estan encapsulados)
        System.out.println(cocheObj2);

        Herencia cocheElectrico = new Herencia(); //creamos un objeto de la clase Herencia
        cocheElectrico.motorElectrico = "ejemplo de motor";
        cocheElectrico.color = "azul";
        cocheElectrico.fabricante = "Red Bull";
        System.out.println(cocheElectrico);
    }
}
