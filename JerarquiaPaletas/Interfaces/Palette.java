package Interfaces;

public interface Palette{
    public void showInfo();
    public void discount(double percentage);
    public void ChangePrice();
}
//----------------------------------------------------
class PWater implements Palette{
    protected boolean Base;
    protected String Flavor;
    protected double price;
    public PWater(String flavor, double Price,boolean Base){
        if (!Base) {
        throw new IllegalArgumentException("The base is not specificate");
        }
        this.Base = Base;
        this.Flavor= Flavor;
        this.price= price;
    }
    public void showInfo(){
        System.out.println("Water Base: "+(Base ? "Yes": "No"));
    }
    public void ChangePrice(){
        price = price+2;
    }
    public void discount(double percentage){
        double discount= price* (percentage/100);
        price = price - discount;
        System.out.println("Discount Applied is: " + discount);
    }
}
//--------------------------------------------------
class PCream implements Palette{
    protected Boolean Base;
    protected String Flavor;
    protected double price;
    public PCream(String Flavor,Double price,boolean Base){
        if (!Base) {
        throw new IllegalArgumentException("The base is not specificate");
    }

        this.Base= Base;
        this.Flavor= Flavor;
        this.price= price;
    }
    public void showInfo(){
        System.out.println("Cream texture: "+(Base ? "Yes": "No"));
    }
    public void ChangePrice(){
        price= price +6;
    }
    public void discount(double percentage){
        double discount= price* (percentage/100);
        price = price - discount;
        System.out.println("Discount Applied is: " + discount);
    }
}