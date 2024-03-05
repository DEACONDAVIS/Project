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
    }
// here is some code for the strong variable to figure if the fighter is strong or not, I might use this for a speed boost later in my code
};
public void changeName (String newName)
{
    name=newName;
}
public void changeLevel (int newLevel)
{
    strength=newLevel;
}
}