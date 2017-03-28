/*
Name: Ryan Hoyda
Assignment: #0
*/



package controlflow;


public class Controlflow {


    public static void main(String[] args) {

        //int value = 3;
        //if(value == 1){
        //    System.out.println("Value was 1");
        //} else if (value == 2){
        //    System.out.println("Value was 2");
        //} else {
        //    System.out.println("Value was not 1 or 2");
        //}
        
        int switchValue = 3;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break; //break exits code block
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:    
                 System.out.println("was a 3, a 4, or a 5");
                 System.out.println("Actually it was a " + switchValue);
                 break;
                 
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        
        char charValue = 'G';
        switch(charValue) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
                
            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
    }
    
    String month = "JAnuary";
    switch(month.toLowerCase()) {
        case "january":
            System.out.println("Jan.");
            break;
        case "June":
            System.out.println("Jun");
            break;
        default:
            System.out.println("Not sure");
    }
    }

}
