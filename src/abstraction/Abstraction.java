/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package abstraction;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        option();
        
        int choice;
        System.out.println("Enter your choice");
        choice=input.nextInt();
        
        CalculationFactory CalculationFactory= new CalculationFactory();
        CalculationFactory.calculator(choice);
    }
    public static void option(){
        System.out.println("1 for add");
        System.out.println("2 for subtract");
        System.out.println("3 for divide");
        System.out.println("4 for multiply");
         System.out.println("5 for power");
          System.out.println("6 for table");
    }
    
}
