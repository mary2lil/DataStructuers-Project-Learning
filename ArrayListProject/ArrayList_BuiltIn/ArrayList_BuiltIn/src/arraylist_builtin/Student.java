/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist_builtin;

import java.util.ArrayList;
import java.util.InputMismatchException;

/**
 *
 * @author HP
 */
public class Student {
    private String name ;
    private String id ;
    private ArrayList<Double> grades = new ArrayList<>();

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
    
    public void addMark(double mark){
        if(mark>100||mark<0){
            throw new InputMismatchException("Wrong input");
        }
        grades.add(mark);
    }
    
    public double max_mark(){
        if (grades.isEmpty()) {
    throw new IllegalStateException("No grades available.");
                 }
        double max =  grades.getFirst();
        for(Double mark : grades){
            if(max<mark){
                max=mark;
            }
        }
        return max;
    }
    
    public double min_mark(){
        if (grades.isEmpty()) {
    throw new IllegalStateException("No grades available.");
                     }
        double min = grades.getFirst();
        for(Double mark : grades){
            if(min>mark){
                min=mark;
            }
        }
        return min;
    }
    
    public double avrage(){
        if (grades.isEmpty()) {
    throw new IllegalStateException("No grades available.");
              } 
        double avrage=0;
        double sum = 0;
        for(Double mark : grades){
            sum+=mark;
        }
        avrage=sum/grades.size();
        return avrage;
    }
    
    public Character getGradeLevel(){
        double avrage = avrage();
        if(avrage>=90){
            return 'A';
        }
        else if(avrage>=80){
            return 'B';
        }
        else if(avrage>=70){
            return 'C';
        }
        else if(avrage>=60){
            return 'D';
        }
        return 'F';
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", id=" + id + ", grades=" + grades + '}';
    }

    
    
    
}
