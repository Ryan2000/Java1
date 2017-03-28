/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaletter;


public class Address {
    
    //instance variables
    private int streetNumber;
    private int apartmentNumber;
    private int zipCode;    
    private String streetName;  
    private String city;
    private String state;


    
    public Address(int streetNumber, int zipCode, String streetName, String city, String state) {
        this.streetNumber = streetNumber;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }

    public Address(int streetNumber, int apartmentNumber, int zipCode, String streetName, String city, String state) {
        this.streetNumber = streetNumber;
        this.apartmentNumber = apartmentNumber;
        this.zipCode = zipCode;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }
    //this(streetNumber, streetName, city, state, zipCode);
    //this(apartmentNumber);

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public String toString() {
        String value = streetNumber + " " + streetName.toUpperCase();
        if (apartmentNumber !=0) {
            value += "APT " + apartmentNumber;
        }
        value += "\n" + city.toUpperCase() + "   " + state.toUpperCase() + "  " + zipCode;
        return value;
    }
    
}






