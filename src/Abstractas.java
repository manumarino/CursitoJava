public class Abstractas {
    //las clases abstractas son clases que no pueden ser instanciadas. esto seria util en el
    // caso de querer tener una clase padre y multiples clases hijas, y que solo se
    // pudiese instanciar a partir de las clases hijas

    //pasa eso definimos una clase con la palabra abstract
    //creo una clase abstracta padre
    public abstract class Animales{
        //atributos

        //constructor
        public Animales(){

        }

    }
    //creo una clase que hereda de Animales
    public class Tigre extends Animales{
        //atributos

        //constructor
        public Tigre(){

        }

    }
    //creo otra clase que hereda de Animales
    public class Leon extends Animales{
        //atributos

        //constructor
        public Leon(){

        }

    }

    public static void main(String[] args) {
        Animales pichu = new Tigre();
        Animales piti = new Leon();
        //se puede seguir usando el polimorfismo.
    }

}
