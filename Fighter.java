// Fighter class by Deacon Davis
// For software development CTE
// intructor Kim Gross
import java.util.Collections;
public class Fighter implements Comparable<Fighter>{
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
    }
// here is the code for my testSort.java file, it sorts the fighters from least to most strength level
    @Override
// here I use the comparable interface to sort my fighters
    public int compareTo(Fighter ft){
        if (strength == ft.strength) {
            return 0;
        } else if (strength > ft.strength) {
            return 1;
        } else {
            return -1;
        }
    }
}
