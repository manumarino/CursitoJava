public class PolimorfismoMain {
    public static void main(String[] args) {


        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();


        //el concepto de POLIMORFISMO se usa para tratar a todas las clases de la misma forma, en un nivel de abstraccion general
        //trataando a todos como coche a secas

        Coche coche4 = new CocheElectrico();
        if (coche4 instanceof Coche){
            System.out.println("coche");
        }

        if (coche4 instanceof CocheElectrico){
            System.out.println("coche electrico");
        }
        // 'instanceof' solo sirve para comprobar si un objeto fue instanciado por una determinada clase
        //LOS DOS IF VAN A DAR TRUE pues coche4 hereda de las dos. eso es polimorfismo
        //si no usaramos polimorfismo, estariamos solo trabajando con la clase concreta, la clase hija o la clase derivada
        //cuando utilizamos polimorfismo utilizamos tambien la estructura padre, para poder tratarlos a todos por igual.
        //esto es importante porque por ejemplo si quisieramos TRABAJAR CON VARIOS TIPOS DE COCHES TODOS EN UN MISMO ARRAY,
        // COMO HAY QUE ESPECIFICAR EL TIPO DE DATO, NO PODRIAMOS TRABAJAR CON TODOS A LA VEZ SI NO PUDIERAMOS TRATARLOS A TODOS POR IGUAL COMO coche
    }
}
