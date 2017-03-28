/*
Name: Ryan Hoyda
Assignment: #0
*/


import java.util.Scanner;
public class RandomGuess2 {

    
    public static void main(String[] args) {
    int r = (int)(Math.random() * 10)+1;
    int guess = 0;
       
    Scanner in = new Scanner(System.in);
     
     
    do{
     
     System.out.print("Please enter a random number between 1 and 10: ");
     guess = in.nextInt();
    
        if (guess > r)
        {
            System.out.println("Guess is too high, please try again");
        }
        if (guess < r)
        {
            System.out.println("Your guess is too low");
        }
     } while (guess != r);
     System.out.println("your guess is correct");


}
}
