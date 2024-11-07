class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) throws ProductoInvalidoException, PrecioInvalidoException, CantidadInvalidaException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ProductoInvalidoException("El nombre del producto no puede estar vacío o ser nulo.");
        }
        if (precio <= 0) {
            throw new PrecioInvalidoException("El precio del producto debe ser mayor que cero.");
        }
        if (cantidad < 0) {
            throw new CantidadInvalidaException("La cantidad del producto no puede ser negativa.");
        }
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double calcularValorTotal() {
        return this.cantidad * this.precio;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre del producto: " + this.nombre);
        System.out.println("Precio del producto: $" + this.precio);
        System.out.println("Cantidad del producto: " + this.cantidad);
        System.out.println("Valor Total del producto: $" + this.cantidad * this.precio);

                calcularValorTotal();
    }
}
