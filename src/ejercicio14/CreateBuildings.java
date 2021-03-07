/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author logra
 */
public class CreateBuildings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Building edificio = new Building(150, 4);
        House casa = new House(4, 3, 90, 2);
        School escuela = new School(10, "primaria", 120, 3);
        
        System.out.println(edificio.toString());
        System.out.println(casa.toString());
        System.out.println(escuela.toString());
        
        
    }
    
}
