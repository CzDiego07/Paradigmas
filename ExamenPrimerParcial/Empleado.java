package ExamenPrimerParcial;

public abstract class Empleado {
    private String RFC;
    private String apellidos;
    private String nombres;
    public Empleado(String nombre ,String apellidos ,String RFC ){
        this.RFC= RFC;
        this.apellidos =apellidos;
        this.nombres=nombre;
    }
    public void setRFC(String RFC){
        this.RFC = RFC;
    }
    public String getRFC(){
        return RFC;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public String getApellidos(){
        return apellidos;
    }
    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    public String getNombres(){
        return nombres;
    }
    public  void mostrarDatos(){
        System.out.println("Los datos son: "+"\nNombres: "+getNombres()+"\nApellidos: "+getApellidos()+"\nRFC: "+getRFC());

    }
    public void actualizarDatos(){
        
    }
}
