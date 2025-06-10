/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expression;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Expression {

    static boolean arePairs(char open , char close){
        if(open=='('&&close==')')
            return true ;
        else if (open=='{'&&close=='}')
            return true;
        else if(open=='['&&close=='}')
            return true ;
        return false;
    }
    
    static boolean areBalanceds(String exp){
        Stack<Character> stack = new Stack();
        char array [] = exp.toCharArray();
        for (int i = 0; i <array.length; i++) {
            if(array[i]=='(' || array[i]=='{' || array[i]=='['){
                stack.push(array[i]);
            }
            else if(array[i]==')' || array[i]=='}'|| array[i]==']'){
                if(stack.isEmpty() || !arePairs( stack.peek() ,array[i])){
                    return false ;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Expression");
        String exp = in.nextLine();
        areBalanceds(exp);
        if(areBalanceds(exp)){
            System.out.println("The expression is balanced.");
        }
        else{
            System.out.println("The expression is NOT balanced.");
        }
        
    }
    
}
