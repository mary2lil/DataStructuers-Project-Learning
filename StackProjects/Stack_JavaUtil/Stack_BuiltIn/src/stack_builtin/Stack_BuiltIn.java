/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack_builtin;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Stack_BuiltIn {

   
    
    static void printMenu(){
        System.out.println("============================");
System.out.println("1. Push a name");
System.out.println("2. Pop a name");
System.out.println("3. Search for a name from the top");
System.out.println("4. Show the top name");
System.out.println("5. Undo last removal");
System.out.println("6. Print all names in the stack");
System.out.println("7. Count the names");
System.out.println("8. Clear the stack");
System.out.println("9. Exit");
System.out.println("============================");
System.out.println("\nPlease enter a number:");
        
    }
    
    static void pushName( Stack<String> stack , Scanner in){
       System.out.println("Please enter a name:");
                    String name = in.nextLine();
                    stack.push(name);
                    System.out.println("The name has been added.");
    }

    static void popName(Stack <String>stack , Stack<String>undo){
        if(stack.isEmpty()){
                        System.out.println("Sorry, the stack is empty.");
                    }
                    else{
                       undo.push(stack.peek());
                    stack.pop();
                       System.out.println("The name has been removed."); 
                    }
    }
    
    static void searchName(Stack<String> stack , Scanner in){
        System.out.println("Please enter a name:");
                    String name = in.nextLine();
                    int number = stack.search(name);
                    if(number==-1){
                       System.out.println("The name '" + name + "' was not found.");
                    }
                    else{
                       System.out.println("The name '" + name + "' is at position " + number + " from the top.");
                    }
    }
   
    public static void main(String[] args) {
       Stack<String> stack = new Stack<>();
       Stack<String>undo = new Stack<>();
       Scanner in = new Scanner(System.in);
          System.out.println("Hello, and welcome to the Student Name Management System!");
      
        while(true){
            try{
            printMenu();
            int choose = in.nextInt();
            in.nextLine();
            if(choose==9){
                System.out.println("Good bye");
                return;
            }
            switch(choose){
                case 1 : {
                    pushName(stack, in);
                    break;
                }
                case 2 : {
                    popName(stack, undo);
                    break;
                }
                case 3 :{
                    searchName(stack, in);
                    break;
                }
                case 4 : {
                    if(stack.isEmpty()){
                        System.out.println("The stack is empty");
                    }else{
                        System.out.println("Top name: " +stack.peek());
                    }
                    break;
                }
                case 5 : {
                    if(undo.isEmpty()){
                        System.out.println("You can't undo.");
                    }
                    else{
                    stack.push(undo.peek());
                    undo.pop();
                    System.out.println(stack);
                    System.out.println("Undo successful.");
                    }
                    
                    break;
                }
                case 6 :{
                    System.out.println("Current stack: " + stack);
                    break;
                }
                case 7 : {
                    System.out.println("There are " + stack.size() + " names in the stack.");
                    break;
                }
                case 8 : {
                    stack.clear();
                   System.out.println("The stack has been cleared.");
                    break;
                }
                default:{
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }catch(InputMismatchException e){
                System.out.println("Invalid input. Please enter a valid number.");
                in.nextLine();
        }
        }
       
    }
    
}
