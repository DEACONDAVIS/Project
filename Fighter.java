// Fighter class by Deacon Davis
// For software development CTE
// intructor Kim Gross
public class Fighter{
// here I add some variables to my class
int strength;
// the strength speed and name variables are the contsructors in my class
String name;
boolean strong;
// I made the boolean strong for fun, but it doesn't yet serve a purpose in my code.
int speed;

public Fighter (String fighterName, int strengthLevel, int fighterSpeed)
// here I set the constructors for my class and I configure them to be the same as my previous variables
{
name=fighterName;
strength=strengthLevel;
speed=fighterSpeed;

if(strength + speed >= 15){
    strong = true;
    }
    else
    {
    strong = false;
// if my fighter is weak he gets and extra speed bonus
    speed++;
    }
// here is some code for the strong variable to figure if the fighter is strong or not, if they aren't they will get a special boost
};
// below is the method that finds the player's total strength and speed score, and it adds them together. This is how I will measure individual fighter strength
public static int fighterOverall (int strength, int speed)
{
    return strength + speed;
}
// in the upbove three methods I make it so you can change the levels and name of the fighter
public static void main (String[]args)
{
    Fighter fighter1 = new Fighter("Jim", 12, 13);
    int fighter1_OVR = fighterOverall(fighter1.strength, fighter1.speed);
    System.out.println(fighter1.name + " level " + fighter1.strength + " speed " + fighter1.speed + " Total score " + fighter1_OVR);
    
// here I create my fighters and print their stats
    Fighter fighter2 = new Fighter("Bob", 8, 15);
    int fighter2_OVR = fighterOverall(fighter2.strength, fighter2.speed);
    System.out.println(fighter2.name + " level " + fighter2.strength + " speed " + fighter2.speed + " Total score " + fighter2_OVR);
    
// I have made an overall method, which accumulates the fighters overall stats
    Fighter fighter3 = new Fighter("Vlad", 20, 3);
    int fighter3_OVR = fighterOverall(fighter3.strength, fighter3.speed);
    System.out.println(fighter3.name + " level " + fighter3.strength + " speed " + fighter3.speed + " Total score " + fighter3_OVR);
    

// below is the actual fight, all three of the fighters get their stats compared with miscellenious stats the of the other two fighters
// if the fighter's speed and strength are more than the speed of one fighter and the strength of another, they win the fight
// here are the conditions to win in code
    if(fighter1_OVR >= fighter3.strength + fighter2.speed)
    {
        System.out.println(fighter1.name + " wins");
    }
    else if(fighter2_OVR >= fighter1.strength + fighter3.speed)
    {
        System.out.println(fighter2.name + " wins");
    }
    else if(fighter3_OVR >= fighter2.strength + fighter1.speed)
    {
        System.out.println(fighter3.name + " wins");
    }
}
}