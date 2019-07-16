package RPGInheritance;

public class Warrior extends Characters {

    private int strength = 75;
    private int health = 100;
    private int stamina = 100;
    private int attackPower = 10;
    private int shieldStrength = 100;
    private int speed = 50;

    public Warrior(String name, int strength, int health, int stamina, int attackPower, int shieldStrength, int speed) {
        super(name);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
        this.speed = speed;
    }

    public Warrior(int strength, int health, int stamina, int attackPower, int shieldStrength, int speed) {
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.shieldStrength = shieldStrength;
        this.speed = speed;
    }

    public Warrior(String name) {
        super(name);
    }

    public Warrior() {
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int decreaseShieldStrength(int shieldStrength){
        shieldStrength = shieldStrength -10;
        return shieldStrength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                ", speed=" + speed +
                '}';
    }
}
