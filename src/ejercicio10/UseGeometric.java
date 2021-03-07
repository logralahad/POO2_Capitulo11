/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author logra
 */
public class UseGeometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Square cuad1 = new Square(5, 5);
        Triangle trian1 = new Triangle(6, 8);
        
        Square cuad2 = new Square(3, 3);
        Triangle trian2 = new Triangle(7, 4);
        
        System.out.println(cuad1.toString());
        System.out.println(trian1.toString());
        System.out.println(cuad2.toString());
        System.out.println(trian2.toString());
    }
    
}
