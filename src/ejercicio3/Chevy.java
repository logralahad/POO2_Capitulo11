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
public class Chevy extends Auto {

    public Chevy(String fabricadora) {
        super(fabricadora);
    }

    @Override
    public Integer obtenerCosto() {
        return 150000;
    }
    
}
