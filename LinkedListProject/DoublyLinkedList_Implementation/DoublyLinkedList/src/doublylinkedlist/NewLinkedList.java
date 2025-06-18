/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublylinkedlist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author HP
 */
public class NewLinkedList<T> implements Iterable<T>{
    
    Node<T> head ;
    Node<T> tail;
    int length  ;
    
    public boolean isEmpty(){
        return head==null;
    }
    
    public void addFirst(T element){
        Node<T> newNode = new Node<>(element);
        if(isEmpty()){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head.prev=newNode;
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
          newNode.prev=tail;
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
        Node<T> newNode=new Node<>(element);
        Node<T> curr=head;
        for (int i = 0; i <index-1; i++) {
            curr=curr.next;
        }
         newNode.next=curr.next;
          newNode.prev=curr;
          curr.next.prev=newNode;
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
          head.prev=null;
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
           tail=tail.prev;
           tail.next=null;
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
        for (int i = 0; i <index; i++) {
            curr=curr.next;
        }
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
        length--;
    }
    
    public Object getFirst(){
        if(isEmpty()){
            throw new RuntimeException("LInkedList is empty");
        }
        return head.data;
           }
    
     public Object getlast(){
          if(isEmpty()){
            throw new RuntimeException("LInkedList is empty");
        }
        return tail.data;
           }
     
     public T[] toArray (){
         if(isEmpty()){
             return null;
         }
      Object[] array = new Object[length];
      Node<T> curr=head;
         for (int i = 0; i <length; i++) {
             array[i]=curr.data;
             curr=curr.next;
         }
         return (T[]) array;
     }
     
     public ArrayList toArrayList(){
         ArrayList<T> newArrayList = new ArrayList<>();
        Node<T> curr=head;
        while(curr!=null){
            newArrayList.add(curr.data);
            curr=curr.next;
        }
        return newArrayList;
     }
     
     public Iterator<T> iterator(){
         return toArrayList().iterator();
     }
     
     public void displayForward(){
         if(isEmpty()){
             System.out.println("LinkedList is empty");
             return;
         }
         Node<T> curr=head;
         System.out.print("[");
         while(curr!=null){
             System.out.print(curr.data);
             curr=curr.next;
             if(curr!=null){
                 System.out.print(" , ");
             }
         }
         System.out.print("]");
         System.out.println();
     }
     
     public void displayBackward(){
         if(isEmpty()){
             System.out.println("LinkedList is empty");
             return;
         }
         Node<T> curr=tail;
         System.out.print("[");
         while(curr!=null){
             System.out.print(curr.data);
             curr=curr.prev;
             if(curr!=null){
                 System.out.print(" , ");
             }
         }
         System.out.print("]");
         System.out.println();
     }
     
     public int getIndex(T element){
         if(isEmpty()){
             return -1;
         }
         Node <T> curr= head;
         int pos = 0;
         while(curr!=null){
             if(curr.data.equals(element)){
                 return pos;
             }
             curr=curr.next;
             pos++;
         }
         return -1;
     }
     
     public boolean contains(T element){
         return getIndex(element)!=-1;
     }
     
     public T getElement(int pos){
        if(pos<0||pos>=length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> curr=head;
         for (int i = 0; i <pos; i++) {
             curr=curr.next;
         }
         return curr.data;
     }
     
     public void set(int index, T element){
         if(index<0 || index>=length){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
         Node<T> curr=head;
         for (int i = 0; i <index; i++) {
             curr=curr.next;
         }
         curr.data=element;
     }
     
     public void clear(){
         head=null ;
         tail=null;
         length=0;
     }
     
     public int size(){
         return length;
     }
     
     public void reverse(){
         if(isEmpty()){
             throw new RuntimeException("LinkedList is empty");
         }
         Node<T> curr =  head;
         Node<T> temp = null;
         while(curr!=null){
             temp=curr.prev;
             curr.prev=curr.next;
             curr.next=temp;
             curr=curr.prev;
         }
        temp=head;
        head=tail;
        tail=temp;
         
     }
    
 
     public NewLinkedList<T> clone(){
         if(isEmpty()){
             throw new RuntimeException("LinkedList is empty");
         }
         NewLinkedList<T> newLinkedList = new NewLinkedList<>();
         Node<T> curr = head ;
         while(curr!=null){
             newLinkedList.addLast(curr.data);
             curr=curr.next;
         }
         return newLinkedList;
     }
     
     public void swap(int i, int j){
         if(i<0 ||i>=length || j<0 || j >= length){
             throw new IndexOutOfBoundsException("Index out of bounds");
         }
         if(i==j){
             return;
         }
         Node <T> curr_i = head;
         Node <T> curr_j = head;
         T element_i ;
         T element_j;
         for (int k = 0; k <i; k++) {
             curr_i=curr_i.next;
         }
        element_i= curr_i.data;
        
         for (int k = 0; k <j; k++) {
             curr_j=curr_j.next;
         }
        element_j= curr_j.data;
        curr_i.data=element_j;
        curr_j.data=element_i;
        
     }
     
     public boolean equals(NewLinkedList<T> other){
         if(other==this){
             return true ;
         }
         if(other==null){
              return false ;
         }
         if(this.length!=other.length){
             return false ;
         }
         Node <T> curr_this = head;
          Node <T> curr_other = other.head;
          while(curr_this!=null){
              if(! curr_this.data.equals(curr_other.data)){
                  return false;
              }
              curr_this=curr_this.next;
              curr_other=curr_other.next;
          }
          return true;
     }
}
