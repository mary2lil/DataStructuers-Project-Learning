/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist_builtin;

/**
 *
 * @author HP
 */
public class ArrayList_BuiltIn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1 = new Student("Maryam", "265422");
        s1.addMark(99);
        s1.addMark(97);
        s1.addMark(100);
        System.out.println("Max mark = "+s1.max_mark());
         System.out.println("Min mark = "+s1.min_mark());
         System.out.println("Avrage =  "+s1.avrage());
      
    }
    
}
