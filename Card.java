//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
import java.util.ArrayList;
import java.util.Collections;
// In the code below I create a card class
public class Card {
// here I create all the variables I need for a card
    private int value;
    private String suit;
    private String name;
    
    public Card(String cardName, String cardSuit, int cardValue) {
// even though most of the names for the cards are just their numbers, there are a few exeptions, which is why I added card names
        this.value = cardValue;
        this.suit = cardSuit;
        this.name = cardName;
    }
    
    public int getValue() {
        return value;
    }
// here I create methods to return the value, suit, and name of the card

    public String getSuit() {
        return suit;
    }

    public String getName() {
        return name;
    }
// this is all the code that I need for my card class
}