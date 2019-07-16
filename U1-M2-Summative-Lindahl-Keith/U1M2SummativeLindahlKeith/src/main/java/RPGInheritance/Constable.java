package RPGInheritance;

public class Constable extends Characters{

    private int strength =60;
    private int health =100;
    private int stamina =60;
    private int attackPower = 5;
    private int speed = 20;

    public Constable(String name, int strength, int health, int stamina, int attackPower, int speed) {
        super(name);
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.speed = speed;
    }

    public Constable(int strength, int health, int stamina, int attackPower, int speed) {
        this.strength = strength;
        this.health = health;
        this.stamina = stamina;
        this.attackPower = attackPower;
        this.speed = speed;
    }

    public Constable(String name) {
        super(name);
    }

    public Constable() {
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

    public void jurisdiction(){
        System.out.println(" This is my Jurisdiction partner");
        System.out.println(" I reckon you move on");
    }

    public void arrest(){
        System.out.println(" Your under a arrest");
        System.out.println(" Now put your hands behind your back or this gonna get ugly");
    }



    @Override
    public String toString() {
        return "Constable{" +
                "strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", attackPower=" + attackPower +
                ", speed=" + speed +
                '}';
    }
}
