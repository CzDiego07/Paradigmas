package ExamenPrimerParcial;

public class Main {
    public static void main(String[] args) {
        EmpleadoVendedor empleadoV= new EmpleadoVendedor("Bb", "Juan Perez", "NOSEXDD", 2000.0, 10.0);
        empleadoV.mostrarDatos();
        empleadoV.CalcularIngreso();
        empleadoV.calcularDescuento();
        System.out.println("Sueldo neto es de : ");
        empleadoV.calcularDescuento();
        System.out.println();
        EmpleadoPermanente EmpleadoP = new EmpleadoPermanente("Jesus", "Flores", "ALALALLALA", 20000, 28282);
        EmpleadoP.mostrarDatos();
        EmpleadoP.descuento();
        EmpleadoP.SueldoNeto();
        EmpleadoP.ingresos();

    }
}
