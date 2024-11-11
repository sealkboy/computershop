public class Main {
    public static void main(String[] args) {

        Tienda tienda = new Tienda("PC World", "Carlos Pérez", "12345678-X");

        tienda.agregarComputador(new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0));
        tienda.agregarComputador(new Computador("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0));


        tienda.listarComputadores();

        Computador computadorBuscado = tienda.buscarComputador("Dell");
        if (computadorBuscado != null) {
            System.out.println("Computador encontrado: " + computadorBuscado);
        } else {
            System.out.println("No se encontró el computador.");
        }

        tienda.eliminarComputador("HP");

        tienda.listarComputadores();
    }
}
