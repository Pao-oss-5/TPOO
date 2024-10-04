package Rectangulo;

import java.util.Scanner;
public class Rectangulo {
    double largo;
    double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public void calcularArea(double largo, double ancho) {
        double area = (largo * ancho);
        System.out.println("El area del rectangulo es: " + area);
    }

    public void calcularPerimetro(double largo, double ancho) {
        double perimetro = (largo * 2 + ancho * 2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
    public void calcularArea(int largo, int ancho) {

        int area = (largo*ancho);
        System.out.println("El area del rectangulo es: "+area);
    }
    public void calcularPerimetro(int largo, int ancho) {
        int perimetro = (largo*2 + ancho*2);
        System.out.println("El perimetro es: " + perimetro);
    }
}