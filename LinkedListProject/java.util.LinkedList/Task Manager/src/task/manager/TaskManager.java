/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package task.manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class TaskManager {

    static void menu(){
        System.out.println("Enter number : ");
        System.out.println("1.Add task");
        System.out.println("2.Display all taks");
        System.out.println("3.Delete a task");
        System.out.println("4.Mark a task as complete");
        System.out.println("5.Reverse order");
        System.out.println("6.Delete all completed tasks");
        System.out.println("7.Search for a task by name");
        System.out.println("8.Delete all tasks");
        System.out.println("9.Exit");
    }
    public static void main(String[] args) throws IOException {
        
        Scanner in = new Scanner(System.in);
        Manager manger = new Manager();
        System.out.println("Welcome to Task Manger");
        manger.loadFromFile();
        while(true){
            try{
            menu();
            int choose = in.nextInt();
            in.nextLine();
            if(choose==9){
                manger.saveToFile();
                System.out.println("Thanks for using Task Manger , good bye");
                return;
            }
            
            switch(choose){
                case 1 : 
                    manger.addTask();
                    break;
                    
                     case 2 : 
                    manger.displayAll();
                    break;
                    
                     case 3 : 
                    manger.deleteTask();
                    break;
                    
                     case 4 : 
                    manger.markAsCompleted();
                    break;
                    
                     case 5 : 
                    manger.reverseOrder();
                    break;
                    
                     case 6 : 
                    manger.DeleteAllCompleted();
                    break;
                    
                     case 7 : 
                    manger.searchTaskByName();
                    break;
                    
                    case 8 : 
                    manger.deleteAll();
                    break;
                    
                    default:
                        System.out.println("Wrong enter please try again");
            }
            
        }catch(InputMismatchException e){
                System.out.println("Please enter valid data");
                in.nextLine();
        }
        }
        
    }
    
}
