package RPGInheritance;

public abstract class Characters {

    private String name;

    public Characters(String name) {
        this.name = name;
    }

    public Characters() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void run(){
        System.out.println(" is running away");
    }

    public int attack(int health){
        System.out.println(" is attacking");
        health = health - 10;
        return 10;
    }

    public int heal(int health){
        System.out.println(" is healing");
        health = health + 5;
        return health;
    }

    public int decreaseHealth(int health){
        if(health == 0)
            return 0;
        System.out.println(" got hurt");
        health = health - 5;
        return health;


    }
    public int decreaseStamina(int stamina){
        System.out.println(" stamina fell");
        stamina = stamina -5;
        return stamina;
    }
    public int increaseStamina(int stamina){
        System.out.println(" stamina increased...nice");
        stamina = stamina + 10;
        return stamina;
    }
}
