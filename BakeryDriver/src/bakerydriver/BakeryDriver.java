/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bakerydriver;


import java.util.ArrayList;


/**
 * Driver class used to test bakery classes
 */


public class BakeryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Print output header
        System.out.println("GOOD MORNING JAVA BAKERY!");
        System.out.println("INVENTORY MANAGEMENT SYSTEM");
        System.out.println();

        //Create inventory of cakes and cookies
        ArrayList<BakeryItem> inventory = new ArrayList<>();
        inventory.add(new Cake("Hulk's Cake", 5, Cake.CAKE_TYPE.BIRTHDAY));
        inventory.add(new Cake("Thor Cake", 3, Cake.CAKE_TYPE.WEDDING));
        inventory.add(new Cookie("Tony's Chocolate Chip Cookies", 48));
        inventory.add(new Cookie("Steve's Sugar Cookies", 36));

        //Show Inventory of created goods
        print(inventory);
        System.out.println();

        //Sell some inventory
        System.out.println("SELLING BAKED GOODS:");
        inventory.get(0).sell(2); // sell 2 Hulk Cakes
        inventory.get(1).sell(1); // sell 1 Thor Cake
        inventory.get(2).sell(2); // sell 2 bags of Tony's Chocolate Chip Cookies
        inventory.get(3).sell(3); // sell 3 bags of Steve's Sugar Cookies
        inventory.get(3).sell(4); // attempt to sell 4 bags of Steve's Sugar Cookies but fail!
        System.out.println();

        //Show Inventory of goods after sales
        print(inventory);
        System.out.println();

    }

    // print out the inventory
    private static void print(ArrayList<BakeryItem> inventory) {
        System.out.println("TOTAL INVENTORY:");
        for (BakeryItem item : inventory) {
            System.out.println(item);
        }
    }

    
    
    
    
//ArrayList<Cake> cakes = new ArrayList<>();
//cakes.add(new Cake("Hulk's Cake", 5, Cake.CAKE_TYPE.BIRTHDAY));
//cakes.add(new Cake("Thor Cake", 3, Cake.CAKE_TYPE.BACHELOR_PARTY));
//cakes.add(new Cake("Iron Man's Cake", 2, Cake.CAKE_TYPE.WEDDING));
//for (Cake cake: cakes) {
//   System.out.println(cake); 
//}
//Collections.sort(cakes); 
//for (Cake cake: cakes) {
//   System.out.println(cake);
//} 
//Collections.shuffle(cakes);
//for (Cake cake: cakes) {
//   System.out.println(cake);
//} 
    
    
    
    

}
