/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.*;

/**
 *
 * @author logra
 */
public class UseGeometric2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square2 cuad1 = new Square2(5, 5);
        Triangle2 trian1 = new Triangle2(6, 8);
        
        Square2 cuad2 = new Square2(3, 3);
        Triangle2 trian2 = new Triangle2(7, 4);
        
        System.out.print(cuad1.toString());
        cuad1.displaySides();
        
        System.out.print(trian1.toString());
        trian1.displaySides();
        
        System.out.print(cuad2.toString());
        cuad2.displaySides();
        
        System.out.print(trian2.toString());
        trian2.displaySides();
    }
    
}
