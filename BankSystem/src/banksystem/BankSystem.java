/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banksystem;

/**
 *
 * @author ryanhoyda
 */
public class BankSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Account ryansAccount = new Account(); //("12345", 0.00, "Bob Brown", "ryanhoyda@gmail.com", "219.781.3292");  //calling the constructor, adding parameters
        /*
        ryansAccount.setAccountNumber("12345");
        ryansAccount.setAccountBalance(0.00);
        ryansAccount.setCustomerName("Ryan Hoyda");
        ryansAccount.setCustomerEmailAddress("ryanhoyda@gmail.com");
        ryansAccount.setCustomerPhoneNumber("219.781.3292");
        ryansAccount.withdrawal(100.0);
        */
        
        System.out.println(ryansAccount.getAccountNumber());
        System.out.println(ryansAccount.getAccountBalance());
        
        ryansAccount.deposit(50.0);
        ryansAccount.withdrawal(100.0);
        
        ryansAccount.deposit(51.0);
        ryansAccount.withdrawal(100.0);
        
        
        Account timsAccount = new Account("Tim", "Tim@gmail.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());
        System.out.println("Current balance is " + timsAccount.getAccountBalance());
        
        
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());
        
        VipPerson person2 = new VipPerson("bob", 25000.0);
        System.out.println(person2.getName());
        
        VipPerson person3 = new VipPerson("Tim", 100.0, "tim@gmail.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }

}
