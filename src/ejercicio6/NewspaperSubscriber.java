/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author logra
 */
public abstract class NewspaperSubscriber {
    
    private String direccion_sub;
    private Double suscripcion;

    public NewspaperSubscriber(String direccion_sub) {
        this.direccion_sub = direccion_sub;
        setSuscripcion(obtenerPrecio());
    }

    public String getDireccion_sub() {
        return direccion_sub;
    }

    public void setDireccion_sub(String direccion_sub) {
        this.direccion_sub = direccion_sub;
    }

    public Double getSuscripcion() {
        return suscripcion;
    }

    public void setSuscripcion(Double suscripcion) {
        this.suscripcion = suscripcion;
    }
    
    public abstract Double obtenerPrecio();
    
}
