/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_using_arraylist;

/**
 *
 * @author HP
 */
public class Stack_Using_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewStack <Integer> marks = new NewStack<>();
        marks.push(90);
        marks.push(95);
        marks.push(93);
        marks.push(85);
        
        marks.pop();
        
        System.out.println("Number of marks : "+marks.size());
        marks.display();
    }
    
}
