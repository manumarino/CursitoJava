public abstract class Coche {
//LAS CLASES SON COMO MOLDES QUE NOS PERMITEN CREAR OBJETOS
    //atributos
    //caracteristicas que tiene un objeto, o un coche
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;
    

    //constructores
    //metodos especiales que nos permiten crear objetos de esta clase. si no ponemos nada habra por defecto un constructor vacio.
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color; //el metodo constructor tiene nombre especial, con mayuscula, y el mismo nombre de la clase
        //con 'this' asignamos valores a los parametros, que se envian desde fuera de la clase y asignamos al interior de
        //la clase, a LOS OBJETOS QUE SE CREAN A PARTIR DE LA CLASE
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }
//comportamiento
    public void acelerar(Integer cantidad){
       // if(//para restringir que la velocidad no sea negativa y no supere 120){

        this.velocidad += cantidad;
        String si = "woow sisi";
    }



    public Coche(){

    }
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo); //podemos invocar a un constructor de la clase superior
        this.motorElectrico = motorElectrico; //no se hace en el metodo super porque no lo tiene la clase base

    }


    //TAMBIEN SE SUELE GENERAR UN METODO toString() PARA IMPRIMIR TOFO LO QUE ESTAMOS GENERANDO
    //click derecho, Generate, toString(). crea un system.println que imprime el valor de todas las propiedades.
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }

    //comportamiento
    public void acelerar(Integer cantidad){
        if (cantidad > 0 && cantidad <= 120){ //restringimos la velocidad del auto
            this.velocidad += cantidad;
        }
        //cuando alguien usa este metodo se puede modificar la velocidad del auto
        // con click derecho podemos 'Generate', 'toString' y generar el metodo to string que imprime texto con el valor de todas las propiedades.


    }
}
