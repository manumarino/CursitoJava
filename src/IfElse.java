//ESTRUCTURAS DE CONTROL CONDICIONAL CON SINTAXIS IF ELSE

public class IfElse {
    public static void main(String[] args) {
        
        boolean check = 5 < 10;

        int number1 = 50;
        int number2 = 10;

        if (check && number1 < number2){
            System.out.println("verdadero");

        }
        System.out.println("Bye");

    }

    //existen palabras reservadas CONTINUE y BRAKE que suelen usarse para los ciclos while o if.
    //CONTINUE se usa para continuar dentro de un ciclo, mientras que BREAK se usa para cortar el ciclo.
    //por ejemplo continue hace que se puedan saltar partes de un codigo y no evaluar ciertos casos.
    //en cambio break rompe el ciclo y no seguir iterando.
    public static void main(String[] args) {
        for (int i=0; i<=10 ; i++){

            if (i==6){
                continue;
            }
            System.out.println(i);
            //el ciclo de iteracion se saltea el numero 6.

        }
    }

    
}
