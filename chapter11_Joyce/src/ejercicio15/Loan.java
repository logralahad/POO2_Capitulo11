/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author logra
 */
public class Loan implements LoanConstants{
    
    private Integer numero;
    private String apellido_deudor;
    private Integer prestamo;
    private Double interes;
    private Integer termino;

    public Loan(Integer numero, String apellido_deudor, Integer prestamo, Integer termino) {
        this.numero = numero;
        this.apellido_deudor = apellido_deudor;
        setPrestamo(prestamo);
        setTermino(termino);
        setInteres(calcularInteres());
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getApellido_deudor() {
        return apellido_deudor;
    }

    public void setApellido_deudor(String apellido_deudor) {
        this.apellido_deudor = apellido_deudor;
    }

    public Integer getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Integer prestamo) {
        if(prestamo > MAX_LOAN || prestamo < 1){
            Scanner sc = new Scanner(System.in);
            Integer nuevo_prestamo = Integer.MAX_VALUE;
            do {                
                System.out.println("Deudor " + this.apellido_deudor);
                System.out.println("Solo le podemos prestar hasta $100,000.");
                System.out.print("Digite nueva cantidad: $");
                nuevo_prestamo = sc.nextInt();
                System.out.println("");
            } while (nuevo_prestamo > MAX_LOAN || nuevo_prestamo < 1);
            this.prestamo = nuevo_prestamo;
        }
        else{
            this.prestamo = prestamo;
        }
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Integer getTermino() {
        return termino;
    }

    public void setTermino(Integer termino) {
        switch (termino) {
            case 1:
                this.termino = SHORT_TERM;
                break;
                
            case 3:
                this.termino = MEDIUM_TERM;
                break;
                
            case 5:
                this.termino = LONG_TERM;
                break;
                
            default:
                this.termino = SHORT_TERM;
                break;
        }
    }
    
    public Double calcularInteres(){
        return 0.00;
    }
    
    @Override
    public String toString(){
        return String.format("Deudor: %s\nPrestamo #%d\nCantidad: $%d\nPlazo: %d anios\n", 
                apellido_deudor, numero, prestamo, termino);
    }
}
