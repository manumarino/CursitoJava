public class Switch {
    public static void main(String[] args) {

        String weather = "Sunny";
        //switch se usa cuando tenemos multiples condiciones de casos conocidos, pero que no sean demasiados.
        switch (weather){

            case "Sunny":
                System.out.println("El tiempo esta soleado");
                break; //si no incluimos el break, sigue corriendo los demas casos porque no hemos roto el ciclo de ejecucion.
            case "Cloudy":
                System.out.println("Esta nublado");
                break;
            default: //si por lo que sea no se encuentra ninguno de los casos, se entraria aca
                System.out.println("No se pudo identificar el tiempo");
                break;

        }
    }
}
