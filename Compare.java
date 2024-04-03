// For software development CTE
// Intructor Kim Gross
import java.util.Collections;
import java.util.ArrayList;

public class Fighter implements Comparable<Fighter>{
int strength;
// the strength speed and name variables are the contsructors in my class
String name;
boolean strong;
int speed;

public Fighter (String fighterName, int strengthLevel, int fighterSpeed)
// here I set the constructors for my class and I configure them to be the same as my previous variables
{
name=fighterName;
strength=strengthLevel;
speed=fighterSpeed;
}
}
@Override
public int compareTo(Fighter ft){
    if(strength == ft.strength){
        return 0;
    }
    else if(strength > ft.strength){
        return 1;
    }
    else{
        return -1;
    }
}
public class testSort{
    public static void main(String args[]){
        ArrayList<Fighter> al = new ArrayList<Fighter>();
        al.add (new Fighter("Adam",1,3));
        al.add (new Fighter("Frank",2,3));
        al.add (new Fighter("Grant",3,3));

        Collections.sort(al);
        for(Fighter ft : al){
            System.out.println(ft.name + ", " + ft.strength + ", " +ft.speed);
        }
    }
}