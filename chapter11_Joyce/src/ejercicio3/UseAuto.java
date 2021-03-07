/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class UseAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ford auto = new Ford("Pepito");
        Chevy auto2 = new Chevy("Juan");
        
        System.out.println(String.format("Auto1\nFabrica: %s\nPrecio: $%d\n", auto.getFabricadora(), auto.getPrecio()));
        System.out.println(String.format("Auto2\nFabrica: %s\nPrecio: $%d\n", auto2.getFabricadora(), auto2.getPrecio()));
        
    }
    
}
