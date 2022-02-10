/*
 * Punit Pabla
 * Febuary 9 2022
 * Incometax.java 
 * Calculates your income tax depending on your income
 */
package incometax;
import java.util.Scanner;

public class Incometax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyedInput = new Scanner(System.in); 
        
        //Constants and variables stated 
        final double TAX_RATE = 5.05;
        double income;
        double incomeTax; 
       
        //user will see
        System.out.println("What is you salary?");
        income = keyedInput.nextDouble(); 
        
        //Calculations
        incomeTax = (income / 100)* TAX_RATE + income; 
        
        //user will see 
        System.out.println("The income tax you owe is:"+incomeTax);
    
    } 
}
