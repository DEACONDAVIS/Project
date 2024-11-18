//Code by Deacon Davis
//For CTE Software Development 1
//Instructor Kim Gross
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.smartcardio.Card;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.util.Collections;
// here I import the collections asset that will shuffle my cards
import java.util.ArrayList;


public class Deck {
// here I create ints to hold the final score of each hand
// I set them equal to one so I could add to them
// I chose one because I wasn't sure if I could have functional code and set them to zero
    static int finalScore1 = 1;
    static int finalScore2 = 1;
    static int finalScore3 = 1;
    static int finalScore4 = 1;
    static int finalScore5 = 1;

    private ArrayList<Card> deck;
// here I create my deck array
    public Deck() {
        deck = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
// Here I create the arrays to hold all of the values, suits and names of all 52 cards in a standard playing deck
        String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        int[] values = {14, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
// using the for loop below I create all of the cards
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < names.length; j++) {
                Card card = new Card(names[j] + " of " + suits[i], suits[i], values[j]);
                deck.add(card);
            }
        }
    }

    public void shuffle() {
// here I use the aforementioned shuffle asset to shuffle my deck of cards
        Collections.shuffle(deck);
    }
    
// I dont run this method anywhere in the final code, but I originally used it to test if my deck was being created
    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getName());
        }
    }
}
    public class GUI implements ActionListener{

    private int hits = 0;
    private JButton button;
    
    public GUI(){


        JFrame frame = new JFrame();

        button = new JButton("hit");
        button.addActionListener(this);

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Card Game");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        Deck deck = new Deck();
// here I create my deck and shuffle it
        deck.shuffle();
// I decided to create a dealer and some players to make the game more interesting and fun
        Dealer thad = new Dealer("Thad", 98,64);
        Player jim = new Player ("Jim", 102, 1000, 2000);
        Player greg = new Player ("Greg", 100, 2000, 100);
        Player vlad = new Player ("Vlad", 90, 400, 10000);
        Player frank = new Player ("Frank", 95, 500, 20);
        Player john = new Player ("John", 101, 5000, 2000);
        // I now print all of the stats
        System.out.println(" ");
        System.out.println("your dealer is " + thad.name + " intelligence " + thad.intelligence + " dealing speed " + thad.handSpeed);
        System.out.println(" ");

        Hand hand1 = new Hand(deck.deck);
        Card[] cardsInHand1 = hand1.getHand1();
        System.out.println("First hand: " + jim.name + " intelligence " + jim.intelligence + " money " + jim.money);
        for (Card card : cardsInHand1) {
            System.out.println(card.getName());
        }
        for (Card card : cardsInHand1){
            card.getValue();
// here I get the values of all the cards in the hand and I add them together to create a final score
            finalScore1 = finalScore1 + card.getValue();
        }
        System.out.println("Final Score " + finalScore1);
        System.out.println(" ");

        for (Card card : cardsInHand1) {
// here I remove the cards from the first hand out of the deck, so no hands have the same cards in them
            deck.deck.remove(card);
        }
// here I print the stats for the second hand
        Hand hand2 = new Hand(deck.deck); 
        Card[] cardsInHand2 = hand2.getHand1();
        System.out.println("Second hand:"+ greg.name + " intelligence " + greg.intelligence + " money " + greg.money);
        for (Card card : cardsInHand2) {
            System.out.println(card.getName());
        }
        for (Card card : cardsInHand2){
            card.getValue();
            finalScore2 = finalScore2 + card.getValue();
    
        }
        System.out.println("Final Score " + finalScore2);
        System.out.println(" ");
        
        for (Card card : cardsInHand2) {
            deck.deck.remove(card);
        }
// here I print the third hand
        Hand hand3 = new Hand(deck.deck); 
        Card[] cardsInHand3 = hand3.getHand1();
        System.out.println("Third hand:"+ vlad.name + " intelligence " + vlad.intelligence + " money " + vlad.money);
        for (Card card : cardsInHand3) {
            System.out.println(card.getName());
        }
        for (Card card : cardsInHand3){
            card.getValue();
            finalScore3 = finalScore3 + card.getValue();
    
        }
        System.out.println("Final Score " + finalScore3);
        System.out.println(" ");
        for (Card card : cardsInHand3) {
            deck.deck.remove(card);
        }
// I print the fourth hand here
        Hand hand4 = new Hand(deck.deck); 
        Card[] cardsInHand4 = hand4.getHand1();
        System.out.println("Fourth hand:"+ frank.name + " intelligence " + frank.intelligence + " money " + frank.money);
        for (Card card : cardsInHand4) {
            System.out.println(card.getName());
        }
        for (Card card : cardsInHand4){
            card.getValue();
            finalScore4 = finalScore4 + card.getValue();
    
        }
        System.out.println("Final Score " + finalScore4);
        System.out.println(" ");
        for (Card card : cardsInHand4) {
            deck.deck.remove(card);
        }
// finally I print the fifth hand
        Hand hand5 = new Hand(deck.deck); 
        Card[] cardsInHand5 = hand5.getHand1();
        System.out.println("Fifth hand:"+ john.name + " intelligence " + john.intelligence + " money " + john.money);
        for (Card card : cardsInHand5) {
            System.out.println(card.getName());
        }
        for (Card card : cardsInHand5){
            card.getValue();
            finalScore5 = finalScore5 + card.getValue();
    
        }
        System.out.println("Final Score " + finalScore5);
        System.out.println(" ");
        for (Card card : cardsInHand5) {
            deck.deck.remove(card);
        }
// I remembered to continually remove the cards from each hand out of the deck
// here I use a bunch of nestled if statements to figure out which hand has the highest final score
        if (finalScore1 > finalScore2){
            if (finalScore1 > finalScore3){
                if (finalScore1 >finalScore4){
                    if (finalScore1 > finalScore5){
                        System.out.println("hand 1 wins");
                    }
                }
            }
        }
// this code has a lot of reuseability, so I copy and pasted my nestled if statements and I changed the values so I can cover all of the hands
        if (finalScore2 > finalScore1){
            if (finalScore2 > finalScore3){
                if (finalScore2 >finalScore4){
                    if (finalScore2 > finalScore5){
                        System.out.println("hand 2 wins");
                    }
                }
            }
        }
        if (finalScore3 > finalScore2){
            if (finalScore3 > finalScore1){
                if (finalScore3 >finalScore4){
                    if (finalScore3 > finalScore5){
                        System.out.println("hand 3 wins");
                    }
                }
            }
        }
        if (finalScore4 > finalScore2){
            if (finalScore4 > finalScore3){
                if (finalScore4 >finalScore1){
                    if (finalScore4 > finalScore5){
                        System.out.println("hand 4 wins");
                    }
                }
            }
        }
        if (finalScore5 > finalScore2){
            if (finalScore5 > finalScore3){
                if (finalScore5 >finalScore4){
                    if (finalScore5 > finalScore1){
                        System.out.println("hand 5 wins");
                    }
                }
            }
        }
        System.out.println(" ");
// that is the end of my code thank you for reading the comments
    }
}
