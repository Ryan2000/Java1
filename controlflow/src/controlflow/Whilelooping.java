/*
Name: Ryan Hoyda
Assignment: #0
*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlflow;


public class Whilelooping {

 
    public static void main(String[] args) {
        
//        int count = 1;
//        while(count!=6){
//            System.out.println("count value is " + count);
//            count ++;
//        }  
//        
//        count = 1;
//        while(true){   //infinite loop by placing to true.  break out when equals 6 
//            if(count == 6){
//                break;
//            }
//            System.out.println("count value is " + count);
//            count++;
//        }
//        
//        count = 1;
//        do {
//            System.out.println("count value is " + count);
//            count++;
//            
//            if (count > 100){
//                break;
//            }
//        }while (count !=6);
//        
    
//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber){
//            if(!isEvenNumber(number)){
//                number ++;
//                continue;
//            }
//            System.out.println("Even number " + number);
//            number ++;
//            
//        }    
        
        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number ++;
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5){
                break;
            }
            System.out.println("Even number " + number);
            number ++;   
        }
        System.out.println("Total even numbers found =" + evenNumbersFound);
        
    }

    
    public static boolean isEvenNumber (int number){
        if ((number % 2) == 0) {
            return true;
        }else {
            return false;
        }
    }
    
    

}
    

    
 


