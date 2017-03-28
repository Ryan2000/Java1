/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package monkeyrobot;

import java.util.Scanner;


public class MonkeyRobot2 {


    public static void main(String[] args) {
        
final int MONKEY = 1;
final int ROBOT = 2;
final int PIRATE = 3;
final int NINJA = 4;
final int ZOMBIE = 5;

Scanner in = new Scanner(System.in);

for (int i=0; i<5; i++){

    int myTurn = 0;
    int computer = 0;
    computer = (int)(Math.random() * 5)+1;

    do 
        {
        System.out.print("Please enter your choice: ");
        myTurn = in.nextInt();
        String myChoice = "";
            if (myTurn == 1 ){myChoice = "Monkey";}
            else if (myTurn == 2){myChoice = "Robot";}
            else if (myTurn == 3){myChoice = "Pirate";}
            else if (myTurn == 4){myChoice = "Ninja";}
            else if (myTurn == 5){myChoice = "Zombie";}
            else {myChoice = "unknown";}
        
        String compChoice = "";
            if (computer == 1 ){compChoice = "Monkey";}
            else if (computer == 2){compChoice = "Robot";}
            else if (computer == 3){compChoice = "Pirate";}
            else if (computer == 4){compChoice = "Ninja";}
            else if (computer == 5){compChoice = "Zombie";}
            else {compChoice = "unknown";}
            
        System.out.println("Computer picked " + compChoice+ " You picked " +myChoice);
       } while (myTurn != computer); 
    
    
    String myChoice = "";
        if (myTurn == 1 ){myChoice = "Monkey";}
        else if (myTurn == 2){myChoice = "Robot";}
        else if (myTurn == 3){myChoice = "Pirate";}
        else if (myTurn == 4){myChoice = "Ninja";}
        else if (myTurn == 5){myChoice = "Zombie";}
        else {myChoice = "unknown";}
        
    String compChoice = "";
        if (computer == 1 ){compChoice = "Monkey";}
        else if (computer == 2){compChoice = "Robot";}
        else if (computer == 3){compChoice = "Pirate";}
        else if (computer == 4){compChoice = "Ninja";}
        else if (computer == 5){compChoice = "Zombie";}
        else {compChoice = "unknown";}
        
    if (myTurn == 1 && computer == 2);
        System.out.println(myChoice +" Beats " + compChoice+". You win this round");
}


}
}
    
