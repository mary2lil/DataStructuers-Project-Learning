/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task.manager;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Manager {
    Scanner in = new Scanner(System.in);
    private LinkedList<Task> tasks = new LinkedList<>();
    
    public void addTask(){
        System.out.println("Enter name task");
        String name = in.nextLine();
        
        System.out.println("Enter implementation date");
        String date = in.nextLine();
        
        tasks.add(new Task(name, false, date));
    }
    
    public void displayAll(){
        if(tasks.isEmpty()){
            System.out.println("You don't have any task");
            return;
        }
        int count = 1 ;
        System.out.println("===============All your tasks=============");
       for(Task task : tasks){
           System.out.println(count+"."+task.toString());
           count++;
       }
        System.out.println("===========================================");
    }
    
    public void deleteTask(){
        if(tasks.isEmpty()){
            return;
        }
        System.out.println("Enter name task");
        String name = in.nextLine().trim();
        
        boolean found = false;
        Iterator<Task> iterator = tasks.iterator();
         while(iterator.hasNext()){
             Task task = iterator.next();
             if(task.getName().equalsIgnoreCase(name)){
                 iterator.remove();
                 System.out.println("Task \"" + name + "\" deleted successfully.");
                 found=true;
                 break;
             }
         }
         if(!found){
             System.out.println("You don't have task has this name ");
         }
    }
    
    public void markAsCompleted(){
        System.out.println("Enter name task");
        String name = in.nextLine().trim();
        boolean found = false ;
        
        for(Task task : tasks){
          if(task.getName().equalsIgnoreCase(name)){
              task.setComletion_status(true);
              System.out.println("Task \"" + name + "\" marked as completed.");
              found=true;
              break;
          }
       }
         if(!found){
             System.out.println("You don't have task has this name ");
         }
    }
    
    public void reverseOrder(){
         if (tasks.isEmpty()) {
        System.out.println("You don't have any tasks to reverse.");
        return;
    }
         Collections.reverse(tasks);
         System.out.println("Tasks reversed successfully.");
    }
    
    public void deleteAll(){
        if(tasks.isEmpty()){
            return;
        }
        tasks.clear();
    }
    
    public void DeleteAllCompleted(){
        if (tasks.isEmpty()) {
        System.out.println("No tasks to delete.");
        return;
    }
        
        Iterator<Task> iterator = tasks.iterator();
        int count = 0;
         while(iterator.hasNext()){
             Task task = iterator.next();
             if(task.isComletion_status()){
                 iterator.remove();
                 count++;
             }
         }
         if(count==0){
             System.out.println("No completed tasks found.");
         }
         else{
             System.out.println(count + " completed task(s) deleted.");
         }
    }
    
    public void searchTaskByName (){
        if (tasks.isEmpty()) {
        System.out.println("No tasks to search.");
        return ;
    }
        System.out.println("Enter name task");
        String name = in.nextLine().trim();
        
        for(Task task : tasks){
          if(task.getName().equalsIgnoreCase(name)){
             System.out.println("Task found:");  
              System.out.println(task.toString());
              return;
          }
    }
    System.out.println("Task with that name not found.");
}
    
    public void saveToFile(){
       try(BufferedWriter writeTask = new BufferedWriter(new FileWriter("Task.txt")); ){
        for(Task task : tasks){
            writeTask.write(task.getName()+","+task.isComletion_status()+","+task.getImplementation_date());
            writeTask.newLine();
        }
    }catch(IOException e){
           System.out.println(e.getMessage());
}
    }
    
    public void loadFromFile() throws FileNotFoundException, IOException{
       try( BufferedReader readTasks = new BufferedReader(new FileReader("Task.txt"));){
        String line;
        while((line=readTasks.readLine())!=null){
            String parts[]=line.split(",");
            if(parts.length>=3){
                String name=parts[0];
                 boolean status = Boolean.parseBoolean(parts[1]);
                String date = parts[2];
               
                tasks.add(new Task(name, status , date));
            }
        }
       
    }catch(FileNotFoundException e){
           System.out.println(e.getMessage());
    }catch(IOException e){
           System.out.println(e.getMessage());
    }
}
}