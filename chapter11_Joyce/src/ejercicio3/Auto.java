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
public abstract class Auto {
    
    private String fabricadora;
    private Integer precio;

    public Auto(String fabricadora) {
        this.fabricadora = fabricadora;
        setPrecio(obtenerCosto());
    }
    

    public String getFabricadora() {
        return fabricadora;
    }

    public void setFabricadora(String fabricadora) {
        this.fabricadora = fabricadora;
    }

    public Integer getPrecio() {
        return precio;
    }
    
    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public abstract Integer obtenerCosto();
    
    
}
