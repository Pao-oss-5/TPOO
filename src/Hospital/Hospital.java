package Hospital;

import Consultas.Consultas;
import consultorios.Consultorios;
import Medicos.Medicos;
import Paciente.Pacientes;

import java.util.ArrayList;

public class Hospital {
    public ArrayList<Pacientes> listaPacientes = new ArrayList<>();

    public ArrayList<Medicos> listaMedicos = new ArrayList<>();

    public ArrayList<Consultas> listaConsultas = new ArrayList<>();
    public ArrayList<Consultorios> listaConsultorios = new ArrayList<>();

    public void registrarPaaciente(Pacientes paciente) {
        this.listaPacientes.add(paciente);
    }

    public void registrarMedico(Medicos medico) {
        this.listaMedicos.add(medico);
    }

    public void registrarConsulta(Consultas consulta) {
        //  Consulta consultas= new Consultas(1, "2024-08-10", pac1, med1, cons1);
        //No exista una consulta en la fecha y consultorio deseado
        if(!validarDisponibilidadEnFechaConsulta(consulta.getFechaHora(), consulta.getConsultorioNumero().getNumeroConsultorios())){
            System.out.println("Ya existe una consuta registrada para esa fecha");
            return;
        }


        this.listaConsultas.add(consulta);
    }

    public void registrarConsultorios(Consultorios consultorio) {
        this.listaConsultorios.add(consultorio);
    }

    private boolean validarDisponibilidadEnFechaConsulta(String fechaDeseada, int numeroConsultorio){
        for (Consultas consulta : listaConsultas) {
            if(consulta.getFechaHora().equals(fechaDeseada) && numeroConsultorio == consulta.getConsultorioNumero().getNumeroConsultorios()){
                return false;
            }
        }
        return true;
    }
}