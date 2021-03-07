/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import ejercicio10.*;

/**
 *
 * @author logra
 */
public class Square2 extends GeometricFigure2 implements SidedObject{

    public Square2(Integer altura, Integer base) {
        super(altura, base, "Cuadrado");
    }

    @Override
    public Integer calcularArea() {
        return getAltura() * getBase();
    }
    
    @Override
    public void displaySides() {
        System.out.println("Lados: 4 lados\n");
    }
    
}
