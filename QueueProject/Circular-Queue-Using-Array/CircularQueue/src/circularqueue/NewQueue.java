/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package circularqueue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class NewQueue<T> implements Iterable<T>{
    
    private int front ; 
    private int rear ;
    private int count ;
    private int max_size ;
    private T array[];

    //Constractr
    public NewQueue(int max_size) {
        if(max_size<=0){
            this.max_size=100;
        }
        else{
            this.max_size=max_size;
        }
        this.array = (T[])new Object [this.max_size];
        this.front = 0;
        this.rear = max_size-1;
        this.count = 0;
      
    }
    
    //This method to know the queue is empty or not
    public boolean isEmpty(){
        return count ==0;
    }
    
    //This method to know is the queue is full or not
    public boolean isFull(){
        return count==max_size;
    }
    
    //This method to add new element to the queue
    public void enqueue(T element){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }
        rear=(rear+1)%max_size;
        array[rear]=element;
        count++;
    }
    
    //This method removes the front element from the queue 
    public void dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        array[front]=null;
        front=(front+1)%max_size;
        count--;
    }
    
     //This method display the front
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return array[front];
    }
    
    //This method display the rear
    public T getRear(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return array[rear];
    }
    
    //This method display the number of added elements 
    public int getSize(){
        return count;
    }
    
    // This method deletes all elements in queue
    public void clear(){
        this.array = (T[])new Object [this.max_size];
        this.front = 0;
        this.rear = max_size-1;
        this.count = 0;
    }
    
    //This method return the index of the element
    public int indexOf(T element){
        if(isEmpty()){
            return -1 ;
        }
        int i = front ;
         int positionFromFront = 0;
        do{
            if(array[i].equals(element)){
                return positionFromFront ;
            }
            i = (i+1)%max_size;
            positionFromFront++;
        }while(i!=(rear+1)%max_size);
        return -1;
        
    }
    
    //This method display all elements in queue
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            int i = front ;
            int elementsCounted = 0;
            System.out.print("[");
           while(elementsCounted<count){
               System.out.print(array[i]);
               if(elementsCounted< count-1){
                   System.out.print(" , ");
               }
               i=(i+1)%max_size;
               elementsCounted++;
           }
            }
            System.out.print("]");
        }
    
    //This method check if an element exists in queue or not
    public boolean contains(T element){
        int i = front ;
        do{
            if(array[i].equals(element)){
                return true ;
            }
            i=(i+1)%max_size;
        }while(i!=(rear+1)%max_size);
        return false ;
    }
    
    //This method make copy of the queue in arraylist
     public ArrayList<T> toArrayList(){
        ArrayList<T> newArray = new ArrayList<>();
        int i = front;
        int elementsCounted = 0;
        while(elementsCounted<count){
            newArray.add(array[i]);
            i=(i+1)%max_size;
            elementsCounted++;
        }
         return newArray;
    } 
     
     //This method make copy of the queue in array
     public T[] toArray(){
         T[] resalt = (T[]) new Object[count];
         int i = front ;
         for (int j = front; j < count; j++) {
             resalt[j]=array[i];
             i=(i+1)%max_size;
         }
         return resalt;
     }
     
     //This method reverse order queue
     public void reverse(){
         Stack <T> stack = new Stack<>();
         int i = front ;
         for (int j = 0; j <count; j++) {
              stack.push(array[i]);
             i=(i+1)%max_size;
         }
       clear();
       while(!stack.isEmpty()){
           enqueue(stack.pop());
       }
     }
     
     //This method make queue iterator
     @Override
     public Iterator<T> iterator(){
         return toArrayList().iterator();
     }
     
     //This method returnn the capacity of queue
     public int capacity(){
         return this.max_size;
     }
     
     //This method to replace element
     public void replace(T oldElement , T newElement){
         if(isEmpty()){
             System.out.println("The stack is empty");
             return;
         }
         int i = front ;
         int elementsCounted = 0;
         do{
             if(array[i].equals(oldElement)){
                 array[i]=newElement;
             }
                 i=(i+1)%max_size;
                 elementsCounted++;
         }while(elementsCounted<count);
     }
     
}
