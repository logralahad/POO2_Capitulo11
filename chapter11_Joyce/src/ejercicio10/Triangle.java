/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author logra
 */
public class Triangle extends GeometricFigure{

    public Triangle(Integer altura, Integer base) {
        super(altura, base, "Triangulo");
    }

    @Override
    public Integer calcularArea() {
        return getAltura() * getBase() / 2;
    }
    
}
