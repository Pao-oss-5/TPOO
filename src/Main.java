public class Main {
    public static void main(String[] args) {
        System.out.println("***** BIENVENIDO A SEGUROS *****");
        System.out.println("\nSEGURO AUTOS");
        SeguroAuto seguroAuto1 = new SeguroAuto("Paola Garcia", 1650.00, 26);
        seguroAuto1.calcularPrima();
        seguroAuto1.detallesSeguro();

        SeguroAuto seguroAuto2 = new SeguroAuto("Andres Salamanca", 10000.00, 29);
        seguroAuto2.calcularPrima();
        seguroAuto2.detallesSeguro();

        System.out.println("\nSEGURO HOGAR");
        SeguroHogar seguroHogar1 = new SeguroHogar("Amy Rodriguez", 3620.00, 48, true);
        seguroHogar1.calcularPrima();
        seguroHogar1.detallesSeguro();

        SeguroHogar seguroHogar2 = new SeguroHogar("Camila Hernandez", 5550.00, 46, false);
        seguroHogar2.calcularPrima();
        seguroHogar2.detallesSeguro();

        System.out.println("\nSEGURO VIDA");
        SeguroVida seguroVida1 = new SeguroVida("Eliseo Perez", 1960.00, 26);
        seguroVida1.calcularPrima();
        seguroVida1.detallesSeguro();

        SeguroVida seguroVida2 = new SeguroVida("Daniela Montufar", 10000090.00, 65);
        seguroVida2.calcularPrima();
        seguroVida2.detallesSeguro();

    }
}