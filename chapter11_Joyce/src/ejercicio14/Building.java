/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

/**
 *
 * @author logra
 */
public class Building {
    
    private Integer pies_cuadrados;
    private Integer pisos;

    public Building(Integer pies_cuadrados, Integer pisos) {
        this.pies_cuadrados = pies_cuadrados;
        this.pisos = pisos;
    }

    public Integer getPies_cuadrados() {
        return pies_cuadrados;
    }

    public void setPies_cuadrados(Integer pies_cuadrados) {
        this.pies_cuadrados = pies_cuadrados;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }
    
    @Override
    public String toString(){
        return String.format("Edificio\nArea: %d ft^2\nPisos: %d\n", this.pies_cuadrados, this.pisos);
    }
    
}
