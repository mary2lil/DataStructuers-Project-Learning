/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_linkedlist;

/**
 *
 * @author HP
 */
public class Queue_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewQueue<String> queue = new NewQueue<>();
queue.enqueue("Apple");
queue.enqueue("Banana");
queue.enqueue("Cherry");

System.out.println(queue.peek());     
System.out.println(queue.getRear()); 

queue.reverse();
queue.display(); 

    }
    
}
