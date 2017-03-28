/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

/**
 *
 * @author ryanhoyda
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car porsche = new Car();  //new data type of type car
        Car holden = new Car(); 
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        
    }

}
