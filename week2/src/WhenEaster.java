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
public class WhenEaster {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int year = 2022;
        
        int y = year;
        int a = y%19;
        int b = y/100;
        int c = y%100;
        int d = b/4;
        int e = b%4;
        int f = (b+8)/25;
        int g = (b-f+1)/3;
        int h = (19*a+b-d-g+15)%30;
        int i = c/4;
        int k = c%4;
        int m = (32+2*e+2*i-h-k)%7;
        int n = (a+11*h+22*m)/451;
        int o = (h+m-7*n+114)/31;
        int p = (h+m-7*n+114)%31;
                
           
        System.out.println(o+"/"+(p+1)+"/"+year);
        
        
        // TODO code application logic here
    }

}
