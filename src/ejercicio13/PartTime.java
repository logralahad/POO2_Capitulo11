/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13;

/**
 *
 * @author logra
 */
public class PartTime extends Student {
    
    public static final Integer COSTO = 200;

    public PartTime(String name) {
        super(name, false);
    }

    @Override
    public Integer obtenerTarifa() {
        return COSTO;
    }
    
    @Override
    public String toString(){
        return String.format("Nombre: %s\nTiempo completo: %b\nTarifa: $%d\n", this.getName(),
                this.getTiempo_completo(), this.obtenerTarifa());
    }
    
}