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
public class VipPerson {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson() {
        this("Defaul name", 50000.0, "default@gmail.com");
    }

    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    
    
}
