import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Jorge", 50, "Mago");
        Enemy Zombie = new Enemy("Zombie", 23, "Undead");
        Enemy Boss = new Enemy("Medusa", 90, "Boss");
        Enemy Boss_Final = new Enemy("Dragon", 2, "Boss Final");
        player.displayAttributes();
        player.Attack(50);

        Random random = new Random();
        int RandomX = random.nextInt(3);
        Enemy randomEnemy;

        if(RandomX==0){
            randomEnemy = Boss_Final;
        }else if(RandomX == 1){
            randomEnemy = Boss;
        }else{
            randomEnemy = Zombie;
        }
        player.useAbility(randomEnemy);
        
        System.out.println();
        Zombie.displayAttributes();
        Zombie.Attack(23);
        Zombie.Scream();

        System.out.println();
        Boss.displayAttributes();
        Boss.Attack(90);
        Boss.Scream();
        
        System.out.println();
        Boss_Final.displayAttributes();
        Boss_Final.Attack(2);
        Boss_Final.Scream();
    }
}
