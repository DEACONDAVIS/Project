// Warrior class by Deacon Davis
// For software development CTE
// intructor Kim Gross
class Warrior extends Fighter {
    int adrenaline;
// here I add a variable to add to the warrior class.
    public Warrior(String fighterName, int strengthLevel, int fighterSpeed, int adrenaline) {
        super(fighterName, strengthLevel, fighterSpeed); 
// I learned through I lot of trial and error that I have to write the below line of code.
        this.adrenaline = adrenaline; 
    }
    
    public static int fighterOverall(int strength, int speed, int adrenaline) {
        return strength + speed + adrenaline;
// here I use the adrenaline variable to effect the overall power.
    }
// below I create a method to make my warrior do a battle cry, I chose mine from spongebob.
    public void battlecry() {
        System.out.println("ledeledle");
    }

    public static void main(String[] args) {
        Warrior warrior1 = new Warrior("vlad", 10, 10, 10);
        int warrior1_OVR = fighterOverall(warrior1.strength, warrior1.speed, warrior1.adrenaline);
// I learned a lot from making this program, and I better understand how to create functioning methods.
        System.out.println(warrior1.name + " strength:" + warrior1.strength + " speed:" + warrior1.speed + " adrenaline rush:" + warrior1.adrenaline + " overall score:" + warrior1_OVR);
        warrior1.battlecry();
    }
}


