package RPGInheritance;

public class RPGTester {

    public static void main(String[] args) {
       Farmer farmer1 = new Farmer("John",75,100,75,1,10);
       Constable constable1 = new Constable("Mark",60,100,60,5,20);
       Warrior warrior1 = new Warrior("Sable", 75,100,100,10,100,50);
       //I know I can make more objects then one of each but chose not too cause to much to type



        System.out.print(constable1.getName());
        constable1.run();

        constable1.jurisdiction();
        constable1.arrest();

        System.out.print(farmer1.getName());
        farmer1.attack(10);

        System.out.print(constable1.getName()+ " health has dropped to ");
        constable1.setHealth(90);
        System.out.println(constable1.getHealth());

        farmer1.increaseStamina(25);

        System.out.print(warrior1.getName());

        warrior1.decreaseShieldStrength(10);
        warrior1.attack(5);
        System.out.print(warrior1.getName()+ " shield strength has dropped ");
        warrior1.setShieldStrength(90);
        System.out.println(warrior1.getShieldStrength());

        System.out.print(farmer1.getName());
        System.out.print(" just suffered a hard blow and now has health of ");
        farmer1.setHealth(60);
        System.out.print(farmer1.getHealth());

        System.out.print("\n"+ constable1.getName()+ " health has dropped to ");
        constable1.setHealth(80);
        System.out.print(constable1.getHealth()+" after getting hit with a hoe.");

        System.out.print("\n"+ warrior1.getName());
        constable1.setStrength(40);
        System.out.print(" lost some strength with a bad swing of the sword and is at " + constable1.getStrength()+ " strength");

        System.out.print("\n"+farmer1.getName());
        farmer1.run() ;
        System.out.print("The other two thought he was scared but they are on his land");
        System.out.print("\n"+farmer1.getName());
        farmer1.harvest();
        System.out.print( warrior1.getName());
        System.out.print(" and ");
        System.out.print(constable1.getName());
        System.out.print(" are all that left and "+ constable1.getName() + " wants to arrest " + warrior1.getName()+". ");
        System.out.print(constable1.getName() + " attacks first due to his duty. ");
        warrior1.setAttackPower(5);
        System.out.println("\n"+warrior1.getName()+ " attack power has gone down to " + warrior1.getAttackPower());

        constable1.setAttackPower(10);
        System.out.println(constable1.getName() + " attack power has gone up due to anger. Attack power at "  + constable1.getAttackPower());

        warrior1.setSpeed(60);
        System.out.println(warrior1.getName() + " speed goes up as he hits " + constable1.getName()+ " with his sword slightly across the arm. Speed is " +
                warrior1.getSpeed());

        constable1.setHealth(55);
        System.out.println(constable1.getName()+ " health has gone to "+ constable1.getHealth());

        warrior1.setHealth(50);
        System.out.println(constable1.getName()+ " stabs "+warrior1.getName()+" with a knife at the same time. "+warrior1.getHealth()+ " health is now half gone...ouch");

        warrior1.setStamina(50);
        constable1.setStamina(40);
        System.out.println(warrior1.getName()+" and "+constable1.getName()+" stamina is both crushed now");
        System.out.println(warrior1.getName()+ " stamina is " +warrior1.getStamina()+" and "+constable1.getName()+" stamina is "+constable1.getStamina());

        System.out.print(farmer1.getName());
        farmer1.plow();
        System.out.println(farmer1.getName()+ " wishes the constable would just arrest him already");
        farmer1.setSpeed(15);
        farmer1.setStamina(80);
        farmer1.setStrength(80);
        System.out.println(farmer1.getName()+" knows hard work increases speed to "+ farmer1.getSpeed()+ " and stamina to "+farmer1.getStamina()+" and strength to "+
                farmer1.getStrength());

     System.out.println("Between a knife stab to the gut "+ constable1.getName()+" got the better hit in then the mostly missed sword swing by "+warrior1.getName());
     System.out.print(constable1.getName()+" again said ");constable1.arrest();
     System.out.println("Due to the near fatal stabbing " + warrior1.getName()+" this time gave up and went to jail...THE END");
    }
}
