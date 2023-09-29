public  class  Character {
    protected String Name;
    protected int Level;
    public Character(String Name, int level){
        if (level < 1) {
            // Error in case of level is minor than 1
            throw new IllegalArgumentException("Level is minor than 1");
        }
        this.Name = Name;
        this.Level = level;
    }
    public void  Attack(int level){
        if (level < 5) {
            // Error in case of level is minor than 1
            throw new RuntimeException("Level is minor than 5, you cannot attack");
        }else{
            System.out.println("You are attacking!");
        }
    }
    public void displayAttributes() {
        System.out.println("Name: " + Name);
        System.out.println("Level: " + Level);
    }
}
