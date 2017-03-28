/*
Name: Ryan Hoyda
Assignment: #0
*/

import java.util.Scanner;
public class PigLatin {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = "";
        
        do {
            System.out.print("Enter word (q to quit): ");
            word = in.nextLine();
            String pig;
            
            char first = word.charAt(0);
            if (first == 'a' || first =='e'||first =='i'|| first =='o'||first =='u'){
                pig = word + "way";
            }
            else {
                pig = word.substring(1) + first + "ay";
            }
            System.out.println(pig);
            
        } while (!word.equals("q"));
    }
}


