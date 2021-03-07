/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author logra
 */
public class NonFiction extends Book{
    
    public static final Double PRECIO_FIC = 37.99;

    public NonFiction(String titulo) {
        super(titulo);
    }

    @Override
    public Double setPrecio() {
        return PRECIO_FIC;
    }
    
}
