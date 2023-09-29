public class Trabajador{
    protected String nombre;
    protected int edad;
    
    public Trabajador(String Name, int edad){
        this.nombre = Name ;
        this.edad = edad;
    }
    public void setNombre(String Name){
        this.nombre= Name;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    public int getEdad(){
        return this.edad;
    }
    @Override 
    public String toString(){
        return String.format("%-12s|%16d|", 
        this.nombre, this.edad);
    }   
}