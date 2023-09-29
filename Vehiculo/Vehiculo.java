public abstract class Vehiculo{
    private int numeroRuedas;
    private String Marca;
    private String Modelo;
    public Vehiculo(String Marca, String Modelo, int numeroRuedas){
        this.Marca = Marca;
        this.Modelo =Modelo;
        this.numeroRuedas = numeroRuedas;
    }
    public void  SetNumRuedas(int numeroRuedas){
        this.numeroRuedas = numeroRuedas;
    }
    public int GetNumRuedas(){
        return numeroRuedas;
    }
    public void  SetMarca(String Marca){
        this.Marca = Marca;
    }
    public String GetMarca(){
        return Marca;
    }
    public void  setModelo(String Modelo){
        this.Modelo = Modelo;
    }
    public String getModelo(){
        return Modelo;
    }
    public void arrancarMoto(){
        System.out.println("Arrancando motocicleta: "+GetMarca() + " Modelo: "+ getModelo()+ "  Numero de ruedas: "+ GetNumRuedas()); 
    }
    public void arrancarAuto(){
        System.out.println("Arrancando automovil:  "+GetMarca() + " Modelo: "+ getModelo()+ "  Numero de ruedas: "+ GetNumRuedas()); 
    }
}