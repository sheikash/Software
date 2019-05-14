/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwarelec1array;

import java.util.Scanner;

/**
 *
 * @author ashasheikh
 */
public class SoftwareLec1Array {

   
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        char [] letterArray = new char[50];
        
        System.out.println("Please enter a string: ");
       // String userInput = scanner.nextLine();
        
        for(int i=0; i<10; i++){
            char c = scanner.next().charAt(0);
            letterArray[i] = c;
        }
        for (int i=0; i<10; i++){
            System.out.println(" " + letterArray[i]);
        }
        
    }
    
}
