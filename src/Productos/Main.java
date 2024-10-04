package Productos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        String nombre="Well";
        int stock;
        double precio=0;

        System.out.println("Bienvenido al registro de productos");
        Producto producto = new Producto(nombre, precio, descripcion, Idcategoria, stock );
        while (!salir) {
            System.out.println("\nSelecciona una opción:");
            System.out.println("1. Agregar producto y descipcion");
            System.out.println("2. Agregar nombre de producto, descripcion y stock");
            System.out.println("3. Aumentar stock de producto");
            System.out.println("4. Reducir Stock");
            System.out.println("5. Mostrar producto");
            System.out.println("6. Salir del programa");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Haz seleccionado agregar producto, descripcion y stock:");
                    System.out.println("Ingresa el nombre del producto:");
                    nombre=sc.nextLine();
                    producto.setNombre(nombre);

                    System.out.println("Ingresa el precio del producto:");
                    precio=sc.nextDouble();
                    producto.setPrecio(precio);
                    break;
                case 2:
                    System.out.println("Haz seleccionado agregar nombre de producto, descripcion y stock ");
                    System.out.println("Ingresa el nombre del producto:");
                    nombre=sc.nextLine();
                    producto.setNombre(nombre);

                    System.out.println("Ingresa el precio del producto:");
                    precio=sc.nextDouble();
                    producto.setPrecio(precio);

                    System.out.println("Ingrese el stock del producto");
                    stock=sc.nextInt();
                    producto.setStock(stock);
                    sc.nextLine();
                    break;
                case 3:
                    System.out.println("Haz seleccionado Aumentar stock de producto'.");
                    producto.aumentarStock();
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Haz seleccionado disminuir stock de producto");
                    producto.disminuirStock();

                    break;
                case 5:
                    System.out.println("Haz seleccionado Mostrar productos");
                    producto.mostrarProducto();

                    break;
                case 6:
                    System.out.println("Haz abandonado el programa :( ");
                    salir = true;

                    break;
                default:
                    System.out.println("Opción no válida, te pido ingreses una opción valida :)");
                    break;
            }
        }
    }
}