public class Gerente extends Trabajador{
    private double sueldoGerente;

    public Gerente(String Name, int año,Double sueldoGerente){
        super(Name, año);
        this.sueldoGerente = sueldoGerente;
    }
    public void setSueldo(Double sueldo){
        this.sueldoGerente= sueldo;
    }
    public Double getSueldo(){
        return this.sueldoGerente;
    }

    @Override 
    public String toString(){
        return super.toString()+String.format("%20s|", sueldoGerente,
        this.sueldoGerente );
    
    }
}