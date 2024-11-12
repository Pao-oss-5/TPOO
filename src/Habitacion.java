public class Habitacion {
    private String tipo;
    private double precioPorNoche;
    private boolean disponible;

    public Habitacion(String tipo, double precioPorNoche) {
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true; // Al inicio, todas las habitaciones están disponibles
    }
//getters

    public double getPrecioPorNoche() {
        System.out.println(precioPorNoche);
        return 0;
    }

    public void reservar(int noches) throws Exceptiones.HabitacionNoDisponibleException, Exceptiones.NumeroDeNochesInvalidoException {
        if (!disponible) {
            throw new Exceptiones.HabitacionNoDisponibleException("La habitación no está disponible.");
        }
        if (noches < 1) {
            throw new Exceptiones.NumeroDeNochesInvalidoException("Número de noches inválido.");
        }
        disponible = false;
        System.out.println("Habitación reservada por " + noches + " noches.");
    }

    public void liberar() {
        disponible = true;
        System.out.println("Habitación liberada.");
    }

    public void mostrarDetalles() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Precio por Noche: $" + precioPorNoche);
        System.out.println("Disponible: " + (disponible ? "Sí" : "No"));
    }

    public void toString(int noches) {
        System.out.println("Noches: " + noches);
    }

    public static Habitacion get(int indice) {
        System.out.println("Indice: " + indice);
    }
}

