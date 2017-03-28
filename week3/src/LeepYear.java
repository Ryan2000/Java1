/*
Name: Ryan Hoyda
Assignment: #0
*/


import java.util.Scanner;
public class LeepYear {


    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.print("Please enter a four digit year: ");
     int year = in.nextInt();
     if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
        System.out.println("true");
     } else { 
        System.out.println("false");
     }
     
   }

}
