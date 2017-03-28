/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanhoyda
 */
import java.util.Scanner;

public class WhatsMyName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        Scanner in = new Scanner(System.in);
        
//        System.out.print("Please enter your first name: ");
//        String first = in.nextLine();
//        
//        System.out.print("Please enter your last name: ");
//        String last = in.nextLine();
        
        
        System.out.print("Please enter your first and last name: ");
        String first = in.next();
        String last = in.nextLine();
        
        
        
        int numfirst = first.length();
        int numlast = last.length();
       
        System.out.println("Your first name is "+first+", which has "+numfirst+" characters");
        System.out.println("Your last name is "+last+", which has "+numlast+" characters");
        
          
                
    }

}
