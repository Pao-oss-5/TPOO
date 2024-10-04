package consultorios;

import java.util.Random;

public class Consultorios {
    public int id;
    public int piso;
    public int numeroConsultorio;
    public Random random = new Random();

    public Consultorios(int piso, int numeroConsultorio) {
        this.id = this.random.nextInt(1, 10001);
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getId() {
        return id;
    }

    public int getPiso() {
        return piso;
    }

    public int getNumeroConsultorios() {
        return numeroConsultorio;
    }

    public String datosConsultorios() {
        return String.format("Id del Consultorio: %d, Piso: %d, Numero del Consultorio: %d",
                id, piso, numeroConsultorio);
    }
}