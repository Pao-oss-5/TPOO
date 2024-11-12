public class Exceptiones extends Exception {

  public Exceptiones(String message) {
    super(message);
  }

  public static class HabitacionNoDisponibleException extends Exception {
    public HabitacionNoDisponibleException(String message) {
      super(message);
    }
  }
  public static class NumeroDeNochesInvalidoException extends Exception {
    public NumeroDeNochesInvalidoException(String message) {
      super(message);
    }
  }
}
