/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author logra
 */
public class Ford extends Auto {

    public Ford(String fabricadora) {
        super(fabricadora);
    }

    @Override
    public Integer obtenerCosto() {
        return 200000;
    }
    
}
