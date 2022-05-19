public class CocheElectrico extends Coche{
    //este hereda de la clase coche. usando la palabra 'extends'
    String motorElectrico;

    public CocheElectrico(){

    } //constructor vacio

    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }
//EL METODO SUPER NOS PERMITE REUTILIZAR CODIGO DESDE UNA CLASE HIJA HACIA UNA CLASE BASE
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        //hacemos sobrecarga del metodo constructor para no duplicar codigo
        super(color, fabricante, modelo, peso, largo); //con esto ya tenemos invocado el constructor de la clase superior
        //asi usariamos el constructor de la clase superior para asignar los parametros
        this.motorElectrico = motorElectrico; //asignamos el parametro restante, ya que en el constructor padre no existe

    }





//generamos un metodo toString(), que tiene todos los atributos de Coche, pero sumando el nuevo creado en CocheElectrico
    @Override
    public String toString() {
        return "CocheElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                ", motorElectrico='" + motorElectrico + '\'' +
                '}';
    }


    //SOBREESCRITURA
    //sobreescribimos el metodo de la clase padre

//la notacion @Override de Java es una notacion que permite aportar metadatos a los metodos o clases.
// le dice al compilador que compruebe si efectivamente existe un metodo acelerar en la clase superior
// para verificar que realmente se esta sobreescribiendo y no de error
    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2; //calculo ficticio que modifica el codigo del metodo original
        super.acelerar(cantidad); //usamos 'super' para acceder al metodo de la clase superior.
    }
}
