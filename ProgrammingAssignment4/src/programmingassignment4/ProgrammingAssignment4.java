/*
Name: Ryan Hoyda
Assignment: #4
Date: 7/31/2016
 */
package programmingassignment4;

import java.util.Scanner;
import java.util.*;

public class ProgrammingAssignment4 {

    //method - validateDate set to boolean. Pass in arguments year and month
    //determine if year and month are valid
    public static boolean validateDate(int year, int month) {
        if ((year < 1) || (year > 9999)) {
            return false;
        }
        if ((month < 1) || (month > 12)) {
            return false;
        }
        if (year <= 2016 && month <= 6) {
            return false;
        }
        return true;

    }

    public static boolean validateCreditCard(String creditCardNumber) {
        /*method validateCreditCard set to boolean.  Pass in argument creditCardNumber as String.
    Run intial check to ensure card number is not less than or greater 16.
    use for loop to cycle through the length of the creditCardNumber, however start at second to last number and work backwards
    place creditcardNumber in substring and convert to integer - go backwards from 2nd to last digit jumping every other number.
    alternate is equal to false.  If false take n and multiply by 2.  if n is greater than 9, then subtract by 9
    Set sum equal to n + sum.  Alternate does not equal false, return sum mod 10 equals 0 then true. 
         */
        int sum = 0;
        boolean alternate = false;
        if (creditCardNumber.length() != 16){
            return false;
        }
        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(creditCardNumber.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n -= 9;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static void main(String[] args) {
        //initially repurposed some code from DateValidation exercise.  
        Scanner in = new Scanner(System.in);

        //prompt credit card number
        System.out.print("Enter Credit Card Number: ");
        String creditCardNumber = in.nextLine();

        //prompt expiration month
        System.out.print("Enter Expiration Month: ");
        int month = in.nextInt();
        //prompt expiration year
        System.out.print("Enter Expiration Year: ");
        int year = in.nextInt();
        //print month and year
        //System.out.println(month + "/" + year);  --- no longer needed
        System.out.print("\n");

        //set boolean variable validCard equal to validateCreditCard method creditCardNumber
        boolean validCard = validateCreditCard(creditCardNumber);


        //set boolean variable validDate equal to method isValidDate year & month
        boolean validDate = validateDate(year, month);
        //System.out.println("is valid date? " + validDate);

        //combined logic in order to correspond with assigment output.  
        if (validCard == true && validDate == true) {
            System.out.println("Transaction data VALID");
        }
        if (validCard == false) {
            System.out.println("Credit Card Number is invalid");
            }
            if (validDate == false) {
            System.out.println("Credit Card has Expired");
        } 
        if (validDate == false || validCard == false)
            System.out.println("Transaction data NOT VALID");
        }

    }


