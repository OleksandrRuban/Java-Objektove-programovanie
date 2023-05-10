/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author vdi-terminal
 */
public class JavaApplication4 {

    
    public static void main(String[] args) {
        int i = 6;
        int n = 0;
        
        try{
           if (n==0){
           throw  new hej();    
           }
           int v = i/n;
        }
        catch(hej e){
            System.out.print("you cant do this ");
        }
    }
    
}
