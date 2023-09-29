package ExamenPrimerParcial;

public class EmpleadoPermanente extends Empleado {
    double Sueldobase;
    int numSeguroSocial;
    public EmpleadoPermanente(String Nombre, String Apellidos, String RFC, double sueldoBase,int NumSeguro){
        super(Nombre,Apellidos,RFC);
        this.Sueldobase = sueldoBase;
        this.numSeguroSocial = NumSeguro;
    }
    public double getSueldobase() {
        return Sueldobase;
    }
    public int getNumSeguroSocial() {
        return numSeguroSocial;
    }
    public void setSueldobase(double sueldobase) {
        this.Sueldobase = sueldobase;
    }
    public void setNumSeguroSocial(int numSeguroSocial) {
        this.numSeguroSocial = numSeguroSocial;
    }
    public void ingresos(){
        getSueldobase();
    }
    public double descuento(){
        double descuento= getSueldobase()*11/100;
        return descuento;
    }
    public double SueldoNeto(){
        return getSueldobase()-descuento();
    }
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Sueldo base: "+ getSueldobase() + "\nNumero de seguro social: "+getNumSeguroSocial());
    }
}

