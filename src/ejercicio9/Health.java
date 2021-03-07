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
public class Health extends Insurance {

    public Health() {
        super("Seguro de salud");
    }

    @Override
    public Double obtenerCosto() {
        return 196.00;
    }
    
    @Override
    public String toString(){
        return String.format("%s | Costo: $%.2f\n", this.getTipo(), this.getPrecio_mensual());
    }
    
}
