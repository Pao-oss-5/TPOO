package Sueldo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double sueldoBase=0;
        double bonificacion=0;
        double horasExtras=0;
        System.out.println("Ingresa el Sueldo: ");
        sueldoBase = sc.nextDouble();
        System.out.println("Ingresa la bonificacion: ");
        bonificacion = sc.nextDouble();
        System.out.println("Ingrese las horas extras: ");
        horasExtras = sc.nextDouble();

        Empleados empleadoUno= new Empleados(sueldoBase, bonificacion, horasExtras);
        empleadoUno.Parametro(sueldoBase, bonificacion, horasExtras);



    }
}