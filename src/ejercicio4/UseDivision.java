/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class UseDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        InternationalDivision div1 = new InternationalDivision("EZLN", 101, "Francia", "Frances");
        DomesticDivision div2 = new DomesticDivision("PPOA", 302, "Oaxaca");
        
        System.out.println(div1.display());
        System.out.println(div2.display());
   
    }
    
}
