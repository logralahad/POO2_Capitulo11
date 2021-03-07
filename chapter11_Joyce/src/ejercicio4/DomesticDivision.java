/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class DomesticDivision extends Division {
    
    private String estado;

    public DomesticDivision(String nombre, Integer numero, String estado) {
        super(nombre, numero);
        this.estado = estado;
    }

    @Override
    public String display() {
        return String.format("Division %s %d\nEstado: %s\n", this.getNombre(),
                this.getNumero(), estado);
    }
    
}
