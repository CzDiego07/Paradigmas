public class Obrero extends Trabajador{
    private double sueldoObrero;

    public Obrero(String Name, int año,Double sueldoObrero){
        super(Name, año);
        this.sueldoObrero = sueldoObrero;
    }
    public void setSueldo(Double sueldo){
        this.sueldoObrero= sueldo;
    }
    public Double getSueldo(){
        return this.sueldoObrero;
    }

    @Override 
    public String toString(){
        return super.toString()+String.format("%20s|", sueldoObrero,
        this.sueldoObrero );
    
    }
}