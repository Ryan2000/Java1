/*
Name: Ryan Hoyda
Assignment: #5
August 16, 2016
*/


package javaletter;


public class JavaLetter { //Driver Program

    
    
    public static void main(String[] args) {
        
        String greeting = "Hello from Java!  Best wishes to you";
        String closing = "Sincerely,\n\nSteve Rogers";
        String space = "\n\n";
        
        
        Address address = new Address(1146, 90291, "Venice Blvd", "Venice", "CA");
        Customer customer1 = new Customer("Ryan", "Hoyda", address);
        
        Address address1 = new Address(1157, 90291, "Venice Blvd", "Venice", "CA");
        Customer customer2 = new Customer("Bill", "Johnson", address1);
        
        Address address2 = new Address(1179, 12, 90291, "Venice Blvd  ", "Venice", "CA");
        Customer customer3 = new Customer("Fred", "Savage", address2);

        
        System.out.println(customer1 + "\n\n"); // this should print the customer's name and address in all capitals.
        System.out.println("Dear " + customer1.getFirstName() + "\n");
        System.out.println(greeting + "\n");
        System.out.println(closing);
        System.out.println(space);
        
        System.out.println(customer2 + "\n\n"); // this should print the customer's name and address in all capitals.
        System.out.println("Dear " + customer2.getFirstName() + "\n");
        System.out.println(greeting + "\n");
        System.out.println(closing);
        System.out.println(space);
        
        System.out.println(customer3 + "\n\n"); // this should print the customer's name and address in all capitals.
        System.out.println("Dear " + customer3.getFirstName() + "\n");
        System.out.println(greeting + "\n");
        System.out.println(closing);
        System.out.println(space);
       
        
    }
    
    
}
