/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import java.util.ArrayList;

/**

 */
public class Movie {  //class
    public enum GENRE {COMEDY, DRAMA, SCIFI, HORROR, FAMILY} // enumeration name is always in all caps = constanct
    //enum contains type and only those varibles
    
    private static int lastAssignedId = 110;  //class variable
    
    
    //instance variables
    private String title;
    private String synopsis;
    private int id;    //did not create a value of instance variable id so can not be manipulated
    private GENRE genre;  //type is GENRE, variable is genre
    private Person director;
    private ArrayList<Person> cast = new ArrayList<>();
            

    //instance methods
    
    public Movie () { //default constructor 
        lastAssignedId++;
        id = lastAssignedId;
    }
    
    public Movie(String title) {  //constructor
    this();
    this.title = title;
    }
    
    
    public Movie(String title, GENRE genre){  //constructor *right click can be used to generate constructors
        this(title);
        //this.title = title;
        this.genre = genre;
    }
    
    public Person getDirector() { //getter
        return director;
    }
    
    public void setDirector(Person director){  //setter
        this.director = director;
    }
    
    public int getID() {  //getter 
        return id;
    }
    
    public ArrayList<Person> getCast() { //getter
        return cast;
    }
    
    public void addCast(Person p){ //
        cast.add(p);
    }
    

    public String getTitle() {  //getter  *right click select getter and setter
        return title;
    }

    public void setTitle(String title) {  //setter
        this.title = title;
    }
    
    public String getSynopsis() { //getter
        return synopsis;
    }
    
    public void setSynopsis(String synopsis) {  //instance method
        this.synopsis = synopsis;
    }
    
    public GENRE getGenre() { //getter
        return genre;
    }

    public void setGenre(GENRE genre) {  //setter
        this.genre = genre;
    }
    
    public String toString() {  //unique method used during concatenation 
        return "[" + id + "]" + title + ":" + genre;
    }
    
    public boolean stars(Person p) {
        return cast.contains(p);
    }
    
}
