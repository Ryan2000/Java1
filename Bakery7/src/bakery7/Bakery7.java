/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



package bakery7;

/**
 *
 * @author ryanhoyda
 */
import java.util.ArrayList;
import java.util.Collections;

public class Bakery7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String space = "\n\n";
        
        System.out.println("GOOD MORNING JAVA BAKERY!");
        System.out.println("INVENTORY MANAGEMENT SYSTEM");
        System.out.println();
        

//        //Create inventory of cakes and cookies
//        ArrayList<BakeryItem7> inventory = new ArrayList<>();
//        inventory.add(new Cake7("Hulk's Cake", 5, Cake7.CAKE_TYPE.BIRTHDAY));
//        inventory.add(new Cake7("Thor Cake", 3, Cake7.CAKE_TYPE.WEDDING));
//        inventory.add(new Cookie7("Tony's Chocolate Chip Cookies", 48));
//        inventory.add(new Cookie7("Steve's Sugar Cookies", 36));
//
//        //Show Inventory of created goods
//        print(inventory);
//        System.out.println();
//
//        //Sell some inventory
//        System.out.println("SELLING BAKED GOODS:");
//        inventory.get(0).sell(2); // sell 2 Hulk Cakes
//        inventory.get(1).sell(1); // sell 1 Thor Cake
//        inventory.get(2).sell(2); // sell 2 bags of Tony's Chocolate Chip Cookies
//        inventory.get(3).sell(3); // sell 3 bags of Steve's Sugar Cookies
//        inventory.get(3).sell(4); // attempt to sell 4 bags of Steve's Sugar Cookies but fail!
//        System.out.println();
//
//        //Show Inventory of goods after sales
//        print(inventory);
//        System.out.println();
//
//    }
//
//    // print out the inventory
//    private static void print(ArrayList<BakeryItem7> inventory) {
//        System.out.println("TOTAL INVENTORY:");
//        for (BakeryItem7 item : inventory) {
//            System.out.println(item);
//        }
//    }
//
//    
//    
//    
//    
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



ArrayList<Cookie7> cookie = new ArrayList<>();
cookie.add(new Cookie7("Steve's cookies", 5, Cookie7.COOKIE_TYPE.SUGAR));
cookie.add(new Cookie7("Ryan's cookies", 5, Cookie7.COOKIE_TYPE.SPRINKLES));
cookie.add(new Cookie7("Trump's cookies", 5, Cookie7.COOKIE_TYPE.VANILLA));
cookie.add(new Cookie7("Clinton's cookies", 5, Cookie7.COOKIE_TYPE.SUGAR));
cookie.add(new Cookie7("Margaret Thatcher's cookies", 5, Cookie7.COOKIE_TYPE.CHOCOLATECHIP));

for (Cookie7 cookies: cookie) {
   System.out.println(cookie + "\n"); 

}
Collections.sort(cookie); 
for (Cookie7 cookies: cookie) {
   System.out.println(cookie + "\n");

} 
Collections.shuffle(cookie);
for (Cookie7 cookies: cookie) {
   System.out.println(cookie + "\n");
}

System.out.println(space);

ArrayList<Cake7> cakes = new ArrayList<>();
cakes.add(new Cake7("Hulk's Cake", 5, Cake7.CAKE_TYPE.BIRTHDAY));
cakes.add(new Cake7("Thor Cake", 3, Cake7.CAKE_TYPE.BIRTHDAY));
cakes.add(new Cake7("Iron Man's Cake", 2, Cake7.CAKE_TYPE.WEDDING));
cakes.add(new Cake7("Ryan's Cake", 5, Cake7.CAKE_TYPE.BIRTHDAY));
cakes.add(new Cake7("Bob's Cake", 3, Cake7.CAKE_TYPE.BIRTHDAY));
cakes.add(new Cake7("Shane's Cake", 2, Cake7.CAKE_TYPE.WEDDING));
cakes.add(new Cake7("John's Cake", 5, Cake7.CAKE_TYPE.BIRTHDAY));
cakes.add(new Cake7("Batman's Cake", 3, Cake7.CAKE_TYPE.DIVORCE));
cakes.add(new Cake7("Superman's Cake", 2, Cake7.CAKE_TYPE.BACHELORPARTY));
cakes.add(new Cake7("Captain Marvel's Cake", 5, Cake7.CAKE_TYPE.RETIREMENT));
cakes.add(new Cake7("Spiderman's Cake", 3, Cake7.CAKE_TYPE.DIVORCE));
cakes.add(new Cake7("Wonder Woman's Cake", 2, Cake7.CAKE_TYPE.WEDDING));


for (Cake7 cake: cakes) {
   System.out.println(cake + "\n"); 

}
Collections.sort(cakes); 
for (Cake7 cake: cakes) {
   System.out.println(cake + "\n");
} 
Collections.shuffle(cakes);
for (Cake7 cake: cakes) {
   System.out.println(cake + "\n");
}

System.out.println(space);
        
    }
    
}

