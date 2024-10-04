package Rectangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa los datos del rectangulo ");

        System.out.println("Ingresa el ancho del rectangulo: ");
        double ancho = sc.nextDouble();


        System.out.println("Ingresa el largo del rectangulo: ");
        double largo = sc.nextDouble();


        System.out.println("\nRectanguloUno \n");
        Rectangulo rectanguloUno = new Rectangulo(largo, ancho);

        rectanguloUno.calcularPerimetro(largo, ancho);
        rectanguloUno.calcularArea(largo, ancho);
        rectanguloUno.calcularPerimetro((int)largo, (int)ancho);
        rectanguloUno.calcularArea((int)largo, (int)ancho);

    }
}