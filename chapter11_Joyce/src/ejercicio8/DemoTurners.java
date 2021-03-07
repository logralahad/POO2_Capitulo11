/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author logra
 */
public class DemoTurners {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Leaf hoja = new Leaf();
        Page libro = new Page();
        Pancake leches = new Pancake();
        
        hoja.turn();
        libro.turn();
        leches.turn();
    }
    
}
