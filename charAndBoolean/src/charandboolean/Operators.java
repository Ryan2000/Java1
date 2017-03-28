/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package charandboolean;


public class Operators {


    public static void main(String[] args) {
        int result = 1 + 2;
        
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        
        result = result *10;
        System.out.println(previousResult + " * 10 = " + result);
        
        previousResult = result;
        
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result); //remainder
        
        previousResult = result;
        result = result + 1;
        System.out.println("Result is now " + result);
        result++; //increment count result by 1 
        System.out.println("Result is now " + result);
        
        result--; //decrement by 1
        System.out.println("Result is now " + result);
        
        result += 2; //increment by 2
        System.out.println("Result is now " + result);
        
        result *= 10;  //mulitply result by 10 , result = result * 10
        System.out.println("Result is now " + result);
        
        result -= 10; //result - 10
        System.out.println("Result is now " + result);
        
        result /= 10; //result divided by 10
        System.out.println("Result is now " + result);
        
        
        //conditional code based on true false
        
        //boolean isAlien = false; //== is assignment operator
        //if (isAlien == false) // testing to see if particular value is false
            //System.out.println("It is not an alien!");  //prints out it is not an alien bc value was initially sent to false
        
        
        boolean isAlien = false; //== is assignment operator
        if (isAlien == true) // testing to see if particular value is false
            System.out.println("It is not an alien!"); // print nothing bc value has been changed to true
        
        
        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score!");
        
            
        int secondTopScore = 80;
        if ((topScore > secondTopScore) && (topScore < 100)) //&& and operator, both must be true
            System.out.println("Greater than second top score and less than 100");
        
        
        if ((topScore > 90) || (secondTopScore <= 90))  // || or opertor, one must be true
            System.out.println("One of these tests is true");
        
        
        int newValue = 50;
        if(newValue == 50)
            System.out.println("This is true");
        
        boolean isCar = false;
        if (isCar) 
            System.out.println("This is not supposed to happen!");
        
        
        isCar = true;
        boolean wasCar = isCar ? true : false; //shortcut way to set a value based on 2 diff conditions.  if isCar is evaluated to true, then return true, if not false
        if (wasCar)
            System.out.println("wasCar is true");
        
        
        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html operator summary
        
        
        
        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println("myTotal = " + myTotal);
        double theRemainder = myTotal % 40;
        System.out.println(theRemainder);
        if (theRemainder <= 20)
            System.out.println("Total was over the limit");
        
        
        //http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html  precedence table
        
        
        
    }

}
