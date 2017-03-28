/*
Name: Ryan Hoyda
Assignment: #0
*/

package charandboolean;


public class Methods {


    public static void main(String[] args) {
        
       
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
       calculateScore(gameOver, score, levelCompleted, bonus); //when enters this portion of code jumps to end calculateScore and when it gets to end and then jumps back up and runs 
       // second part. 
       
       score = 10000;
       levelCompleted = 8;
       bonus = 200;
       
       
       calculateScore(gameOver, score, levelCompleted, bonus);

          
    } 
   
    
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
 
       
       if(gameOver){
           int finalScore = score + (levelCompleted * bonus);
           finalScore += 2000;
           System.out.println("Your final score was " + finalScore);
           return finalScore;
       } else
           return -1; 
    }
    
}

// must come back and finish. 