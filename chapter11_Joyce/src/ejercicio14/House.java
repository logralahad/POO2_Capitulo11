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
public class House extends Building {
    
    private Integer cuartos;
    private Integer banios;

    public House(Integer cuartos, Integer banios, Integer pies_cuadrados, Integer pisos) {
        super(pies_cuadrados, pisos);
        this.cuartos = cuartos;
        this.banios = banios;
    }

    public Integer getCuartos() {
        return cuartos;
    }

    public void setCuartos(Integer cuartos) {
        this.cuartos = cuartos;
    }

    public Integer getBanios() {
        return banios;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }
    
    @Override
    public String toString(){
        return String.format("Casa\nNum. de cuartos: %d\nNum. de banios: %d\nArea: %d ft^2\nPisos: %d\n", 
                this.cuartos, this.banios, this.getPies_cuadrados(), this.getPisos());
    }
    
}
