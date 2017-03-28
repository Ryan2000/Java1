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

/**
 *
 * @author ryanhoyda
 */
public class methodsagain {


    public static void main(String[] args) {
        
       
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
       int highScore = calculateScore(gameOver, score, levelCompleted, bonus); //when enters this portion of code jumps to end calculateScore and when it gets to end and then jumps back up and runs 
       // second part. 
       System.out.println("Your final score was " + highScore);
       
       score = 10000;
       levelCompleted = 8;
       bonus = 200;
       
       
       highScore = calculateScore(gameOver, score, levelCompleted, bonus);
       System.out.println("Your final score was " + highScore);
          
    } 
   
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
 
       
       if(gameOver){
           int finalScore = score + (levelCompleted * bonus);
           finalScore += 2000;
           
           return finalScore;
       } else
           return -1; 
    }
    
}

