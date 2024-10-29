public abstract class envio {

    double costoBase;
    double peso;

    //constructor

    public envio(double costoBase) {
        this.costoBase = costoBase;
    }
    public envio(double peso) {
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
