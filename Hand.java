//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
import java.util.ArrayList;
import java.util.Collections;

public class Hand {
// here I create the hand for my cards
    public Card[] hand1 = new Card[5]; 
    public Hand(ArrayList<Card> deck) {
        
// right here I assign the first five indexes in the deck of cards for each hand
// since I removed the cards in each hand from the deck after I dealt them, I can reuse this code for each hand while still making sure each hand has unique cards
        for (int i = 0; i < 5; i++) {
            hand1[i] = deck.get(i);
        }
    
    }
// here I create a return method for my hand
    public Card[] getHand1() {
        return hand1;
    }

}

  
   


