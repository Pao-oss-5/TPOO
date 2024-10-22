package Menu.MenuAdmin;

import java.time.LocalDate;
import java.util.Scanner;
import ArrayList<String>;
public class MenuAdmin {

import Consultas.consulta;
import Consultorios.consultorio;
import Hospital.hospital;
import Usuarios.administrador.Administrador;
import Usuarios.medicos.Medico;
import Usuarios.pacientes.Paciente;
import Usuarios.utils.Rol;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

    public class MenuAdministrador {
        Scanner scanner = new Scanner(System.in);

        public int mostrarMenu() {

            System.out.println("\n*** BIEVENIDO ***");
            System.out.println("1. Registrar paciente");
            System.out.println("2. Registrar medico");
            System.out.println("3. Registrar consultorio");
            System.out.println("4. Registrar consulta ");
            System.out.println("5. Mostar pacientes ");
            System.out.println("6. Mostar medicos");
            System.out.println("7. Mostrar consultorios ");
            System.out.println("8. Mostrar consultas");
            System.out.println("9. Buscar paciente por ID");
            System.out.println("10. Buscar medico por ID");
            System.out.println("11. Buscar consultorio por ID");
            System.out.println("12. Consultar mi información");
            System.out.println("13. Salir ");
            int opcion = scanner.nextInt();
            return opcion; }


