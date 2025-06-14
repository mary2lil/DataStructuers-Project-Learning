/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package customarraylist;

/**
 *
 * @author HP
 */
public class CustomArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewArrayList<Character> letters = new NewArrayList<>();
        
        letters.addElement('A');
        letters.addElement('C');
        letters.addElement('D');
        letters.display();
        
        letters.addElement(1,'B');
        letters.display();
        
        letters.remove();
        letters.remove(0);
        
        letters.contains('T');
        
        letters.clear();
    }
    
}
