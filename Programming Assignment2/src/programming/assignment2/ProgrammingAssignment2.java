/*
Name: Ryan Hoyda
Assignment: #2
Date: 7/12/2016
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package programming.assignment2;

import java.util.Scanner;

public class ProgrammingAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        final int PENNIES_PER_DOLLAR = 100;
        final int PENNIES_PER_QUARTER = 25;
        final int PENNIES_PER_DIME = 10;
        final int PENNIES_PER_NICKEL = 5;
        
        System.out.print("Please enter item price: ");
        double itemPrice = in.nextDouble();
        //System.out.println("Your item price is: " +itemPrice);
        
        System.out.print("Please enter purchase amount: ");
        double purchaseAmt = in.nextDouble();
        //System.out.println("Your purchase amount is: " +purchaseAmt);
        
        double totalChange = purchaseAmt - itemPrice;
        System.out.println("Your total change is: " +totalChange);
        
        totalChange = (totalChange) * 100;
        
        int finalChange = (int)Math.round(totalChange);
        //System.out.println("Your final change is: " +finalChange);
        
        int dollarCoins = finalChange/PENNIES_PER_DOLLAR;
        //System.out.println(dollarCoins);
        
        int penniesRemaining = finalChange%PENNIES_PER_DOLLAR;
        //System.out.println(penniesRemaining);
        
        int quarter = penniesRemaining/PENNIES_PER_QUARTER;
        //System.out.println(quarter);
        
        penniesRemaining = penniesRemaining%PENNIES_PER_QUARTER;
        //System.out.println(penniesRemaining);
        
        int dime = penniesRemaining/PENNIES_PER_DIME;
        //System.out.println(dime);
        
        penniesRemaining = penniesRemaining%PENNIES_PER_DIME;
        //System.out.println(penniesRemaining);
        
        int nickel = penniesRemaining/PENNIES_PER_NICKEL;
        //System.out.println(nickel);
        
        penniesRemaining = penniesRemaining%PENNIES_PER_NICKEL;
        //System.out.println(penniesRemaining);
        
        
        System.out.println("Your Given Change: " +dollarCoins+" dollar, "+quarter+" quarter, "+dime+" dime, "+nickel+" nickel, and "+penniesRemaining+" pennies");
        
        
    }
    
    
    

}
