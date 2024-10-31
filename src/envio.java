public abstract class envio {
        double costoBase;
        double peso;

        public envio(double costoBase, double peso) {
            this.costoBase = costoBase;
            this.peso = peso;
        }

        public abstract void calcularTiempoYCostoEntrega();

        public void validarPeso(double peso) {
            if (peso < 0){
                System.out.println("Peso invalido");
            } else {
                System.out.println("Peso: " + peso);
            }
        }
    }