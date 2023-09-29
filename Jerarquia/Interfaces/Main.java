package Interfaces;

public class Main {
    public static void main(String[] args) {
        try {
            Player player = new Player("Maquinator3k", 5, "Warrior");
            Enemy zombie = new Enemy("zombie", 5, "Undead");
            Enemy enderman = new Enemy("enderman", 6, "Monster");
            Enemy dragon = new Enemy("Dragon", 10, "Legendary");
            DualAbilityCharacter dualAbilityCharacter = new DualAbilityCharacter("Dual", 7);

            Character[] characters = {player, zombie, enderman, dragon, dualAbilityCharacter};

            for (Character character : characters) {
                character.displayAttributes();
                character.attack();

                if (character instanceof MagicAbilities) {
                    MagicAbilities magicCharacter = (MagicAbilities) character;
                    magicCharacter.FireBall();
                }
                if (character instanceof PhysicalAbilities) {
                    PhysicalAbilities physicalCharacter = (PhysicalAbilities) character;
                    physicalCharacter.PhysicalAttack(player);
                }
                System.out.println();
            }

            // Call the useSpecialAbility method for enderman and Dragon from the player
            for (Character character : characters) {
                if (character instanceof Player) {
                    Player playerCharacter = (Player) character;
                    if (enderman instanceof Enemy) {
                        playerCharacter.useSpecialAbility(enderman);
                    }
                    if (dragon instanceof Enemy) {
                        playerCharacter.useSpecialAbility(dragon);
                    }
                }
            }

            // Display information about the enemies
            System.out.println("\nInformation about the enemies:");
            zombie.displayAttributes();
            zombie.scream();
            enderman.displayAttributes();
            enderman.scream();
            dragon.displayAttributes();
            dragon.scream();

        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("RuntimeException: " + e.getMessage());
        }
    }
}