package COCHE;

public class Main {
    public static void main (String[] args ) {
        Coche CocheUno = new Coche("NISSAN", "fiesta", 2011);
        CocheUno.mostrarInformacion();
        CocheUno.calcularEdadDelCoche();
        Coche CocheDos = new Coche("FERRARI", "once", 1998 );
        CocheDos.mostrarInformacion();
        CocheDos.calcularEdadDelCoche();
        Coche CocheTres = new Coche("BYD", "doce", 2022 );
        CocheTres.mostrarInformacion();
        CocheTres.calcularEdadDelCoche();


    }
}