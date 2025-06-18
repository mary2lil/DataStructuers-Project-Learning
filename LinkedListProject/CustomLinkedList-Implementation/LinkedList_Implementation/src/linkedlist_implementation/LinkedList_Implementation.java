/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlist_implementation;

/**
 *
 * @author HP
 */
public class LinkedList_Implementation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewLinkedList<String> names = new NewLinkedList<>();
        names.addFirst("Maryam");
        names.addLast("Bushra");
        names.addAt(1, "Sara");
        
        names.removeFirst();
        
        names.display();
        
        names.reverse();
    }
    
}
