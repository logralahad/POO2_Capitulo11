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
public abstract class Element {
    
    private String simbolo;
    private Integer num_atomico;
    private Double peso_atomico;

    public Element(String simbolo, Integer num_atomico, Double peso_atomico) {
        this.simbolo = simbolo;
        this.num_atomico = num_atomico;
        this.peso_atomico = peso_atomico;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public Integer getNum_atomico() {
        return num_atomico;
    }

    public Double getPeso_atomico() {
        return peso_atomico;
    }
    
    public abstract String describeElement();
}
