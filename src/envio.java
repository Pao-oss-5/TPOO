public abstract class Envio {

    double costoBase;
    double peso;

    //constructor

    public Envio(double costoBase)
    {
        this.costoBase = costoBase;
    }
    public Envio(double peso) {

        this.peso = peso;
    }
    //getters
    public double getCostoBase() {

        return costoBase;
    }
    public double getPeso() {

        return peso;
    }

    //setters
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setCosto(double costo) {

    }
}
