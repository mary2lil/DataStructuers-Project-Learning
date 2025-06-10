/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack_using_arraylist;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author HP
 */
public class NewStack <T>{
    int top;

    public NewStack() {
        this.top = -1;
    }
    
    
    ArrayList <T> stack = new ArrayList<T>();
    
    public void push(T item){
        top++;
        stack.add(item);
    }
    
    public boolean isEmpty(){
        return top<0;
    }
    
    public T pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        T element = peek();
        stack.remove(top);
        top--;
        return element;
    }
    
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(top);
    }
    
    public int size(){
       return top+1; 
    }
    
    public void clear(){
        stack.clear();
        top=-1;
    }
    
    public void display(){
        for (int i = top; i >-1; i--) {
            System.out.println(stack.get(i));
        }
    }
}
