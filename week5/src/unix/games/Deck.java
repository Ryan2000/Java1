/*

 */
package unix.games;

/**
 *
 */
import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    //will include and array list of cards. 
    private ArrayList<Card> deck;  //all instance variables need to be private (encapsulation)

    //now create default constructor
    public Deck() {
        deck = new ArrayList<Card>();

        //nested for loop
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                //Card c = new Card(suit, rank);
                //deck.add(c);
                deck.add(new Card(suit, rank));  // shortcut vs creating new variable above

            }
        }
    }

    public void print() {
        //enhanced variable
        for (Card c : deck) {
            System.out.println(c.getRank() + " of " + c.getSuitAsString());
        }

    }

    public void shuffle() {
        Collections.shuffle(deck);

    }

    public Card draw() {
        int rand = (int) (Math.random() * deck.size());// random number between 0 and amount of cards in deck
        return deck.remove(rand);
    }
}
