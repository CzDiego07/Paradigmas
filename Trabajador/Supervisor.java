public class Supervisor extends Trabajador{
    private Double PagaSupervisor;

    public Supervisor(String Name, int año,Double PagaSupervisor){
        super(Name, año);
        this.PagaSupervisor = PagaSupervisor;
    }
    public void setPaga(Double PagSupervisor){
        this.PagaSupervisor= PagSupervisor;
    }
    public Double getPaga(){
        return this.PagaSupervisor;
    }

    @Override 
    public String toString(){
        return super.toString()+String.format("%20s|", PagaSupervisor,
        this.PagaSupervisor );
    
    }
}