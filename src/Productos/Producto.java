package Productos;

import java.util.Scanner;
public class Producto {
    Scanner sc=new Scanner(System.in);
    public String nombre;
    public int id;
    public String descripcion;
    public Double precio;
    public  int stock=0;
    public int cantidad;

    public Producto(String nombre, Double precio, String descripcion, int stock, int id){
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.stock=stock;
        this.id=id;
    }

    //SETTERS
    public void setNombre(String nombre){
        while (nombre == null) {
            System.out.println("Error: El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setPrecio(double precio){
        while(precio<0)
        {
            System.out.println("Ingrese una cantidad mayor a 0");
        }
        this.precio=precio;
    }

    public void setStock(int stock){
        this.stock=stock;
        while(stock<0){
            System.out.println("Porfavor ingrese una cantidad mayor a 0");
            cantidad=sc.nextInt();
            this.stock=cantidad;
        }
    }


    //GETTERS
    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }


    public void aumentarStock(){
        System.out.println("***AUMENTAR STOCK DEL PRODUCTO***");
        System.out.println("La cantidad de stock del producto es de:"+getStock());
        System.out.println("Porfavor cambie la cantidad de stock:");
        cantidad=sc.nextInt();
        setStock(cantidad);
        System.out.println("Has cambiado el stock satisfactoriamente");


    }

    public void disminuirStock(){
        System.out.println("***DISMINUIR STOCK DEL PRODUCTO***");
        System.out.println("La cantidad de stock del producto es de: "+getStock());
        System.out.println("Porfavor cambie la cantidad de stock:");
        cantidad=sc.nextInt();
        while(cantidad<0 || cantidad>stock){
            System.out.println("Porfavor ingrese una cantidad mayor a 0 o menor al stock anterior");
            cantidad=sc.nextInt();
        }
        System.out.println("Has cambiado el stock satisfactoriamente");
        setStock(cantidad);
    }

    public void mostrarProducto(){
        System.out.println("\nPRODUCTO");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Precio: $"+getPrecio());
        System.out.println("El stock es de: "+getStock());
    }

}