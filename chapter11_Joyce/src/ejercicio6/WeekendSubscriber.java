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
public class WeekendSubscriber extends NewspaperSubscriber {

    public WeekendSubscriber(String direccion_sub) {
        super(direccion_sub);
    }

    @Override
    public Double obtenerPrecio() {
        return 2.00;
    }
    
    @Override
    public String toString(){
        return String.format("Suscriptor de fin de semana\nDireccion: %s\nPrecio: $%.2f\n", 
                this.getDireccion_sub(),this.getSuscripcion());
    }
    
}
