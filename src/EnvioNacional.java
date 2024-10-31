public class EnvioNacional extends envio {
    int distancia;

    public EnvioNacional(double costoBase, double peso, int distancia) {
        super(costoBase, peso);
        this.distancia = distancia;
    }

    @Override
    public void calcularTiempoYCostoEntrega() {
        int dias = 1;
        for (int i = 1; i < distancia; i++) {
            distancia = distancia - 200;
            dias++;
        }

        if (peso > 5){
            double costoAdicional = costoBase * 0.05;
            System.out.println("***** ENVIO NACIONAL *****");
            System.out.println("El tiempo de entrega aproximado es de: " + dias);
            System.out.println("El costo base de entrega es: " + costoBase);
            System.out.println("El costo total es: " + (costoBase + costoAdicional));
            System.out.println("El peso a entregar es: " + peso);
        } else {
            System.out.println("***** ENVIO NACIONAL *****");
            System.out.println("El tiempo de entrega aproximado es de: " + dias + " dias");
            System.out.println("El costo base de entrega es" + costoBase);
            System.out.println("El peso a entregar es: " + peso);
        }
    }

    public int getDistancia() {
        return distancia;
    }
}