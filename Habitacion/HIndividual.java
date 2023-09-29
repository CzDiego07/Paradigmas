// Clase dereivada: HabitacionIndividual
// Podemos usar herencia usando la sentencia "extends"
class HIndividual extends Habitacion {
    // Aqui aplicamos polimorfismo
    // Agregamos un atributo unico
    // Es una forma diferente de ver el objeto
    private boolean tieneVistaAlMar;

    public HIndividual(int numero, double precioPorNoche, int estadia, boolean tieneVistaAlMar) {
        // En este codigo aplicamos herencia
        // La clase HabitacionIndividual se hereda de la clase Habitacion
        super(numero, precioPorNoche, estadia);
        this.tieneVistaAlMar = tieneVistaAlMar;
    }

    public boolean tieneVistaAlMar() {
        return tieneVistaAlMar;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene vista al mar: " + (tieneVistaAlMar ? "Si" : "No"));
    }

    @Override
    public void calcularPrecioNoches() {
        super.calcularPrecioNoches();
    }
}
