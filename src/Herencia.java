public class Herencia extends Coche{ //la palabra extends nos permite heredar de otra clase
    //Herencia nos permite usar codigo entre clases. USAMOS UNA CLASE BASE O SUPERCLASE QUE NOS PROPORCIONA
    // UN CODIGO QUE CON CLASES HIJAS PODEMOS HEREDAR, JUNTO CON SUS ATRIBUTOS Y COMPORTAMIENTOS.
    // podemos usar una clase detro de clases hijas
    //usamos la clase Coche que habiamos creado. supongamos que hay distintos coches

    String motorElectrico;
    //utilizando el concepto de sobrecarga de funciones podemos tener multiples constructores

    public Herencia(){
        //constructor vacio
    }
    public Herencia(String motorElectrico){ //constructor que tome parametros
        this.motorElectrico=motorElectrico;
    }

    @Override
    public String toString() {
        return "Herencia{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }
}
