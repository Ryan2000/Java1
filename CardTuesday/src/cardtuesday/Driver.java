/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cardtuesday;


public class Driver {


    public static void main(String[] args) {
        
        DriverLicense d1 = new DriverLicense("Charles", "B9062", 2020);
        IdCard id = new IdCard("Charles", "7864");
        
        System.out.println(d1);
        System.out.println(id);
    }

}
