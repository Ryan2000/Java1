/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;


public class Outlander extends car {
    
    private int roadServiceMonths;

    public Outlander(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    
    public void accelerate(int rate) {
        
        int newVelocity = getCurrentVelocity() + rate; 
        if(newVelocity ==0) {
            stop();    
        } else if(newVelocity > 0 &&)
    }
    
}
