class ProductoInvalidoException extends Exception { 
    public ProductoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
class PrecioInvalidoException extends Exception { 
    public PrecioInvalidoException(String mensaje) {
        super(mensaje);
    } 
} class CantidadInvalidaException extends Exception {
    public CantidadInvalidaException(String mensaje) {
        super(mensaje);
    }
}