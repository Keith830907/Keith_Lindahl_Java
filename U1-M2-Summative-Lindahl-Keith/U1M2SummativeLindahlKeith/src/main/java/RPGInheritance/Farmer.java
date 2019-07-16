package RPGInheritance;

public class Farmer extends Characters {

    private int strength =75;
    private int health =100;
    private int stamina =75;
    private int attackPower = 1;
    private int speed = 10;

    public Farmer(String name, int strength, int health, int stamina, int attackPower, int speed) {
        super(name);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.speed = speed;
    }

    public Farmer(int strength, int health, int stamina, int attackPower, int speed) {
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.speed = speed;
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

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Farmer() {
    }

    public void plow(){
        System.out.println(" is plowing");
    }
    public void harvest(){
        System.out.println(" is harvesting");
    }



    @Override
    public String toString() {
        return "Farmer{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", attackPower=" + attackPower +
                ", speed=" + speed +
                '}';
    }
}
