/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author ACER
 */
public class CalculationFactory {
    CalculationCommands CalculationCommands = new CalculationCommands();
    public void calculator(int choice){
        if (choice==1){
            CalculationCommands.add();
        }
        else if (choice==2){
            CalculationCommands.subtract();
        }
         else if (choice==3){
            CalculationCommands.divide();
        }
         else if (choice==4){
            CalculationCommands.multiply();
        }
        else if (choice==5){
            CalculationCommands.power();
        }
        
        else if (choice==6){
            CalculationCommands.table();
        }
        
    }

   

}
