/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circularqueue;

/**
 *
 * @author HP
 */
public class CircularQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NewQueue<String> q1 = new NewQueue<>(5);
        q1.enqueue("Maryam");
        q1.enqueue("Fatimah");
        q1.enqueue("Sara");
        q1.enqueue("Leen");
        
        q1.display();
        
        q1.dequeue();
        
        System.out.println("\n"+q1.contains("Leenn"));
        
        q1.replace("Maryam", "Shahad");
        
       System.out.println();
       q1.display();
       
       q1.reverse();
       
       System.out.println();
       q1.display();
    }
    
}
