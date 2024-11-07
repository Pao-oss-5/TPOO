import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();
            System.out.print("Ingrese el precio del producto: ");
            double precio = scanner.nextDouble();
            System.out.print("Ingrese la cantidad del producto: ");
            int cantidad = scanner.nextInt();
            Producto producto = new Producto(nombre, precio, cantidad);
            producto.mostrarDetalles();
        } catch(ProductoInvalidoException | PrecioInvalidoException | CantidadInvalidaException e) {
            System.err.println("Error: " + e );
            System.err.println("Ocurrió un error inesperado: " + e );
        }
    }
}