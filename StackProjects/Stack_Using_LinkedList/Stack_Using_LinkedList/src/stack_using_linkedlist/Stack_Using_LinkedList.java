/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_using_linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Stack_Using_LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CallStack<String> stack = new CallStack<>();

        stack.push("Maryam");
        stack.push("Ahmed");
        stack.push("Lina");

        System.out.println("Stack contents:");
        stack.display();

        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped: " + stack.pop());

        System.out.println("After pop, stack:");
        stack.display();
        
        System.out.println("Size : "+stack.size());
        
        System.out.println("Search name Maryam : "+stack.search("Maryam"));
    }
    
}
