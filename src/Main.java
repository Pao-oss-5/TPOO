import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public class SistemaReservas {
        private List<Habitacion> habitaciones;

        public SistemaReservas() {
            habitaciones = new ArrayList<>();
            // Inicializa algunas habitaciones
            habitaciones.add(new Habitacion("individual", 50.0));
            habitaciones.add(new Habitacion("doble", 75.0));
            habitaciones.add(new Habitacion("suite", 150.0));
        }

        public void mostrarHabitaciones() {
            for (int i = 0; i < habitaciones.size(); i++) {
                Habitacion habitacion = habitaciones.get(i);
                System.out.println("Índice: " + i);
                habitacion.mostrarDetalles();
                System.out.println("----------------------");
            }
        }

        public double calcularCostoTotal(int indice, int noches) {
            System.out.println("El costo total es: " + indice * noches);
        }
    }

    public double calcularCostoTotal(int indice, int noches) throws Exceptiones.HabitacionNoDisponibleException, Exceptiones.NumeroDeNochesInvalidoException {
        Habitacion habitacion;
        habitacion = Habitacion.get(indice);
        habitacion.reservar(noches);
        return habitacion.getPrecioPorNoche() * noches;
    }

    public void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bienvenido al Sistema de Reservas del Hotel");
            System.out.println("1. Mostrar habitaciones");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    sistema.mostrarHabitaciones();
                    break;
                case 2:
                    sistema.mostrarHabitaciones();
                    System.out.print("Elige el índice de la habitación a reservar: ");
                    int indice = scanner.nextInt();
                    System.out.print("Número de noches: ");
                    int noches = scanner.nextInt();
                    try {
                        double total = sistema.calcularCostoTotal(indice,
                                noches);
                        System.out.println("Costo total de la reserva: $" + total);
                    } catch (Exceptiones.HabitacionNoDisponibleException |
                             Exceptiones.NumeroDeNochesInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar el Sistema de Reservas del Hotel. ¡Hasta pronto!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, elige nuevamente.");
            }
        }
    }
}
