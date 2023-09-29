public  class palette{
    protected String Flavor;
    protected double price;

    public palette(String Flavor, double price){
        //In case it is marked that it is one of the two types, it will give an error
        if (!Flavor.equals("Water") && !Flavor.equals("Cream")) {
            throw new IllegalArgumentException("The flavor is Water or Cream");
        }
        this.Flavor= Flavor;
        this.price= price;
    }
    
    
    public void showInfo(){
        System.out.println("Flavor is: "+ Flavor);
        System.out.println("Price is: "+ price);
    }
    public void discount(double percentage){
        double discount= price* (percentage/100);
        price = price - discount;
        System.out.println("Discount Applied is: " + discount);
    }
    
}