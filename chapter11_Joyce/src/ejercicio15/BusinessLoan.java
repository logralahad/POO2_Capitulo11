/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

/**
 *
 * @author logra
 */
public class BusinessLoan extends Loan {
    
    public static final Double RATE = 0.01;
    
    private Double total;
    
    public BusinessLoan(Integer numero, String apellido_deudor, Integer prestamo, Integer termino) {
        super(numero, apellido_deudor, prestamo, termino);
        this.total = (getInteres() * getPrestamo()) + getPrestamo();
    }
    
    @Override
    public Double calcularInteres(){
        return RATE;
    }
    
    @Override
    public String toString(){
        String s1 = super.toString();
        return String.format("%sInteres: %.0f%%\nA pagar: $%.2f\n", s1, RATE * 100, total);
    }
}
