public class Rectangle extends Figure{
    private double base;
    private double length;

    public Rectangle(double base, double length){
        super("Rectangle");
        this.length= length;
        this.base = base;
    }
    @Override
    //Area calculate
    public double calculateArea() {
        return base * length;
    }
    //Perimeter calculate
    public double calculatePerim(){
        return(base+length);
    }

}
