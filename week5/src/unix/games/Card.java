/*

 */
package unix.games;

/**
 *
 */
public class Card {

    private int suit;
    private int rank;

    //creating 4 contstants that only exist once in memory
    public final static int SPADES = 1;  //using (static) means 1 instance will be created in memory.  
    public final static int HEARTS = 2;
    public final static int DIAMONDS = 3;
    public final static int CLUBS = 4;

    public Card() { //default constructor 
        suit = 0;
        rank = 0;
    }

    public Card(int s, int r) {  //constructor, public name of method (card) takes 2 parameters suit and rank
        suit = s;
        rank = r;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getSuitAsString() {   //will return what that number means as a string, logical meaning of suit
        switch (suit) {
            case Card.SPADES:
                return "Spades";
            case Card.CLUBS:
                return "Clubs";
            case Card.HEARTS:
                return "Hearts";
            case Card.DIAMONDS:
                return "Diamonds";
            default:
                return "";
        }
        
    }   
    

    public void print() {
        System.out.println(rank + "of " + getSuitAsString());
    }

}
