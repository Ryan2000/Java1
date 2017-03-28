/*
Name: Ryan Hoyda
Exercise week 3 
July 14, 2016
*/




import java.util.Scanner;
public class SmallDecisions {
    
public static void main(String[] args) {
        

    Scanner in = new Scanner(System.in);
    
    System.out.print("Enter x: ");
    int x = in.nextInt();
    System.out.print("Enter y: ");
    int y = in.nextInt();
    System.out.print("Enter z: ");
    int z = in.nextInt();
    
    if (x < y)
    {
        if (x < z)
        {
            System.out.println("x is the smallest");
        }
        else
        {
            System.out.println("z is teh smallest");
        }    
    }
    else
    {
        if (y < z) 
        {
            System.out.println("y is the smallest");
        }
    }   
        
        



    }

}
