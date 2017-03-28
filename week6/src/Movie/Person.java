/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

/**

 */
public class Person {  //class
    
    //instance variables
    private String name; 
    private String bio;

    
    //instance methods
    
    public Person() { //default constructor
    }

    public Person(String name) { //constructor
        this.name = name;
    }

    public String getName() {  //getter
        return name;
    }

    public void setName(String name) { //setter
        this.name = name;
    }

    public String getBio() { //getter
        return bio;
    }

    public void setBio(String bio) { //setter
        this.bio = bio;
    }

    public String toString() {  //toString method
        return name;
    }
    
}
