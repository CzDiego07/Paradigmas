public class Triangle extends Figure{
    //Add base, height and sides
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double hypotnuse;
    public Triangle(double base, double height,double sideA,double sideB,double hypotnuse)throws Exception{
        super("Triangle");
        //Failure to comply will result in an error
        if (sideA + sideB <= hypotnuse || sideA + sideB <= hypotnuse || sideB + hypotnuse <= sideA) {
            throw new Exception("Error: re-enter the sides ");
        }
        this.base = base;
        this.height= height;
        this.sideA= sideA;
        this.sideB= sideB;
        this.hypotnuse= hypotnuse;
    }
    @Override
    //Area calculate
    public double calculateArea() {
        double area = 0;
        try {
            area = (base * height) / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error: División entre cero");
        }
        return area;
    }
    //perimeter calculate
    public double calculatePerim(){
        return(sideA+sideB+hypotnuse);
    }

}
