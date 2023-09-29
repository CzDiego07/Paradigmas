public class PWater extends palette{
    protected boolean BaseWater;
    public PWater(String flavor, double Price,boolean Base){
        super( flavor,Price);
        this.BaseWater = Base;
    }
    public void showBaseW(){
        System.out.println("Water Base: "+(BaseWater ? "Yes": "No"));
    }
    public void ChangePrice(){
        price = price+2;
    }

}
