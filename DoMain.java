public class DoMain {
    public static void main(String[] args) {
        Auto miAuto = new Auto();
        miAuto.marca = "Toyota";
        miAuto.modelo = "Corolla";
        miAuto.anio = 2020;
        miAuto.numeroDePuertas = 4;

        miAuto.acelerar();      // Método heredado de la clase Vehiculo
        miAuto.abrirPuertas();  // Método propio de la clase Auto
    }
}