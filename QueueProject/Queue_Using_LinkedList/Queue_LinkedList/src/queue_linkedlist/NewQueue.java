/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package queue_linkedlist;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class NewQueue<T> {
    
    private Node<T> front ;
    private Node<T> rear;
    private int size ;

    public NewQueue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    //Check if queue is empty
    public boolean isEmpty(){
        return front == null;
    }
    
   // Add element to the rear
    public void enqueue(T element){
        Node<T> newNode = new Node<>(element);
        if(isEmpty()){
            this.front=newNode;
            this.rear=newNode;
            size++;
            return;
        }
        this.rear.next=newNode;
        this.rear=newNode;
        size++;
    }
    
    //Remove element from the front
    public void dequeue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        this.front=this.front.next;
        size--;
    }
    
    //Return number of elements
    public int size(){
        return size ;
    }
    
    //View the front element
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return this.front.data;
    }
    
    //View the rear element
    public T getRear(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return this.rear.data;
    }
    
    //Clear the queue
    public void clear(){
        this.front=null;
        this.rear=null;
         this. size=0;
    }
    
    //display elements
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
            Node<T> curr = this.front;
            System.out.print("[");
            while(curr!=null){
                System.out.print(curr.data);
                curr=curr.next;
                if(curr!=null){
                    System.out.print(" ,");
                }
            }
            System.out.print("]");
    }
    
    //Check if element exists
     public boolean contains(T element){
         if(isEmpty()){
             throw new RuntimeException("Queue is empty");
         }
         Node<T> curr = this.front;
         while(curr!=null){
             if(curr.data.equals(element)){
                 return true ;
             }
             curr=curr.next;
         }
         return false;
     }
     
     //Return index of an element
     public int indexOf(T element){
         if(isEmpty()){
             throw new RuntimeException("Queue is empty");
         }
         Node<T> curr = this.front;
         int pos = 0;
         while(curr!=null){
             if(curr.data.equals(element)){
                 return pos ;
             }
             curr=curr.next;
             pos ++ ;
         }
         return -1 ;
    }
     
     //Convert the queue to `ArrayList
     public ArrayList<T> toArrayList(){
         ArrayList<T> newArrayList = new ArrayList<>();
         if(isEmpty()){
             return new ArrayList<>();
         }
         Node<T> curr = this.front;
         while(curr!=null){
             newArrayList.add(curr.data);
             curr=curr.next;
         }
         return newArrayList;
     }
     
     //Reverse the order of elements
     public void reverse(){
         Stack<T> stack = new Stack<>();
         if(isEmpty()){
             throw new RuntimeException("Queue is empty");
         }
         Node<T> curr = this.front;
         while(curr!=null){
             stack.push(curr.data);
             curr=curr.next;
         }
         clear();
         while(!stack.isEmpty()){
             enqueue(stack.pop());
         }
         
     }
     
     //Return a clone of the current queue
     public NewQueue<T> clone(){
         NewQueue<T> newQueue = new NewQueue<>();
         Node<T> curr=this.front;
         while(curr!=null){
             newQueue.enqueue(curr.data);
             curr=curr.next;
         }
         return newQueue;
     }
     
     //replace element
     public void replace(T oldElement , T newElement){
         if(isEmpty()){
             throw new RuntimeException("Queue is empty");
         }
         Node<T> curr = this.front;
         while(curr!=null){
             if(curr.data.equals(oldElement)){
                 curr.data=newElement;
                 return;
             }
             curr=curr.next;
         }
     }
}
