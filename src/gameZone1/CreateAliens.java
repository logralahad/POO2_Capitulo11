/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameZone1;

/**
 *
 * @author logra
 */
public class CreateAliens {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Martian marciano = new Martian("Atsumu", 2, 150, "Asesino a sueldo");
        Jupiterian jupiteriano = new Jupiterian("Chronos", 6, 1200, "Dios antiguo");
        
        System.out.println(marciano.toString());
        System.out.println(jupiteriano.toString());
        
    }
    
}
