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
public abstract class GeometricFigure {
    
    private Integer altura;
    private Integer base;
    private String tipo;
    private Integer area;

    public GeometricFigure(Integer altura, Integer base, String tipo) {
        this.altura = altura;
        this.base = base;
        this.tipo = tipo;
        setArea(calcularArea());
    }

    public Integer getAltura() {
        return altura;
    }

    public Integer getBase() {
        return base;
    }

    public String getTipo() {
        return tipo;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }
    
    public abstract Integer calcularArea();
    
    public String toString(){
        return String.format("Tipo: %s\nBase: %d u\nAltura: %d u\nArea: %d u^2\n", 
                getTipo(), getBase(), getAltura(), getArea());
    }
}
