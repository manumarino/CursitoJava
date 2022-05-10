

public class TiposDatos{


    //creamos un metodo dentro de la clase desde donde podamos definir y ejecutar los distintos tipos de datos
    public static void main(String[] args) {  
     
        //MANERA DE ASIGNARLO
        // tipo identificador = 30;

        //MANERA DE ASIGNARLO
        // tipo identificador;
        // identificador = 30;

        //TIPOS PRIMITIVOS
        /*
        Los tipos de datos primitivos no pueden ser nulos. por lo tanto hacer ' int numero = null; ' (que no tiene un valor definido) daria error.
        Para esto tenemos los TIPOS ENVOLTORIO.
        */

        //LAS VARIABLES TIENEN QUE EMPEZAR SIEMPRE EN MINUSCULA Y LAS CLASES SIEMPRE EN MAYUSCULA

        //tipos de datos ENTEROS
        byte number1 = 1; // capacidad de 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4l; // 8 byte. se puede poner una 'l'. tienen mayor capacidad de alamcenamiento y son interesantes para trabajar con INDENTIFICADORES O CLAVES PRIMARIAS A NIVEL DE BASES DE DATOS.

        //tipos de datos PUNTO FLOTANTE
        float decimal1 = 4.9f; // se le agrega 'f' para especificar que es un float. No es estrictamente necesario
        double decimal2 = 4.99d; // se le agrega 'd' para especificar que es un double. Tiene mayor capacidad de almacenamiento.

        //tipo de dato CARACTER
        char caracter1 = 'a'; //pensado para solo un caracter

        //tipo de dato BOOLEANO
        boolean verdader = true; //cuando la palabra toma color es que son PALABRAS RESERVADAS (JAVA KEYWORDS)
        boolean falso = false;

        //HASTA AQUI LOS TIPOS PRIMITIVOS, que por ser primitivos NO aceptan ser nulos (null), como si los String.

        //tipos de datos de CADENAS DE TEXTO
        String nombre = "Alan"; // involucra utilizar una clase (ver programacion orientada a objetos)

        //tipos de datos ENVOLTORIO, que funcionan como clases y nos permiten envolver a los tipos primitivos y emplear nulos.
        Integer numero = null; 
        Long numero2 = 2L; // se puede poner una 'L' para indicar que es un Long tipo clase envoltorio.
        /*
        Los tipos envoltorio son tipo clases (empiezan con mayusculas) que envuelven a los tipos primitivos y nos permiten usarlos sin definirlos (nulos).
        Esto puede ser util para cuando tenemos que tener algo tipo columnas de matrices que todavia no estan ingresadas por el usuario o el dato no se ha creado.
        */







    }
}