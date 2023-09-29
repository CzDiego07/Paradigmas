// Clase derivada: HabitacionDoble
// Podemos usar herencia usando la sentencia "extends"
class HDoble extends Habitacion {
    // Aqui aplicamos polimorfismo
    // Agregamos un atributo unico
    // Es una forma diferente de ver el objeto
    private int numeroDeCamas;

    public HDoble(int numero, double precioPorNoche, int estadia, int numeroDeCamas) {
        // Aqui aplicamos herencia
        // La clase HabitacionIndividual se hereda de la clase Habitacion
        super(numero, precioPorNoche, estadia);
        this.numeroDeCamas = numeroDeCamas;
    }

    public int getNumeroDeCamas() {
        return numeroDeCamas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Numero de camas: " + numeroDeCamas);
    }

    @Override
    public void calcularPrecioNoches() {
        super.calcularPrecioNoches();
    }
}
