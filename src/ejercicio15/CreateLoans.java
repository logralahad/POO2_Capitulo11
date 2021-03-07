/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.ArrayList;

/**
 *
 * @author logra
 */
public class CreateLoans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Loan> prestamos = new ArrayList<>();
        
        prestamos.add(new BusinessLoan(01, "Lopez", 50000, 1));
        prestamos.add(new PersonalLoan(02, "Hernandez", 500000, 3));
        prestamos.add(new BusinessLoan(03, "Perez", 99000, 4));
        prestamos.add(new PersonalLoan(04, "Cabrera", 56000, 5));
        
        for (Loan prestamo : prestamos) {
            System.out.println(prestamo.toString());
        }
        
    }
    
}
