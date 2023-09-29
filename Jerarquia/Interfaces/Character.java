package Interfaces;
import java.util.ArrayList;
import java.util.List;

abstract class Character {
    protected String name;
    protected int level;
    public Character(String name, int level) {
        if (level < 1) {
            throw new IllegalArgumentException("Level can not be less than 1.");
        }
        this.name = name;
        this.level = level;
    }
    public abstract void attack();
    public void displayAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
    }
}
interface MagicAbilities {
    void FireBall();
}
interface PhysicalAbilities {
    void PhysicalAttack(Character target);
}

class Player extends Character implements MagicAbilities, PhysicalAbilities {
    private String playerClass;
    public Player(String name, int level, String playerClass) {
        super(name, level);
        this.playerClass = playerClass;
    }
    @Override
    public void attack() {
        if (level < 5) {
            throw new RuntimeException(name + " cannot attack because their level is less than 5.");
        }
        System.out.println(name + " attacks!");
    }
    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Class: " + playerClass);
    }
    @Override
    public void FireBall() {
        System.out.println(name + " casts a magic spell!");
    }
    @Override
    public void PhysicalAttack(Character target) {
        System.out.println(name + " performs a physical attack on " + target.name + "!");
    }
    public void useSpecialAbility(Enemy enemy) {
        System.out.println(name + " uses a special ability on " + enemy.name + "!");
    }
}

class Enemy extends Character implements MagicAbilities, PhysicalAbilities {
    private String type;
    public Enemy(String name, int level, String type) {
        super(name, level);
        this.type = type;
    }
    @Override
    public void attack() {
        if (level < 5) {
            throw new RuntimeException(name + " cannot attack because their level is less than 5.");
        }
        System.out.println(name + " attacks!");
    }
    @Override
    public void displayAttributes() {
        super.displayAttributes();
        System.out.println("Type: " + type);
    }
    @Override
    public void FireBall() {
        System.out.println(name + " casts a magic spell!");
    }
    @Override
    public void PhysicalAttack(Character target) {
        System.out.println(name + " performs a physical attack on " + target.name + "!");
    }
    public void scream() {
        System.out.println(name + " screams!");
    }
}
class DualAbilityCharacter extends Character implements MagicAbilities, PhysicalAbilities {
    public DualAbilityCharacter(String name, int level) {
        super(name, level);
    }
    @Override
    public void attack() {
        if (level < 5) {
            throw new RuntimeException(name + " cannot attack because their level is less than 5.");
        }
        System.out.println(name + " attacks!");
    }
    @Override
    public void displayAttributes() {
        super.displayAttributes();
    }
    @Override
    public void FireBall() {
        System.out.println(name + " casts a magic spell!");
    }
    @Override
    public void PhysicalAttack(Character target) {
        System.out.println(name + " performs a physical attack on " + target.name + "!");
    }
}

