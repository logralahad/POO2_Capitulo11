/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author logra
 */
public abstract class Insurance {
    
    private String tipo;
    private Double precio_mensual;

    public Insurance(String tipo) {
        this.tipo = tipo;
        setPrecio_mensual(obtenerCosto());
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPrecio_mensual() {
        return precio_mensual;
    }

    public void setPrecio_mensual(Double precio_mensual) {
        this.precio_mensual = precio_mensual;
    }
    
    public abstract Double obtenerCosto();

}
