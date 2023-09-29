// Clase dereivada: Suit
// Aqui aplicamos herencia
// La clase HabitacionIndividual se hereda de la clase Habitacion
// Podemos usar herencia usando la sentencia "extends"
class Suit extends Habitacion {
    // Aqui aplicamos polimorfismo
    // Agregamos un atributo unico
    // Es una forma diferente de ver el objeto
    private int numeroDeJacuzzis;

    public Suit(int numero, double precioPorNoche, int estadia, int numeroDeJacuzzis) {
        super(numero, precioPorNoche, estadia);
        this.numeroDeJacuzzis = numeroDeJacuzzis;
    }

    public int getNumeroDeJacuzzis() {
        return numeroDeJacuzzis;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de jacuzzis: " + numeroDeJacuzzis);
    }

    @Override
    public void calcularPrecioNoches() {
        super.calcularPrecioNoches();
    }
}
