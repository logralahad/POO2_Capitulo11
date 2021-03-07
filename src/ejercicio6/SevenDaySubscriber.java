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
public class SevenDaySubscriber extends NewspaperSubscriber {

    public SevenDaySubscriber(String direccion_sub) {
        super(direccion_sub);
    }

    @Override
    public Double obtenerPrecio() {
        return 4.50;
    }
    
    @Override
    public String toString(){
        return String.format("Suscriptor semanal\nDireccion: %s\nPrecio: $%.2f\n", 
                this.getDireccion_sub(),this.getSuscripcion());
    }
}
