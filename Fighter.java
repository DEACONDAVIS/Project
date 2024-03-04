public class Fighter{
int strength;
String name;
boolean strong;
int speed;

public Fighter (String fighterName, int strengthLevel, int fighterSpeed)
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
};
public void changeName (String newName)
{
    name=newName;
}
public void changeLevel (int newLevel)
{
    strength=newLevel;
}
public void changeSpeed (int newSpeed)
{
    speed=newSpeed;
}

}
