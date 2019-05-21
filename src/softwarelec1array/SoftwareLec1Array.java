/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PillBoxArray_Lec1;


/**
 *
 * @author ashasheikh
 */
public class PillBoxArray_Lec1 {

   
    public static void main(String[] args) {
       
      
        char[] pillBox=new char[7];
        pillBox[0]='s';
        pillBox[1]='t';
        pillBox[2]='u';
        pillBox[3]='d';
        pillBox[4]='e';
        pillBox[5]='n';
        pillBox[6]='t';
        
        for(int i=0;i<pillBox.length;i++)
        {
            System.out.print(pillBox[i]);
        }
            System.out.print("\n");
        
        for(int i=pillBox.length-1;i>=0;i--)
        {
            System.out.print(pillBox[i]);
        
        }
         System.out.print("\n");
        
    }
    
    
}
