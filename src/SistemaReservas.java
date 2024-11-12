import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase principal del sistema de reservas :)
public class SistemaReservas {
    private List<Habitacion> habitaciones;

    public SistemaReservas() {
        habitaciones = new ArrayList<>();
        // Inicializa algunas habitaciones
        habitaciones.add(new Habitacion("individual", 50.0));
        habitaciones.add(new Habitacion("doble", 75.0));
        habitaciones.add(new Habitacion("suite", 150.0));
    }

    // Muestra los detalles de todas las habitaciones
    public void mostrarHabitaciones() {
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion habitacion = habitaciones.get(i);
            System.out.println("Índice: " + i);
            habitacion.mostrarDetalles();
            System.out.println("\n");
        }
    }

    // Calcula el costo total de la reserva de una habitación específica por un número de noches
    public double calcularCostoTotal(int indice, int noches) throws Exceptiones.HabitacionNoDisponibleException, Exceptiones.NumeroDeNochesInvalidoException {
        Habitacion habitacion = habitaciones.get(indice);
        habitacion.reservar(noches);
        return habitacion.getPrecioPorNoche() * noches;
    }

    // Entrada del programa Main
    public static void main(String[] args) {
        SistemaReservas sistema = new SistemaReservas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bienvenido al Sistema de Reservas del Hotel");
            System.out.println("1. Mostrar habitaciones");
            System.out.println("2. Reservar habitación");
            System.out.println("3. Salir");
            System.out.print("4. Liberar habitacion");
            System.out.print("\nElige una opción: ");
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
                        double total = sistema.calcularCostoTotal(0, 3);
                        System.out.println("Costo total de la reserva: $" + total );
                    } catch (Exceptiones.HabitacionNoDisponibleException |
                             Exceptiones.NumeroDeNochesInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Gracias por usar el Sistema de Reservas del Hotel. ¡Hasta luego!");
                    scanner.close();
                    break;
                case 4:
                    System.out.println("Ingrese la habitacion que desea liberar:");
                    int indice2 = scanner.nextInt();
                    if (indice2 > 2 || indice2 < 0) {
                        System.out.println("La habitacion no existe, intente de nuevo");
            } else{
                System.out.println("Habitacion liberada");
            }
                default:
                    System.out.println("Opción inválida. Por favor, elige nuevamente.");
            }
        }
    }
}
