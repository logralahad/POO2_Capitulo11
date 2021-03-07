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
public class School extends Building {
    
    private Integer salones;
    private String tipo;

    public School(Integer salones, String tipo, Integer pies_cuadrados, Integer pisos) {
        super(pies_cuadrados, pisos);
        this.salones = salones;
        this.tipo = tipo;
    }

    public Integer getSalones() {
        return salones;
    }

    public void setSalones(Integer salones) {
        this.salones = salones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String toString(){
        return String.format("Escuela %s\nNum. de salones: %d\nArea: %d ft^2\nPisos: %d\n", 
                this.tipo, this.salones, this.getPies_cuadrados(), this.getPisos());
    }
    
}
