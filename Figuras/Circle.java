public  class Circle extends Figure{
    private double radius;
    public Circle(double radius){
        super("Circle");
        this.radius=radius;
    }
    @Override
    //Area calculate
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
    //perimeter calculate
    public double calculatePerim(){
        return Math.PI*(radius+radius);
    }

}
