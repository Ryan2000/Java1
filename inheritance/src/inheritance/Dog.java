/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author ryanhoyda
 */
public class Dog extends Animal { 
    
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {  //generate constructor that pulls from animal class
        super(name, 1, 1, size, weight);   //super - call constructor from class we are extending from.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }   
    
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.est() called");
        chew();
        super.eat(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
    }
    
    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }
    
    
    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
