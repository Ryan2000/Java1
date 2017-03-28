/*
Name: Ryan Hoyda
Assignment: #0
 */

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unix.games;

/**
 *
 */
public class Driver {  //common term used for testing class.  main class that describes how to use
    // other classes. 

    public static void main(String[] args) {
        Card aceSpades = new Card();  //Card class.  aceSpades is an object or instance of class.  constructor is executed
        aceSpades.setRank(1);
        aceSpades.setSuit(Card.SPADES); //access using contants. (Spades)

        //System.out.println(aceSpades.getRank() + " of " + aceSpades.getSuitAsString());  //now pulls in Spades (AsString)
        Deck deck = new Deck();
        deck.print();

        deck.shuffle();
        deck.print();

        Card myCard = deck.draw();
        myCard.print();
        //System.out.println(myCard.getRank()+ "of " + myCard.getSuitAsString());  

    }

}
