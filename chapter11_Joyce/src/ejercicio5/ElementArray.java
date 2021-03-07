/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class ElementArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Element> elementos = new ArrayList<>();
        elementos.add(new MetalElement("H", 1, 1.0079));
        elementos.add(new NonMetalElement("C", 6, 12.011));
        elementos.add(new MetalElement("Cs", 55, 132.91));
        elementos.add(new NonMetalElement("P", 15, 30.974));
        
        for (Element elemento : elementos) {
            System.out.println(elemento.describeElement());
        }
    }
    
}
