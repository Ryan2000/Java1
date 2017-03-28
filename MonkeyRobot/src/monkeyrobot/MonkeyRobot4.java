/*
Name: Ryan Hoyda
Assignment: #0
 */
package monkeyrobot;

import java.util.Scanner;

public class MonkeyRobot4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int myResults = 0;
        int computerResults = 0;

        for (int i = 1; i < 6; i++) { //initialize for loop.  Iterate through 5 times
            // began at 1 for round 1.  

            System.out.println("Round " + i); //begins at Round1 and adds 1 each 

            int myTurn = 0; // variable representing user input
            int computer = 0; //variable representing computer selection

            while (myTurn == computer) // if user input is equal to computer input - re-enter loop
            {
                System.out.print("Please enter your choice: ");
                myTurn = in.nextInt();
                String myChoice = ""; //user section.  sets numerical choice equal to string selection
                if (myTurn == 1) {
                    myChoice = "Monkey";
                } else if (myTurn == 2) {
                    myChoice = "Robot";
                } else if (myTurn == 3) {
                    myChoice = "Pirate";
                } else if (myTurn == 4) {
                    myChoice = "Ninja";
                } else if (myTurn == 5) {
                    myChoice = "Zombie";
                } else {
                    myChoice = "unknown";
                }

                computer = (int) (Math.random() * 5) + 1;
                String compChoice = ""; //computuer section.  sets random number equal to string
                if (computer == 1) {
                    compChoice = "Monkey";
                } else if (computer == 2) {
                    compChoice = "Robot";
                } else if (computer == 3) {
                    compChoice = "Pirate";
                } else if (computer == 4) {
                    compChoice = "Ninja";
                } else if (computer == 5) {
                    compChoice = "Zombie";
                } else {
                    compChoice = "unknown";
                }

                System.out.println("Computer picked " + compChoice + ". You picked " + myChoice);
            } //output depicting selected choices, user and computer

            String myChoice = "";
            if (myTurn == 1) {
                myChoice = "Monkey";
            } else if (myTurn == 2) {
                myChoice = "Robot";
            } else if (myTurn == 3) {
                myChoice = "Pirate";
            } else if (myTurn == 4) {
                myChoice = "Ninja";
            } else if (myTurn == 5) {
                myChoice = "Zombie";
            } else {
                myChoice = "unknown";
            }

            String compChoice = "";
            if (computer == 1) {
                compChoice = "Monkey";
            } else if (computer == 2) {
                compChoice = "Robot";
            } else if (computer == 3) {
                compChoice = "Pirate";
            } else if (computer == 4) {
                compChoice = "Ninja";
            } else if (computer == 5) {
                compChoice = "Zombie";
            } else {
                compChoice = "unknown";
            }

            //solution block.  logic used to determine winner of round  
            if ((myTurn == 1) && (computer == 4 || computer == 2)) {
                System.out.println(myChoice + " Beats " + compChoice + ". You win this round");
                myResults += 1;
                System.out.println("User Score " + myResults);

            } else if ((myTurn == 2) && (computer == 4 || computer == 5)) {
                System.out.println(myChoice + " Beats " + compChoice + ". You win this round");
                myResults += 1;
                System.out.println("User Score " + myResults);

            } else if ((myTurn == 3) && (computer == 2 || computer == 1)) {
                System.out.println(myChoice + " Beats " + compChoice + ". You win this round");
                myResults += 1;
                System.out.println("User Score " + myResults);

            } else if ((myTurn == 4) && (computer == 3 || computer == 5)) {
                System.out.println(myChoice + " Beats " + compChoice + ". You win this round");
                myResults += 1;
                System.out.println("User Score " + myResults);

            } else if ((myTurn == 5) && (computer == 3 || computer == 1)) {
                System.out.println(myChoice + " Beats " + compChoice + ". You win this round");
                //if (computer == 3 || computer == 1) {
                    myResults += 1;
                
                System.out.println("User Score " + myResults);

            } else // without bracket only includes first line. 
                {computerResults += 1;
                System.out.println("Computer Score " + computerResults);
            
                System.out.println(compChoice + " Beats " + myChoice + ". Computer wins this round");
            }
            
            System.out.print("\n");
        }

//print winner outside of for statement. 


        System.out.println("Final Results");
        System.out.println("You won " + myResults + " rounds. Computer won " + computerResults + " rounds");

    }

}
