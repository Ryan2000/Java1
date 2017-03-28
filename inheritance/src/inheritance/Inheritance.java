/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritance;

/**
 *
 * @author ryanhoyda
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long Silky");
        dog.eat(); //can use eat method from animal 
        dog.walk();
        dog.run();
    }

}
