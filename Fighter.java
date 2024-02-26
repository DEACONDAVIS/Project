public class Fighter{
int strength;
String name;
boolean strong;

public Fighter (String fighterName, int strengthLevel)
{
name=fighterName;
strength=strengthLevel;
if(strength >= 5){
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
}