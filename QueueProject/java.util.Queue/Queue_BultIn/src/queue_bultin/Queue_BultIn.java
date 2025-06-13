/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_bultin;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author HP
 */
public class Queue_BultIn {
  static int number_of_documents=0;
   static void menu() {
    System.out.println("===========================================");
    System.out.println("Select an option:");
    System.out.println("1. Add a new document");
    System.out.println("2. Print a document");
    System.out.println("3. Show all documents");
    System.out.println("4. Show number of documents waiting to print");
    System.out.println("5. Show the first document in queue");
    System.out.println("6. Clear all documents");
    System.out.println("7. Show number of printed documents");
    System.out.println("8. Exit");
}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue<Document>documents = new LinkedList<>();
        while(true){
            try{
            menu();
            int choose = in.nextInt();
            if(choose==8){
                System.out.println("Good bye");
                return;
            }
            in.nextLine();
            switch(choose){
                case 1:{
                    System.out.println("Enter the document name:");
                    String name = in.nextLine();
                    documents.add(new Document(name));
                   System.out.println("Document added successfully.\n");
                    break;
                }
                
                case 2:{
                    if(documents.isEmpty()){
                        System.out.println("No documents to print.");
                        break;
                    }
                   Document printedDoc = documents.remove();
                   number_of_documents++;
                   LocalDateTime now = LocalDateTime.now();
                   
                   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                   
                   String formattedDate = now.format(formatter);
                   
                  System.out.println("Printing: " + printedDoc);
                  System.out.println("Printed at: " + printedDoc.timestamp.format(formatter));
                   break;
                }
                case 3:{
                    if(documents.isEmpty()){
                    System.out.println("No documents in the queue.");
                    break;
                    }
                   System.out.println("\nDocuments in the queue: " + documents);
                   break;
                }
                case 4 :{
                    System.out.println("Documents waiting to print: " + documents.size());
                    break;
                }
                case 5 :{
                    if(documents.isEmpty()){
                   System.out.println("The queue is empty.");
                        break;
                    }
                     System.out.println("First document in queue: " + documents.peek());
                    break;
                }
                case 6 :{
                    documents.clear();
                    System.out.println("All documents cleared from the queue.");
                    break;
                }
                case 7 :{
                    System.out.println("Total documents printed: " + number_of_documents);
                    break;
                }
                default:{
                   System.out.println("Invalid choice. Please try again.");
                }
            }
        }catch(InputMismatchException e){
                 System.out.println("Invalid input. Please enter a number.");
                in.nextLine();
        }catch(Exception e){
                System.out.println("An error occurred: " + e.getMessage());
        }
        }
    }
    
}
