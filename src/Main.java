public class Main {
    public static void main(String[] args) {
        envio EnvioNacional = new EnvioNacional(800,5,850);
        EnvioNacional.validarPeso(EnvioNacional.peso);
        EnvioNacional.calcularTiempoYCostoEntrega();

        System.out.println("\n ");

        envio EnvioInternacional = new EnvioInternacional(1350,10,"CHINA");
        EnvioInternacional.validarPeso(EnvioInternacional.peso);
        EnvioInternacional.calcularTiempoYCostoEntrega();
    }
}