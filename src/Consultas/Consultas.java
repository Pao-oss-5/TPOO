package Consultas;

import consultorios.Consultorios;
import Medicos.Medicos;
import Paciente.Pacientes;

import java.util.Random;

public class Consultas {
    public int id;
    public String fechaHora;
    public Pacientes pacienteNombre;
    public Medicos medicoNombre;
    public Consultorios consultorioNumero;
    public Random random = new Random();

    public Consultas(String fechaHora, Pacientes paciente, Medicos medico, Consultorios consultorio) {
        this.id = this.random.nextInt(1, 10001);
        this.fechaHora = fechaHora;
        this.pacienteNombre = paciente;
        this.medicoNombre = medico;
        this.consultorioNumero = consultorio;
    }

    public int getId() {
        return id;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public Pacientes getPacienteNombre() {
        return pacienteNombre;
    }

    public Medicos getMedicoNombre() {
        return medicoNombre;
    }

    public Consultorios getConsultorioNumero() {
        return consultorioNumero;
    }
}