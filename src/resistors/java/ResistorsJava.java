/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package resistors.java;

/**
 *
 * @author yohar3320
 */
import javax.swing.*;
public class ResistorsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String Colour[] = {"Black", "Brown", "Red", "Orange", "Yellow", "Green",
         "Blue","Violet","Grey" ,"White"};
         String  number[] = {"0","1","2","3","4","5","6","7","8","9"};

        String array [] [] = {Colour, number};
        
        //get user input 
        String input = JOptionPane.showInputDialog(null,"What is your Resistor's color code? \n"
        + "Separate each color by a comma \n ex: Red Pink Brown");
         int count [] = {0,0,0}; //used to count in the loop
        
        //categorize the colors and find numbers  
        String code []= input.split(" ");
        
        String ohm = "";
        for (int i =0; i <3; i++){
            
            System.out.println("ans " + code[i]);
            for (int n=0; n<9;n++){
               
                System.out.println("guess " + array[0][n]);
                
                if (code[i].equals(array[0][n])){
                    count[i]=n;
                }
             
             }}
        
        double result= Double.parseDouble(number[count[0]] + number[count[1]]) ;
        System.out.println(result);
        
        //output the result 
        System.out.println("You entered: " + input);
        System.out.println("The Ohm is"+result* Math.pow(10, Double.parseDouble(number[count[1]])));
  
    }}
    



