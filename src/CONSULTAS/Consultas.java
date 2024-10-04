package CONSULTAS;

import CONSULTORIOS.Consultorio;
import MEDICOS.Medicos;
import PACIENTES.Paciente;

public class Consulta {
    public int id;
    public String fechaHora;
    public Paciente paciente;
    public Medicos medico;
    public Consultorio consultorio;


    //    constructor
    public Consulta(int id, String fechaHora, Paciente paciente, Medicos medico, Consultorio consultorio) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.paciente = paciente;
        this.medico = medico;
        this.consultorio = consultorio;
    }
//    getter

    public int getId() {
        return id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public Consultorio getConsultorio() {
        return consultorio;
    }
}