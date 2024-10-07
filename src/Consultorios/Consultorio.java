package Consultorios;
public class Consultorio {
    public String id;
    public int piso;
    public int numeroConsultorio;
//    constructor
    public Consultorio(String id, int piso, int numeroConsultorio) {
        this.id = id;
        this.piso = piso;
        this.numeroConsultorio = numeroConsultorio;
    }
    public String mostrarDatosConsultorio() {
        String datosConsultorio = String.format("Id: %s, Piso: %d, Numero de consultorio: %d",
                id, piso, numeroConsultorio );
        return datosConsultorio;
    }
//    getter
    public String getId() {
        return id;
    }
    public int getPiso() {
        return piso;
    }
    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }
}