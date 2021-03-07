/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author logra
 */
public class NonMetalElement extends Element {

    public NonMetalElement(String simbolo, Integer num_atomico, Double peso_atomico) {
        super(simbolo, num_atomico, peso_atomico);
    }

    @Override
    public String describeElement() {
        return String.format("No metal\nElemento: %s\nNumero atomico: %d\nMasa atomica: %.2f\n"
                + "Propiedades: pesimo conductor electrico.\n", 
                this.getSimbolo(), this.getNum_atomico(), this.getPeso_atomico());
    }
    
}
