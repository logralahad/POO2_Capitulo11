/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author logra
 */
public class UseStudent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FullTime estudiante1 = new FullTime("Juan Perez");
        PartTime estudiante2 = new PartTime("Andrea Melisa");
        
        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());
    }
    
}
