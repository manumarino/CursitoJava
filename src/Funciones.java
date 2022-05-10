public class Funciones {
    public static void main(String[] args) {
        


        //Funciones son agrupaciones de sentencias que pueden ser utilizadas desde cualquier punto de nuestra aplicacion, invocandola. PARA NO DUPLICAR CODIGO

        holaMundo();
        holaMundo("Manu");
        String hola = devolverHola(); //iniciamos un tipo de dato envoltorio
        System.out.println(hola); //imprimimos el dato

    }
//creamos una puncion con identificador 'holaMundo'
    private static void holaMundo(){
        //la funcion puede devolver 'void' o puede devolver 'String'
        //'static' indica que pertenece a la clase Funciones. es decir, que sus metodos pueden ser invocados sin necesidad de crear un objeto de la clase Funciones (ver programacion orientada a objetos)
        //'public' o 'private' indican si la funcion puede ser invocada desde fuera de la clase o no.
        System.out.println("Hola mundo desde un metodo");

    }
    //Ahora una funcion que tome un PARAMETRO O ARGUMENTO como entrada
    public static void holaMundo(String name){
        System.out.println("Hola " + name); //concatenamos lo que nos ingresa a la funcion
    }

    //Ahora no recibimos un parametro pero devolvemos un String, con 'return'
    public static String devolverHola(){
        return "Hola"; //RETORNO DE DATO
    }

    //AMBITO Y RETORNO DE UNA FUNCION
    //private o public determina si la funcion es accesible desde fuera de la clase o no.
    // podriamos llamar una funcion de otra clase como 'Clase.funcion();'

    //ademas, puede ser 'protected', que significa que solo las clases dentro del mismo paquete pueden acceder a dicha funcion. solo las clases hijas del mismo paquete.

    

    //FUNCIONES SOBRECARGADAS
    /*
    Una funcion sobrecargada son funciones con nombre duplicado (asignatura), pero que tienen diferentes parametros (parametros de ingreso o return) y por lo tanto no esta duplicada.
    Es mucho mas facil tener una misma funcion que este sobrecargada y permita ingresar varios tipos de datos que tener todas funciones distintas que hagan cosas similares, que terminaria distrayendo.
    */

    private static void queTal(){
        System.out.println("Que tal!");
    }
    private static void queTal(String name){
        System.out.println("Hola" + name);
    }
    private static int sum(int num1, int num2){
        return num1 + num2;
    }
    //STATIC es un modificador que indica que pertenece a la clase, es decir que estos metodos van a poder ser invocados sin necesidad de crear un objeto de la clase. (programacion orientada a objetos)
    //Al ser static, debo llamar esta funcion desde otra clase al estilo Clase.funcion(); Ademas, debe ser public


    //tambien se puede sobrecargar un CONSTRUCTOR que es un tipo de funcion especial que permite crear objetos a partir de una clase.




}
