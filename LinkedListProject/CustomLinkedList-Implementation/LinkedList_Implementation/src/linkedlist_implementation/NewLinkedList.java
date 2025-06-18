/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package linkedlist_implementation;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class NewLinkedList<T> implements Iterable<T>{
    
    private Node head ;
    private Node tail ;
    private int length ;
    
    public boolean isEmpty(){
        return head ==null;
    }
    
    public void addFirst(T element){
        Node<T> newNode =  new Node<>(element);
        if(isEmpty()){
            head=tail=newNode;
            newNode.next=null;
        }
        else{
             newNode.next=head;
             head=newNode;
        }
        length++;
    }
    
    public void addLast(T element){
        Node<T> newNode = new Node<>(element);
        if(isEmpty()){
            head=tail=newNode;
        }
        else{
           tail.next=newNode;
           tail=newNode;
        }
        length++;
    }
    
    public void addAt(int index , T element){
        if(index<0||index>length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index==0){
            addFirst(element);
            return;
        }
        if(index==length){
            addLast(element);
            return;
        }
        Node<T> newNode = new Node<>(element);
        Node<T> curr=head;
        for (int i = 0; i <index-1; i++) {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
        length++;
    }
    
    public void removeFirst(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList is empty");
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
        }
        length--;
    }
    
    public void removeLast(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList is empty");
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            Node<T> curr=head;
            while(curr.next!=tail){
                curr=curr.next;
            }
            curr.next=null;
            tail=curr;
        }
        length--;
    }
    
    public void removeAt(int index){
        if(index<0||index>=length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index==0){
            removeFirst();
            return;
        }
        if(index==length-1){
            removeLast();
            return;
        }
        Node<T> curr=head;
        for (int i = 0; i <index-1; i++) {
            curr=curr.next;
        }
        curr.next=curr.next.next;
        length--;
    }
    
    public int index(T element){
        if(isEmpty()){
            return -1;
        }
        int pos = 0;
        Node<T> curr=head;
        while(curr!=null){
            if(curr.data.equals(element)){
                return pos ;
            }
            curr=curr.next;
            pos++;
        }
        return -1;
    }
    
    public boolean contains(T element){
       return index(element)!=-1 ;
    }
    
    public void clear(){
        head=null;
        tail=null;
        length=0;
    }
    
    public void reverse(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList is empty");
        }
        Node<T> curr=head;
        Node<T> prev = null ;
        Node<T>next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr=next;
        }
        tail = head;
        head=prev;
    }
    
    public int size(){
        return length;
    }
    
    public T getIndex(int index){
        if(index<0||index>=length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> curr =head ;
        for (int i = 0; i <index; i++) {
            curr=curr.next;
        }
        return curr.data ;
    }
    
    public void set(int index , T newElement){
        if(index<0||index>=length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> curr =head;
        for (int i = 0; i <index; i++) {
            curr=curr.next;
        }
        curr.data=newElement;
    }
    
    public Object getFirst(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList is empty");
        }
        return head.data;
    }
    
     public Object getLast(){
        if(isEmpty()){
            throw new RuntimeException("LinkedList is empty");
        }
        return tail.data;
    }
     
     public void display(){
         if(isEmpty()){
             System.out.println("LinkedList is empty");
             return;
         }
         Node<T> curr = head ;
         System.out.print("[");
         while(curr!=null){
             System.out.print(curr.data);
             curr=curr.next;
             if(curr!=null){
                 System.out.print(" , ");
             }
         }
         System.out.print("]");
     }
    
    public Object[] toArray(){
        Object[] array = new Object[length];
        Node<T> curr = head;
        for (int i = 0; i <length; i++) {
            array[i]=curr.data;
            curr=curr.next;
        }
        return array;
    }
    
    public ArrayList<T> toArrayList(){
        if(isEmpty()){
             System.out.println("LinkedList is empty");
             return new ArrayList<>();
         }
        ArrayList<T> newArrayList = new ArrayList<>();
        Node<T> curr = head;
        while(curr!=null){
            newArrayList.add(curr.data);
            curr=curr.next;
        }
        return newArrayList;
    }
    
    public Iterator<T> iterator(){
      return toArrayList().iterator();
    }
}
