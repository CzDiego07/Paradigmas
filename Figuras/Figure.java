public abstract class Figure{
    //Name of figure
    protected String Name;
    public Figure(String Name){
        this.Name= Name;
    }
    //methods
    public abstract double calculateArea();
    public abstract double calculatePerim();
}