        public void procesarDatosMenu(int opcion,Hospital hospital, Administardor administrador) {
            switch (opcion) {

                case 1:
                    // ID que inicie con P - año actual - mes actual - listaPacientes+1 - random 1/100000
                    String idPaciente = hospital.generarIdPaciente();

                    ArrayList<String> datosPaciente = this.obtenerDatosComun(Rol.PACIENTE);
                    String nombrePaciente = datosPaciente.get(0);
                    String apellidoPaciente = datosPaciente.get(1);
                    LocalDate fechaNacimientoPaciente = LocalDate.parse(datosPaciente.get(2));
                    String numeroTelefonoPaciente = datosPaciente.get(3);
                    String contraseniaPaciente = datosPaciente.get(4);


                    System.out.println("Ingresa el tipo de sangre del paciente: ");
                    String tipoSangre = scanner.nextLine();

                    System.out.println("Ingrese el sexo del paciente: ");
                    String sexoStringPaciente = scanner.nextLine();
                    char sexoPaciente = sexoStringPaciente.charAt(0);
                    scanner.nextLine();



                    System.out.println("Ingresa el numero de telefono del paciente: ");
                    String telefono = scanner.nextLine();

                    scanner.nextLine();

                    /*if(!hospital.validarNumeroPaciente(telefono)) {
                        System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                        return;}*/

                    System.out.println("Ingresa la contraseña del paciente: ");
                    String contraseñaP = scanner.nextLine();

                    scanner.nextLine();

                    Paciente paciente = new Paciente(id, nombre, apellidos, fechaDeNacimientoPaciente, telefono, contraseñaP, Rol.PACIENTE, tipoDeSangre, sexo);
                    hospital.registrarPaciente(paciente);

                    System.out.println("\nPaciente registrado correctamente ");
                    break;

                case 2:

                    System.out.println("\nSeleccionaste la opción para registrar un medico");


                    System.out.println("Ingresa el nombre del medico: ");
                    String nombreMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa los apellidos del medico: ");
                    String apellidosMedico = scanner.nextLine();

                    scanner.nextLine();

                    System.out.println("Ingresa el año de nacimiento: ");
                    int añoMedico = scanner.nextInt();

                    System.out.println("Ingresa el mes de nacimiento:");
                    int mesMedico = scanner.nextInt();

                    System.out.println("Ingresa el dia de nacimiento: ");
                    int diaMedico = scanner.nextInt();

                    LocalDate fechaDeNacimientoMedico = LocalDate.of(añoMedico, mesMedico, diaMedico);

                    scanner.nextLine();

                    System.out.println("Ingresa el telefono del medico: ");
                    String telefonoMedico = scanner.nextLine();

                    /*if(!hospital.validarNumeroPaciente(telefonoMedico)) {
                        System.out.println("\n Este numero de telefono ya fue registrado, por favor ingrese una válido:");
                        return;}*/

                    scanner.nextLine();

                    System.out.println("Ingresa el RFC del medico: ");
                    String rfc = scanner.nextLine();

                    System.out.println("Ingresa la contraseña del medico: ");
                    String contraseñaM = scanner.nextLine();

                    /*if(!hospital.validarRfc(rfc)) {
                        System.out.println("\n Este RFC ya fue registrado, por favor ingrese uno válido:");
                        return;}*/

                    scanner.nextLine();
                    id="1";
                    Medico medicoT = new Medico(id, nombreMedico, apellidosMedico, fechaDeNacimientoMedico, telefonoMedico, contraseñaM,Rol.MEDICO, rfc);


                    Medico medico = new Medico(hospital.generarIdMedico(medicoT), nombreMedico, apellidosMedico, fechaDeNacimientoMedico, telefonoMedico, contraseñaM,Rol.MEDICO, rfc);
                    hospital.registrarMedico(medico);

                    break;


                case 3:

                    System.out.println("\nSeleccionaste la opción para registrar un consultorio ");

                    System.out.println("Ingrese el piso en el que se encuentra el consultorio: ");
                    int piso = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Ingrese el número del consultorio: ");
                    int numeroConsultorio = scanner.nextInt();

                    Consultorio consultorio = new Consultorio(hospital.generarIdConsultorio(), numeroConsultorio, piso);
                    hospital.registrarConsultorio(consultorio);

                    break;

                case 4:

                    System.out.println("\nSeleccionaste la opción para registrar una consulta ");
                    String idConsulta = hospital.generarIdConsulta();

                    System.out.println("Ingresa el dia deseado para consulta:");
                    int diaConsulta = scanner.nextInt();

                    scanner.nextLine();
                    System.out.println("Ingresa el mes deseado para consulta: ");
                    int mesConsulta = scanner.nextInt();

                    System.out.println("Ingresa el año de la consulta: ");
                    int añoConsulta = scanner.nextInt();

                    System.out.println("Ingresa la hora de la consulta: ");
                    int horaConsulta = scanner.nextInt();

                    System.out.println("Ingresa los minutos de la consulta: ");
                    int minutoConsulta = scanner.nextInt();

                    Paciente pacienteConsulta = null;

                    while (pacienteConsulta == null) {
                        System.out.println("Ingresa el id del paciente: ");
                        String idPaciente = scanner.nextLine();
                        pacienteConsulta = hospital.obtenerPacientePorId(idPaciente);

                        if(pacienteConsulta == null) {
                            System.out.println("\n Ingresa un ID válido:");
                        }
                    }

                    Medico medicoConsulta = null;
                    while (medicoConsulta == null) {
                        System.out.println("Ingresa el id del medico: ");
                        String idMedico = scanner.nextLine();
                        medicoConsulta= hospital.obtenerMedicoPorId(idMedico);}

                    Consultorio consultorioConsulta = null;
                    while (consultorioConsulta == null) {
                        System.out.println("Ingrese el id del consultorio:");
                        int consultorioId = scanner.nextInt();
                        consultorioConsulta = hospital.obtenerConsultorioPorId(consultorioId);}

                    LocalDateTime fechaConsulta = LocalDateTime.of(añoConsulta, mesConsulta, diaConsulta, horaConsulta, minutoConsulta);
                    if(!hospital.validarFechaConsulta(fechaConsulta)) {
                        System.out.println("\n La fecha no puede estar en el pasado, ingrese una fehca correcta:");
                    } ////7

                    Consulta consulta = new Consulta(fechaConsulta, pacienteConsulta, medicoConsulta, consultorioConsulta);

                    hospital.registrarConsulta(consulta);

                    System.out.println("Consultorio registrado correctamente ");
                    break;

                case 5:

                    System.out.println("Estos son los usuarios.pacientes registrados actualmente: ");
                    hospital.mostrarPacientes();
                    break;

                case 6:

                    System.out.println("\n Estos son los usuarios.medicos registrados actualmente: ");
                    hospital.mostrarMedicos();
                    break;

                case 7:

                    System.out.println("Estos son los consultorio actuales: ");
                    hospital.mostrarConsultorios();
                    break;

                case 8:

                    System.out.println("Estas son las consultas registradas: ");
                    hospital.mostrarConsultas();
                    break;

                case 9:
                    System.out.println("Buscar paciente por ID ");
                    System.out.println("Ingresa el id del paciente: ");
                    String pacienteId = scanner.nextLine();
                    hospital.mostrarPacientePorId(pacienteId);
                    break;

                case 10:
                    System.out.println("Buscar medico \n Ingresa el id del medico: ");
                    String medicoId = scanner.nextLine();
                    hospital.mostrarMedicoPorId(medicoId);
                    break;

                case 11:
                    System.out.println("Buscar consultorio \n Ingresa el id del consultorio: ");
                    String consultorioId = scanner.nextLine();
                    hospital.mostrarConsultorioPorId(consultorioId);
                    break;

                case 12:
                    hospital.mostrarAdminPorId(administrador.getId());
                    break;
                case 13:
                    System.out.println("Hasta luego ");
                    break;

            } return opcion;
        }

        private ArrayList<String> obtenerDatosComun (Rol rol){
            String tipoUsuario = rol == Rol.PACIENTE ? "paciente" : rol == Rol.MEDICO ? "medico" : "administrador";
            ArrayList<String> datosEnComun = new ArrayLidt<>();

            System.out.println(String.format("Ingresa el nombre del %s", tipoUsuario));
            String nombre = scanner.nextLine();
            datosEnComun.add(nombre);

            System.out.println(String.format("Ingresa el apellido del %s", tipoUsuario));
            String apellido = scanner.nextLine();
            datosEnComun.add(apellido);


            System.out.println("Ingresa el año de nacimiento del s%: ");
            int año = scanner.nextInt();

            System.out.println("Ingresa el mes de nacimiento del s%:");
            int mes = scanner.nextInt();

            System.out.println("Ingresa el dia de nacimiento del s%: ");
            int dia = scanner.nextInt();




        }

    }
}
