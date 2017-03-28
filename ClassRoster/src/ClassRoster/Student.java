/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassRoster;


public class Student {
    
    //instance variables
    protected String id;
    protected double gradePointAverage;
    protected String name;
    protected String email;
    
    public Student () {
        
    }
    
    public Student(String id, double gradePointAverage) {
        super();
    }

    public Student (String name, String email, String id, double gpa){
        super(name, email);
        
    }
            
    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }
    
    
    
}
