public  class Player extends Character{
    protected String Class;
    public Player(String Name,int level,String Class){
        super("Jose", 12);
        this.Class= Class;
    }
   public void useAbility(Enemy enemy){
    System.out.println("Use special ability vs "+ enemy.Name);
   }

   @Override
   public void displayAttributes(){
    super.displayAttributes();
    System.out.println("Class: "+ Class);
   }
}
