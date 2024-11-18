//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
public class Human{
// Here I create my human class, which my Player and Dealer classes inherit from 
String name;
int intelligence;
// I set my constructors to name and intelligence
public Human(String humanName, int humanIntelligence){
// since this is a base class for two more specific classes it is not super long or detailed
    this.name = humanName;
    this.intelligence = humanIntelligence;
}
}