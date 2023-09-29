// Clase dereivada: HabitacionFamiliar
// Aqui aplicamos herencia
// La clase HabitacionIndividual se hereda de la clase Habitacion
// Podemos usar herencia usando la sentencia "extends"
class HFamiliar extends Habitacion {
    // Aqui aplicamos polimorfismo
    // Agregamos un atributo unico
    // Es una forma diferente de ver el objeto
    private boolean conServicioALaHabitacion;

    public HFamiliar(int numero, double precioPorNoche, int estadia, boolean conServicioALaHabitacion) {
        super(numero, precioPorNoche, estadia);
        this.conServicioALaHabitacion = conServicioALaHabitacion;
    }

    public boolean conServicioALaHabitacion() {
        return conServicioALaHabitacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Cuenta con servicio a la habitacion: " + (conServicioALaHabitacion ? "Si" : "No"));
    }

    @Override
    public void calcularPrecioNoches() {
        super.calcularPrecioNoches();
    }
}
