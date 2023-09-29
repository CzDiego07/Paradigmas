public class Habitacion {
    // Este es el aparatado de encapsulacion
    // Al colocar "Private" estamos encapuslando los atributos que tenemos
    private int numero;
    private double precioPorNoche;
    private int estadia;

    public Habitacion(int numero, double precioPorNoche, int estadia) {
        this.numero = numero;
        this.precioPorNoche = precioPorNoche;
        this.estadia = estadia;
    }

    public int getNumero() {
        return numero;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public int getEstadia() {
        return estadia;
    }

    public void mostrarInformacion() {
        System.out.println("Numero de habitacion: " + numero);
        System.out.println("Precio por noche: $" + precioPorNoche);
        System.out.println("Noches de estadia: " + estadia);
    }

    public void calcularPrecioNoches() {
        System.out.println("Precio total: " + precioPorNoche * estadia);
    }
}
