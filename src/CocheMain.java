public class CocheMain { //creamos la clase con el metodo main.PUNTO DE ENTRADA A LA APLICACION

    public static void main(String[] args) {
        //este metodo main es el punto de entrada de la aplicacion en la que usamos una clase de otro archivo.
        String coche = "alfa romeo";
        Coche cocheObj = new Coche(); //invocamos el metodo constructor, para crear el objeto.
        //Coche es el tipo de dato. new es el operador que permite crear un bjeto a partir de la clase Coche

        Coche cocheObj2 = new Coche("rojo", "honda", "civic", 635.87, 5.4 ); //instanciamos la clase,
        // con los valores de los atributos particulares del coche en concreto
        //CON CTRL+P NOS MUESTRA LOS PARAMETROS QUE TENEMOS QUE ENVIAR SEGUN EL CONSTRUCTOR QUE YA EXISTA

        cocheObj2.acelerar(50); //accedemos a los atributos o metodos del objeto (ya que no estan encapsulados)
        System.out.println(cocheObj2);

        //otra forma de cambiar un atributo
        cocheObj2.peso = 1985.8;
        System.out.println(cocheObj2);


        Herencia cocheElectrico = new Herencia(); //creamos un objeto de la clase Herencia
        cocheElectrico.motorElectrico = "ejemplo de motor";
        cocheElectrico.color = "azul";
        cocheElectrico.fabricante = "Red Bull";
        System.out.println(cocheElectrico);


        //  CREAMOS UN OBJETO DE LA CLASE COCHE ELECTRICO QUE HEREDA COCHE
        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "modelo de motor x";

//queremos enviar en el constructor todos los parametros que acepta. pero al intentarlo, solo nos da la opcion de poner motorElectrico.
        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 6473d, 9.65, "xiaomi");
        //entonces usamos la sobrecarga, creando un nuevo constructor con distinta signatura, pasandole los atriutos de la clase superior y el de la herencia
//imprimimos para verificar que los atributos del nuevo coche 2 adquieren los valores que pasamos
        System.out.println(cocheElectrico2);



        //EN COCHE TENEMOS EL METODO ACELERAR PERO EN COCHE ELECTRICO NO. la sobreescritura podemos modificar el comportamiento del metodo.
        //lo podemos hacer dentro de la clase cocheElectrico, reescribiendo el metodo de la clase superior
        cocheElectrico2.acelerar(50);
        //OJO!! como sobreescribimos el metodo acelerar en la clase cocheElectrico, ahora el *50 es *2*50


    }
}

//EL METODO SUPER nos permite acceder al constructor de una clase base
