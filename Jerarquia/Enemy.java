public class Enemy extends Character{
    protected String type;

    public Enemy(String Name, int Level,String Enemy){
        super("Boss Final", 99);
        this.type = Enemy;
    }
    public void Scream(){
        System.out.println(Name + "Scream!!!");
    }
    @Override
    public void displayAttributes(){
        super.displayAttributes();
        System.out.println("Type: "+ type);
    }
}
