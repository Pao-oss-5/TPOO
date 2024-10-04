package Sueldo;

public class Empleados {
    double sueldoBase;
    double bonificacion;
    double horasExtras;

    public Empleados(double sueldoBase, double bonificacion, double horasExtras) {
        this.sueldoBase = sueldoBase;
        this.bonificacion = bonificacion;
        this.horasExtras = horasExtras;
    }

    public void Parametro(double sueldoBase, double bonificacion, double horasExtras) {
        System.out.println("El salario es de: $" + (sueldoBase + bonificacion + (horasExtras * 20)));
    }

    public void Parametro(double sueldoBase, double bonificacion) {
        System.out.println("El salario es de: $" + (sueldoBase + bonificacion));
    }

    public void Parametro(double sueldoBase) {
        System.out.println("El salario es de: $" + sueldoBase);
    }

}