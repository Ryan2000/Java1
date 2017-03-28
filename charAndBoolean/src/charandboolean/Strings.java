/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charandboolean;

//more work with primitive data types. 

public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String myString = "this is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00A9 2015";
        System.out.println("myString is equal to " + myString);
        
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);
        
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; //integer added to string.  appended number 50 to first part of number 10.  treated as text vs int
        System.out.println("LastString is equal to " + lastString);
        
        double doubleNumber = 120.47; //version using a double.  
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: :" + lastString);
        
    }

}
