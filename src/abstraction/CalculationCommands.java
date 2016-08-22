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
public class CalculationCommands extends Calculator {

    int firstnum, secondnum;

public void Number(){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter first number");
    firstnum=input.nextInt();
    System.out.println("Enter second number");
    secondnum=input.nextInt();
}
    @Override
    public void add() {
        Number();
        System.out.println("sum of firstnum and secondnum is:"+(firstnum+secondnum));

    }

    @Override
    public void subtract() {
         Number();
        System.out.println("subtract of firstnum and secondnum is:"+(firstnum-secondnum));

    }

    @Override
    public void divide() {
         Number();
        System.out.println("Division result of firstnum and secondnum is:"+(firstnum/secondnum));
    }

    @Override
    public void multiply() {
         Number();
        System.out.println("multiply of firstnum and secondnum is:"+(firstnum*secondnum));
    }

    @Override
    public void power() {
        Number();
          System.out.println("powe=" + Math.pow(firstnum, secondnum));      
        
    }

    void table() {
        Number();
        int mul=1;
        int i;
        for(i=1;i<=secondnum;i++){
            
            System.err.println(+firstnum +"*" + i +"="+ mul);
        }
    }

}
