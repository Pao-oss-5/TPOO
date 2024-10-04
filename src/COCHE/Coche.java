package COCHE;

public class Coche {

    String marca;
    String modelo;
    int año;
    int actualAño = 2024;

    public Coche(String marca,
                 String modelo,
                 int año ) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " +marca+ " \nModelo: " +modelo+ " \nAño: " +año);
    }
    public void calcularEdadDelCoche(){
        System.out.println("El coche tiene: " +(actualAño - año)+ " años \n" );
    }
}