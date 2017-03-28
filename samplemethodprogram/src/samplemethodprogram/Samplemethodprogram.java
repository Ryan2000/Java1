/*
Name: Ryan Hoyda
Assignment: #0
*/



package samplemethodprogram;

import java.util.Scanner;

public class Samplemethodprogram {
    
    public static int atoi(String s){  //string to number converter.  takes a numerical string and converts to number format
        int length = s.length();       //atoi = alpha numeric to integer. 
        int result = 0;
        int power = length - 1;
    
        for (int i = 0; i < length; i++){
            char c = s.charAt(i);
            int num = c - '0';
            int p = (int) Math.pow(10, power);       //power takes 2 dboules and return double
            int value = num * p;
        
            System.out.println(num + "\t" + power + "\t" + p + "\t" + value);
            power--;
            result = result + value;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number: ");
        String myString = in.nextLine();
        
        int myInteger = atoi(myString);
        System.out.println(myString + "=" + myInteger);

        }
    }


