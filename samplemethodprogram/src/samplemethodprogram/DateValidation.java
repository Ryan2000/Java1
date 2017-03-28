/*
Name: Ryan Hoyda
Assignment: #0
*/


package samplemethodprogram;

import java.util.Scanner;

public class DateValidation {
    
    public static boolean isLeapYear(int year) {
        
    
        boolean result = false;   
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            result = true;
        }  
        System.out.println(result);
        return result;
    } 
    public static boolean isValidDate(int year, int month, int day) {
        if ((year < 1) || (year > 9999)){
            return false;
        }
        if ((month < 1) || (month > 12)){
            return false;
        }
        if (day < 1){
            return false;
        }
        if (month == 2){
            if (isLeapYear(year)){
                if (day > 29){
                    return false;
                }
            }else if (day > 28){ 
            return false;
            }
            
     }
    
     if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
         if (day > 31) {
             return false;
         }
     }
     
     if (month == 4 || month == 6 || month == 9 || month == 11){
         if (day > 30){
             return false;
         }
     }
     return true;
        
   }    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Month: ");
        int month = in.nextInt();

        System.out.print("Day: ");
        int day = in.nextInt();

        System.out.print("Year: ");
        int year = in.nextInt();

        System.out.println(month + "/" + day + "/" + year);

        boolean validDate = isValidDate(year, month, day);
        System.out.println("is valid date? " + validDate);

        boolean leapYear = isLeapYear(year);
        System.out.println("is leap year? " + leapYear);
        
    }

}
