/*
Name: Ryan Hoyda
Assignment: #0
*/

import java.util.Scanner;
public class RandomNumber {

    public static void main(String[] args) {
    
     int r = (int)(Math.random() * 10)+1;
    //System.out.println(r);
        
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter a random number between 1 and 10: ");
     int guess = in.nextInt();
     
     
     if (guess == r)
     {
         System.out.println("Congratulations, you guessed it!");
     }
     else if (guess > r)
     {
         System.out.println("Your guess is too high");
     }
     else if (guess < r)
     {    
         System.out.println("your guess is too low");
     }
     //System.out.println(r);
    }}
         

    