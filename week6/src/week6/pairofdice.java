/*


 */
package week6;


public class pairofdice {
    private int die1;  //instance variables
    private int die2;  //instance variables
    
    public pairofdice() {  //default constructor 
        die1 = 0;
        die2 = 0;
    }
    
    public pairofdice(int die1, int die2) {  //constructor 
        this.die1 = die1;
        this.die2 = die2;
    }
    
    public void roll() {  //generates the roll   instance method
       die1 = (int) (Math.random() * 6) + 1;
       die2 = (int) (Math.random() * 6) + 1;
    }
    
    public boolean isDouble() {  //checks to see if values are same   instance method
       if (die1 == die2) {
           
           return true;
           
       }else {
           
            return false;
       } 
    }
    
    public String toString() {  //returns values to string    instance method
        return "[" + die1 + "," + die2 + "]";   //this format can be changed.  not rigid
    }
}
