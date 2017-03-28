/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package week6;

/**
 *
 * @author ryanhoyda
 */
public class diceGame {

    /**
     */
    public static void main(String[] args) {
        pairofdice dice = new pairofdice();
        int count = 1;
        
        dice.roll();
        
        while (!dice.isDouble()){
            System.out.println(dice);
            dice.roll();
            count++;
        }
        
        System.out.println(dice);
        System.out.println(count);
        
    }

}
