/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtuesday;

/**
 *
 * @author ryanhoyda
 */
public class DriverLicense extends IdCard {
    
   private int expYear;
   
   public DriverLicense(String name, String id, int expYear){ 
       super(name, id);
       System.out.println("DriverLicense");
       this.expYear = expYear;
   }

    public int getExpYear() {
        return expYear;
    }

    public void setExpYear(int expYear) {
        this.expYear = expYear;
    }
   
   public String toString() {
       return "DriverLicense: " + super.toString() + ", expYear=" + expYear;
   }
   
}
