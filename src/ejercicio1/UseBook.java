/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author logra
 */
public class UseBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Fiction potter = new Fiction("Harry Potter");
        System.out.println(potter.toString());
        
        NonFiction rim = new NonFiction("Matematicas 1");
        System.out.println(rim.toString());
    }
    
}
