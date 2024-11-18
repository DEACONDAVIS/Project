//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
class Dealer extends Human{
// Here is my dealer class that extends the parent class human
int handSpeed;
// the dealer has a hand speed variable
    public Dealer(String humanName, int humanIntelligence, int dealingSpeed){
// I have no need for the dealing speed variable but I thought it was fun
        super(humanName, humanIntelligence);
        this.handSpeed = dealingSpeed;
    }
}