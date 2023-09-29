import java.util.Random;

public class Main{
    public static void main(String[] args) {
        PWater waterP = new PWater("Lemon", 19.5, true);
        PCream creamP = new PCream("Milk", 35.5, true);
        
        boolean Applied;
        Random random = new Random();
        int randomX = random.nextInt(1);
        if(randomX==0){
            Applied= true;
        }else{
            Applied=false;
        }

        waterP.showInfo();
        waterP.showBaseW();
        waterP.ChangePrice();

        
        creamP.showInfo();
        creamP.showCream();
        creamP.ChangePrice();
        if(Applied == true){
            System.out.println("Congratulations!!!!!\n"+"You win discount in your purchase");
            waterP.discount(20);
            creamP.discount(10);
        }

    }
}