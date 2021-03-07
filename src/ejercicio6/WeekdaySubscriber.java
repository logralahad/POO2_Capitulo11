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
public class WeekdaySubscriber extends NewspaperSubscriber {

    public WeekdaySubscriber(String string) {
        super(string);
    }

    @Override
    public Double obtenerPrecio() {
        return 3.50;
    }
    
    @Override
    public String toString(){
        return String.format("Suscriptor diario\nDireccion: %s\nPrecio: $%.2f\n", 
                this.getDireccion_sub(),this.getSuscripcion());
    }
}
