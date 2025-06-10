/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class CallStack<T> {
    
    Node<T> top;

    public void push(T name){
        Node<T> newNode = new Node<>(name);
        newNode.node = top;
        top = newNode;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public T pop(){
        if(isEmpty()){
           throw new RuntimeException("Stack is empty");
        }
        T temp = top.data;
        top = top.node;
        return temp;
    }

    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return top.data;
    }

    public void display(){
       Node<T> curr = top;
        while(curr != null){
            System.out.println(curr.data);
            curr = curr.node;
        }
    }

    public int size(){
         Node<T> curr = top;
         int count = 0 ;
         while(curr != null){
             count++;
             curr = curr.node;
         }
         return count;
    }

    public void clear(){
        top = null;
    }

    public int search(T item){
        Node<T> curr = top;
        int count = 1;
        while(curr != null){
            if(curr.data != null && curr.data.equals(item)){
                return count;
            }
            curr = curr.node;
            count++;
        }
        return -1;
    }

    public List<T> peekAll(){
        ArrayList<T> list = new ArrayList<>();
        Node<T> curr = top;
        while(curr != null){
            list.add(curr.data);
            curr = curr.node;
        }
        return list;
    }

    public boolean contains(T item){
        Node<T> curr = top;
        while(curr != null){
            if(curr.data != null && curr.data.equals(item)){
                return true;
            }
            curr = curr.node;
        }
        return false;
    }

    public void reverseForPrint(){
        ArrayList<T> temp = new ArrayList<>();
        Node<T> curr = top;
        while(curr != null){
          temp.add(curr.data);
          curr = curr.node;
        }
        Collections.reverse(temp);
        for(T name : temp){
           System.out.println(name);
        }
    }

    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        Node<T> curr = top;
        while(curr != null){
            stringBuilder.append(curr.data).append(" , ");
            curr = curr.node;
        }
        return stringBuilder.toString();
    }
}
