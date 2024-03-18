// Warrior class by Deacon Davis
// For software development CTE
// intructor Kim Gross
class Wuss extends Fighter {
    int missedGains;
// here is my special variable that effects the overall power of the wuss.
    public Wuss(String fighterName, int strengthLevel, int fighterSpeed, int missedGains) {
//the super keyword gets variables from the super class and brings them to the subclass.
        super(fighterName, strengthLevel, fighterSpeed); 
// here I have to initialize the variable missedGains.
        this.missedGains = missedGains; 
    }
    
    public static int fighterOverall(int strength, int speed, int missedGains) {
        return strength + speed - missedGains;
// here I effect the overall power of my wuss, This is the first time that I made a variable that detracts from the overall power of a fighter.
    };
// here are the methods that I made for the wuss class, I had a lot of fun making stuff up.
    public void reasoning() {
        System.out.println(" please stop violence isn't the answer ");
    }
// notice how my weak exuse is that his car exploded
    public void weakExuse() {
        System.out.println(" I have weak bones and I haven't been able to go to the gym because my car exploded ");
    }

    public static void main(String[] args) {
// here I create my wuss and I name him stewart
        Wuss stewart = new Wuss(" Stewart", 4, 25, 12);
        int stewart1_OVR = fighterOverall(stewart.strength, stewart.speed, stewart.missedGains);
        System.out.println(stewart.name + " strength:" + stewart.strength + " speed:" + stewart.speed + " missed gains:" + stewart.missedGains + " overall score:" + stewart1_OVR);
        stewart.weakExuse();
// here I use my methods for the wuss
        stewart.reasoning();
    }
}


