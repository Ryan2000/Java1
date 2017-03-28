/*
Name: Ryan Hoyda
Assignment: #0
*/

//GradeBook

package samplemethodprogram;

import java.util.*;  //accesses a bunch of libraries

import java.util.ArrayList;
import java.util.Scanner;
public class Arrays {

    //public static int averageGrades(int[] grades){
    public static int averageGrades(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade: grades) {
            sum += grade;
        }
        //int average = sum / grades.length;
        int average = sum / grades.size();
        return average;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //int[] grades = new int[10];
        ArrayList<Integer> grades = new ArrayList<Integer>();
        
//        System.out.println("Please enter grades!");
//        
//        for(int i = 0; i < 10; i++ ) {  //for loops are perfect bc you know how many items are in an array
//            System.out.print("grades["+i+"]=");
//            //grades[i] = in.nextInt();
//            int g = in.nextInt();
//            grades.add(g);
//         
//        }
        int grade = 0;
        System.out.println("enter grades (-1 to quit):");
        do {
            grade = in.nextInt();
            if (grade != -1){
                
            }
            grades.add(grade);
        }while (grade != -1);

        
        System.out.println("your grades are:");
        for(int g: grades) {
            System.out.println(g);
            
        }
        System.out.println(grades);  
        
        
        int average = averageGrades(grades);
        System.out.println("average = " + average);
}

}
