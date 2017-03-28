/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardtuesday;


public class Card {

    private String name;

    public Card() {
        name = "";
    }

    public Card(String name) {

        this.name = name;
        System.out.println("Card");
    }

    public String getName() {
        return name;
    }

    public boolean isExpired() {
        return false;
    }

    public String toString() {
        System.out.println("Card.toString");
        return "CardHolder= " + name;
    }


}
