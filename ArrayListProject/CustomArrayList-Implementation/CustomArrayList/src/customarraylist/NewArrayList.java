/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package customarraylist;

/**
 *
 * @author HP
 */
public class NewArrayList<T> {
    private int length;
    private int max_size;
    private T array [];

    public NewArrayList() {
        this.max_size=10;
        this.array=(T[]) new Object[max_size];
        this.length=0;
    }
    
    private void resize(){
        this.max_size=max_size*2;
        T newArray [] = (T[]) new Object[this.max_size];
        for(int i = 0; i <length; i++) {
            newArray[i]=array[i];
        }
        array=newArray;
    }
    
    public boolean isEmpty(){
        return length==0;
    }
    
    public boolean isFull(){
        return this.length==this.max_size;
    }
    
    public int size(){
        return this.length;
    }
    
    public void addElement(T element){
        if(isFull()){
            resize();
        }
        array[length]=element;
        length++;
    }
    
    
    public void addElement(int index , T element){
        if(index<0||index>this.length){
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        for (int i =this.length; i>index; i--) {
            array[i]=array[i-1];
        }
        array[index]=element;
        this.length++;
    }
    
    public void display(){
        if(isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.print("[");
        for (int i = 0; i <this.length; i++) {
            System.out.print(array[i]);
            if(i<this.length-1){
                System.out.print(" , ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
    
    public void remove(int index){
        if(index<0||index>=this.length){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        for (int i = index; i<this.length-1; i++) {
            array[i]=array[i+1];
        }
        array[this.length-1]=null;
        this.length--;
        
    }
    
    public void remove(){
        if(isEmpty()){
            throw new RuntimeException("List is empty");
        }
        array[this.length-1]=null;
        this.length--;
    }
    
    public int search(T element){
        if(isEmpty()){
            return -1 ;
        }
        for (int i = 0; i <this.length; i++) {
            if(array[i].equals(element)){
                return i ;
            }
        }
        return -1;
    }
    
    public T getIndex(int index){
        if(isEmpty()){
            return null ;
        }
        if(index<0||index>=this.length){
            throw new IndexOutOfBoundsException("Index is out of bounds");
        }
        return array[index];
    }
    
    public boolean contains(T element){
        for (int i = 0; i <this.length; i++) {
            if(array[i].equals(element)){
                return true ;
            }
        }
        return false;
    }
    
    public void clear(){
        for (int i = 0; i <this.length; i++) {
            array[i]=null;
        }
        this.length=0;
    }
    
    public int indexOfLast(){
        return this.length-1;
    }
}
