/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author logra
 */
public class InternationalDivision extends Division {
    
    private String pais;
    private String idioma;

    public InternationalDivision(String nombre, Integer numero, String pais, String idioma) {
        super(nombre, numero);
        this.pais = pais;
        this.idioma = idioma;
    }


    @Override
    public String display() {
        return String.format("Division %s %d\nPais: %s\nIdioma: %s\n", this.getNombre(),
                this.getNumero(), pais, idioma);
    }
    
}
