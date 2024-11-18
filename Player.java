//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
class Player extends Human{
// here I extend my human class to create the player class
int money;
int debt;
// I give the player an amount of money, and and amount of debt 
    public Player(String humanName, int humanIntelligence, int moneyAmount, int cripplingDebt ){
// I have no real reason to add debt or money, but I thought it was a fun detail 
        super(humanName, humanIntelligence);

        this.money = moneyAmount;

        this.debt = cripplingDebt;
    }
}