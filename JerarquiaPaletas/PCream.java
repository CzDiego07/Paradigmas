public class PCream extends palette{
    protected Boolean cream;
    public PCream(String Flavor,Double price,boolean cream){
        super(Flavor, price);
        this.cream= cream;
    }
    public void showCream(){
        System.out.println("Cream texture: "+(cream ? "Yes": "No"));
    }
    public void ChangePrice(){
        price= price +6;
    }
}
