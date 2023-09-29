public class Main {
    public static void main(String[] args) {
        Habitacion habitacion1 = new HIndividual(100, 150.0, 3, true);
        Habitacion habitacion2 = new HDoble(200, 150, 3, 2);
        Habitacion habitacion3 = new Suit(303, 500.0, 2, 2);
        Habitacion habitacion4 = new HFamiliar(10, 200.0, 5, false);

        System.out.println("Informacion de la primera habitacion:");
        habitacion1.mostrarInformacion();
        habitacion1.calcularPrecioNoches();
        System.out.println();

        System.out.println("Informacion de la segunda habitacion:");
        habitacion2.mostrarInformacion();
        habitacion2.calcularPrecioNoches();

        System.out.println("Informacion de la tercera habitacion: ");
        habitacion3.mostrarInformacion();
        habitacion3.calcularPrecioNoches();
        System.out.println();

        System.out.println("Informacion de la tercera habitacion: ");
        habitacion4.mostrarInformacion();
        habitacion4.calcularPrecioNoches();

    }
}
