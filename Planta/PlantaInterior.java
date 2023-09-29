public class PlantaInterior implements Planta {
    private String nombre;
    private String tipo;
    public PlantaInterior(String nombre, String tipo){
        this.nombre=nombre;
        this.tipo = tipo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    @Override
    public String obtenerNombre(){
        return getNombre();
    }
    @Override
    public String obtenerTipo(){
        return getTipo();
    }
    public void regar(){
        System.out.println("Esta regando la planta del interno ");
    }
    public void podar(){
        System.out.println("Esta podando las plantas del interior");
    }
}