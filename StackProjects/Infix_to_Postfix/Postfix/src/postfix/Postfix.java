/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package postfix;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author HP
 */
public class Postfix {

      static int getPrecedence(char op){
        if(op=='+'||op=='-')
            return 1 ;
        if(op=='*'||op=='/')
            return 2 ;
        return-1;
    } 
    
     static String infixToPostfix(String exp){
        StringBuilder result = new StringBuilder();
        Stack <Character>stack = new Stack<>();
        char array[]=exp.toCharArray();
        for (int i = 0; i <array.length; i++) {
            char c = array[i];
            if(Character.isWhitespace(c)){
                continue;
            }
            if(Character.isLetterOrDigit(c)){
                result.append(c);
            }
            else if (c=='('){
                stack.push(c);
            }
            else if(c==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    result.append(stack.pop());
                    
                }
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }else{
                    throw new IllegalArgumentException("Invalid expression: mismatched parentheses.");
                }
                
            }
            else{
                while(!stack.isEmpty()&&getPrecedence(c)<=getPrecedence(stack.peek())){
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }
        return result.toString();
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Expression");
        String exp = in.nextLine();
        System.out.println("Infix Expression : "+exp);
        System.out.println("Postfix Expression : "+infixToPostfix(exp));
        
    }
    
}
