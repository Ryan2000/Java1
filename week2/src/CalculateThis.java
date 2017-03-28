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
public class CalculateThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int a = 5;
        int b = 3;
        
        int sum = a + b;
        System.out.println(sum);
        
        System.out.println(a + b);
        
        System.out.println("sum: "+a+" + "+b+" = "+sum);
        System.out.println("sum: "+a+" + "+b+" = "+(a+b));
        
        
        int difference = a - b;
        System.out.println(difference);
        
        int product = a * b;
        System.out.println(product);
        
        int division = a / b;
        System.out.println(division);
        
        int modulus = a % b;
        System.out.println(modulus);
        
        
        int x = a & b;
        System.out.println(x);
        
        
        
        int y = a ^ b;
        System.out.println(y);
        
        
        //int odd = a & 1;
        //System.out.println(odd);
        
        int odd = 6 & 1;
        System.out.println(odd);
        
        
        int mask = b ^ 15;  //exclusive or
        System.out.println(mask);
        
        
        //bit shift
        int s = a<<1;  //left shift multiplied by 2
        System.out.println(s);
        // TODO code application logic here
        
        
        
        
        
    }

}
